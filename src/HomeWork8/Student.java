package HomeWork8;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private String telephone;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String patronymic, String dateOfBirth, String address, String telephone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Студент: " +
                "id=" + id +
                ", Фамилия:" + surname + " " +
                ", Имя: " + name + " " +
                ", Отчество: " + patronymic + " " +
                ", Дата рождения: " + dateOfBirth + " " +
                ", Адрес: " + address + " " +
                ", Телефон: " + telephone + " " +
                ", Факльтет: " + faculty + " " +
                ", Курс: " + course +
                ", Группа: " + group + " " ;
    }
}




