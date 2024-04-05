package model.myExceptions;

public class MaleIsCorrectedException extends IllegalArgumentException{
    public MaleIsCorrectedException() {
        super("Неверный формат пола!");
    }
}
