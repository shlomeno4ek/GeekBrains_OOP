package view;

import controller.UserController;
import model.Person;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {

    private Scanner scanner;
    private UserController uc;

    private String data;

    public UserView() {
        scanner = new Scanner(System.in);
        uc = new UserController();
        data = "";
    }

    private void promt() {
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
        System.out.println("Все данные должны быть разделены пробелами, дата рождения в формате дд.мм.гггг, пол - одно значение из f или m");
        data = scanner.nextLine();
    }


    public void start() {

        promt();
        String[] arr = data.split(" ");
//        System.out.println(Arrays.toString(arr));
        try {
            uc.arraySizeIsCorrect(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            start();
        }

        try {
            uc.birthdayIsCorrected(arr[3]);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            start();
        }

        try {
            uc.numberPhoneIsCorrected(arr[4]);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            start();
        }

        try {
            uc.maleIsCorrected(arr[5]);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            start();
        }

        uc.savePerson(new Person(arr));









    }

}
