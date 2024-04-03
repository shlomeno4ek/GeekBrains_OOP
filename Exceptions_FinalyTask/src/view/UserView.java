package view;

import controller.UserController;

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
        System.out.println("Все данные должны быть разделены пробелами, а пол одно значение из двух: f или m");
        data = scanner.nextLine();
    }


    public void start() {

        promt();
        String[] arr = data.split(" ");
        try {
            uc.arraySizeIsCorrect(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            promt();
        }
        System.out.println(Arrays.toString(arr));

//        if(arr.length != 6)

        String gender = arr[5];
        if(!gender.equals("m") && !gender.equals("f")) {

        }


        System.out.println("Hello world!");
    }

}
