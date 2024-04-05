package model.myExceptions;

public class NumberPhoneCorrectedException extends IllegalArgumentException{
    public NumberPhoneCorrectedException() {
        super("Номер телефона должен быть числом!");
    }
}
