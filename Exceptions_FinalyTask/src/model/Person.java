package model;

public class Person {
    private final String surname;
    private final String name;
    private final String secondName;
    private final String birthday;
    private final int telNumber;
    private final char male;

    public Person(String surname, String name, String secondName, String birthday, int telNumber, char male) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.male = male;
    }


    public Person(String[] arr) {
        this.surname = arr[0];
        this.name = arr[1];
        this.secondName = arr[2];
        this.birthday = arr[3];
        this.telNumber = Integer.parseInt(arr[4]);
        this.male = arr[5].charAt(0);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondname() {
        return secondName;
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

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%d><%c>", surname,name,secondName,birthday,telNumber,male);
    }
}
