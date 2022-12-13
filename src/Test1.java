import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    /* Студенты нескольких групп сдают экзамен по одному предмету, который оценивается по шкале от 1 до 10.
    Вывести список студентов и их оценок для выбранной группы с сортировкой по фамилиям; по оценкам.
    После списка группы вывести статистику (количество студентов, получивших 10 баллов, 9 баллов и т.д.;
    среднюю успеваемость по выбранной группе). */

    static List<Student> students = new ArrayList<>();


    public static void main(String[] args) {

        Student student1 = new Student("Иванов", "Иван", 5, "Финансы и кредит");
        Student student2 = new Student("Стахов", "Петр", 4, "Экономический");
        Student student3 = new Student("Еремеев", "Петр", 4, "Экономический");
        Student student4 = new Student("Петров", "Игорь", 3, "Экономический");
        Student student5 = new Student("Бакин", "Станислав", 10, "Программирование");
        Student student6 = new Student("Басалай", "Александр", 5, "Математический");
        Student student7 = new Student("Агафонов", "Александр", 10, "Экономический");


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        sortSurnameGroup("Экономический");

    }

    public static class Student {
        private String surname;
        private String name;
        private String group;
        private int rating;

        public void printSurname() {
            System.out.println(this.group + " " + this.surname + " " + this.rating + " баллов");
        }

        public Student(String surname, String name, int rating, String group) {
            this.surname = surname;
            this.name = name;
            this.rating = rating;
            this.group = group;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "surname='" + surname + '\'' +
                    ", rating=" + rating +
                    '}';
        }
    }

    public static void sortSurnameGroup(String group) {
        List<Student> studentSortGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group))
                studentSortGroup.add(student);
        }
        System.out.println("Сортировка по фамилии заданной группы: ");
        studentSortGroup.stream().sorted(Comparator.comparing(Student::getSurname))
                .forEach(Student::printSurname);

        System.out.println();

        System.out.println("Сортировка по оценке заданной группы: ");
        studentSortGroup.stream().sorted(Comparator.comparing(Student::getRating))
                .forEach(Student::printSurname);

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int count = 0;
            boolean flag = false;
            for (Student student : studentSortGroup) {
                if (student.getRating() == i) {
                    count++;
                    flag = true;
                }
            }
            if (flag == true) {
                System.out.println("Получили оценку " + i + " балл(ов) " + count + " студент(ов).");
            }
        }
        System.out.println();
        int sumBalls = 0;
        for (Student student : studentSortGroup) {
            sumBalls += student.rating;
        }
        System.out.println("Средняя успеваемость по группе: "+(double)sumBalls/studentSortGroup.size());

    }

}