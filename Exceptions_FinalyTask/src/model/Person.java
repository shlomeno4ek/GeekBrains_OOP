package model;

public class Person {
    private String surname;
    private String name;
    private String secondname;
    private String birthday;
    private int telNumber;
    private char male;

    public Person(String surname, String name, String secondname, String birthday, int telNumber, char male) {
        this.surname = surname;
        this.name = name;
        this.secondname = secondname;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.male = male;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public char getMale() {
        return male;
    }
}
