package HomeWork11;
/*Цветочница. Определить иерархию цветов. Создать несколько объектов-
цветов. Собрать букет (используя аксессуары) с определением его стоимо-
сти. Провести сортировку цветов в букете на основе уровня свежести. Найти
цветок в букете, соответствующий заданному диапазону длин стеблей.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlowerFactory {

    public static void main(String[] args) {

        Rose rose1 = new Rose("Роза Красная", "red", 6, 4, 70);
        Rose rose2 = new Rose("Роза Белая", "White", 7, 2, 60);
        Rose rose3 = new Rose("Роза Белая", "White", 7, 2, 50);
        Tulip tulip1 = new Tulip("Тюльпан Красный", " red", 4, 3, 40);
        Tulip tulip2 = new Tulip("Тюльпан Желтый", " Yellow", 4, 3, 30);
        Chamomile chamomile = new Chamomile("Ромашка", "White", 2, 6, 20);

        Accessory card = new Accessory("Открытка", 2.5);
        Accessory tape = new Accessory("Лента упаковочная", .5);
        Accessory boxing = new Accessory("Пленка упаковочная", 1.5);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose1).addFlower(rose2)
                .addFlower(rose3).addFlower(chamomile)
                .addFlower(chamomile).addFlower(tulip1)
                .addFlower(tulip1).addAccessory(card)
                .addAccessory(tape).addAccessory(boxing);


        bouquet.printBouquet();
        System.out.println();

        System.out.println();
        bouquet.sortBouquet();

        System.out.println();
        bouquet.findStemLength(40,60);
    }
}

abstract class Flower {

    private String name;
    private String color;
    private double price;

    private int dayOfLife;
    private double stemLength;

    @Override
    public String toString() {
        return name + " (длина стебля " + stemLength + " см.)" + ", свежесть " + dayOfLife + " сутки(ок).";
    }

    public Flower(String name, String color, double price, int dayOfLife, int stemLength) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.dayOfLife = dayOfLife;
        this.stemLength = stemLength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDayOfLife() {
        return dayOfLife;
    }

    public void setDayOfLife(int dayOfLife) {
        this.dayOfLife = dayOfLife;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setDiscountFactor(double stemLength) {
        this.stemLength = stemLength;
    }


}

class Rose extends Flower {


    public Rose(String name, String color, double price, int dayOfLife, int stemLength) {
        super(name, color, price, dayOfLife, stemLength);
    }
}

class Tulip extends Flower {

    public Tulip(String name, String color, double price, int dayOfLife, int stemLength) {
        super(name, color, price, dayOfLife, stemLength);
    }
}

class Chamomile extends Flower {
    public Chamomile(String name, String color, double price, int dayOfLife, int stemLength) {
        super(name, color, price, dayOfLife, stemLength);
    }
}

class Accessory {
    private String name;
    private double price;

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bouquet {
    private double price;

    List<Object> bouquetFlowers = new ArrayList<>();
    List<Object> freshFlowers;

    public Bouquet addFlower(Flower flower) {
        bouquetFlowers.add(flower);
        price += flower.getPrice();
        return this;
    }

    public Bouquet addAccessory(Accessory accessory) {
        bouquetFlowers.add(accessory);
        price += accessory.getPrice();
        return this;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void sortBouquet() {

        freshFlowers = new ArrayList<>();
        for (int i = 0; i < bouquetFlowers.size(); i++) {

            if (bouquetFlowers.get(i) instanceof Flower) {
                freshFlowers.add(bouquetFlowers.get(i));

            }
        }

        class MaxDayOfLifeComparator implements Comparator<Flower> {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getDayOfLife() - o2.getDayOfLife();
            }
        }

        Comparator dayOfLifeComparator = new MaxDayOfLifeComparator();
        Collections.sort(freshFlowers, dayOfLifeComparator);


        System.out.println("Сортировка цветов в букете на основе уровня свежести:");
        System.out.println();
        for (Object obj : freshFlowers) {
            System.out.println(obj);
        }


    }

    public void printBouquet() {
        System.out.println("Букет состоит из: ");
        for (Object obj : bouquetFlowers) {
            System.out.println(obj);
        }
        System.out.println("-----------------------");
        System.out.println("Стоимость букета" + " - " + price + " руб.");
    }

    public void findStemLength(int minLength, int maxLength) {
        System.out.println("Цветок в букете, соответствующий заданному диапазону длин стеблей: ");
        for (Object obj : freshFlowers) {
            Flower fl = (Flower) obj;
if(fl.getStemLength()>=minLength & fl.getStemLength()<=maxLength)
    System.out.println(fl.getName()+" "+fl.getStemLength()+" см.");
        }
    }
}