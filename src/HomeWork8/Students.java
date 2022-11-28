package HomeWork8;

import java.util.ArrayList;
import java.util.Arrays;


public class Students {

    public static void main(String[] args) {

        Student students1 = new Student(1, "Иванов", "Иван", "Иванович", "01.01.1995", " Фрунзе 32", "+375333245171", "Финансы и кредит", 2, "ЗФ-28");
        Student students2 = new Student(2, "Петров", "Петр", "Петрович", "23.12.1991", "Воинов 12", "+375333245170", "Экономический", 3, "ЗКТ-35");
        Student students3 = new Student(3, "Стахов", "Игорь", "Васильевич", "12.05.1990", "Ленина 75", "+375335471985", "Экономический", 1, "ЗКТ-14");
        Student students4 = new Student(4, "Бакин", "Станислав", "Петрович", "02.04.1991", "Чкалова 25", "+375335962514", "Программирование", 4, "ПК-43");
        Student students5 = new Student(5, "Басалай", "Александр", "Игоревич", "20.06.1988", "Победы 6", "+375334592518", "Математический", 3, "МТ-33");

        ArrayList<Student> students = new ArrayList<>();
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students4);
        students.add(students5);


        System.out.print("Список студентов экономического курса: ");
        for (Student student : students) {
            if (student.getFaculty().equals("Экономический"))
                System.out.print(student.getSurname() + " " + student.getSurname() + " " + student.getPatronymic());
            System.out.println();
        }
        System.out.println("Список студентов для каждого факультета и курса: ");
        for (Student student : students) {
            for (int i = 1; i < 6; i++) {
                if (student.getCourse() == i && student.getFaculty().equals("Экономический"))
                    System.out.println(student.getSurname() + " " + student.getSurname() + " " + student.getPatronymic() + " " + student.getFaculty() + " факультет" + " " + student.getCourse() + " курс");
            }

        }
        System.out.println();
        System.out.println("Список студентов, родившихся после 1990 года: ");
        for (Student student : students) {
            String[] temp = student.getDateOfBirth().split("\\.");
            if (Integer.parseInt(temp[2]) > 1990)
                System.out.println(student.getSurname() + " " + student.getSurname() + " " + student.getPatronymic() + " " + student.getFaculty() + " факультет" + " " + student.getCourse() + " курс");
        }
        System.out.println();
        System.out.println("Список учебной группы ЗКТ-35");
        for (Student student : students) {
            if (student.getGroup()=="ЗКТ-35")
            System.out.println(student);
        }

    }

}



