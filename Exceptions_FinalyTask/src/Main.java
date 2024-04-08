import view.UserView;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Ivanov Ivan Ivanovich 12.12.1212 123456789 m
//        Ivanov Petr Ivanovich 12.12.1212 123456789 m
//        Petrov Ivan Ivanovich 12.12.1212 123456789 m
//        Petrov Petr Ivanovich 12.12.1212 123456789 m

        UserView uv = new UserView();
        uv.start();
    }
}