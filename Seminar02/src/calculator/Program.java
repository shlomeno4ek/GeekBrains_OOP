package calculator;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculete("*", 5, 6));
    }
}


class Calculator {
    Map<String ,Calculable> map = new HashMap<>();

    public Calculator() {
        fill();
    }

    private void fill() {
        map.put("+", new Addition());
        map.put("-", (args) -> (args[0] - args[1]));
        map.put("*", (args) -> (args[0] * args[1]));

        Calculable calculable = args -> args[0] / args[1];

//        Calculable calculable = new Calculable() {
//            @Override
//            public double calculate(String operation, double... args) {
//                return 0;
//            }
//        };
//        Calculable calculable = (operation, args) -> map.get(operation).calculate(operation,args[0],args[1]);

    }

    public double add(int a, int b){
        return a + b;
    }

    public double substract(int a, int b) {
        return  a - b;
    }

    public double mult(int a, int b) {
        return  a * b;
    }

    public double calculete(String operator, int a, int b) {
        return map.get(operator).calculate(a, b);
    }

    class Addition implements  Calculable {

        @Override
        public double calculate(double ... args) {
            if (args.length < 2) {
                throw  new RuntimeException("Мало аргументов");
            }
            return args[0] + args[1];
        }
    }

    interface Calculable {
        double calculate(double ... args);
    }

    interface Foo {
        double plus(int a, int b);
        double minus(int a, int b);
    }
}