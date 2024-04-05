package model.myExceptions;

public class BirthdayCorrectedException extends IllegalArgumentException{
    public BirthdayCorrectedException() {
        super("Неверный формат даты рождения!");
    }
}
