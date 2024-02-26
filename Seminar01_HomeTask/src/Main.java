import Clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Пёс", 10, LocalDate.now(), new Owner());
        dog.toGo();
        dog.fly();
        dog.swim();
        Duck duck = new Duck("Утка", 2, LocalDate.now(), new Owner());
        duck.toGo();
        duck.fly();
        duck.swim();
        Hummingbird bird = new Hummingbird("Птичка", 0.007, LocalDate.now(), new Owner());
        bird.toGo();
        bird.fly();
        bird.swim();
        Lion lion = new Lion("Лев", 190, LocalDate.now(), new Owner());
        lion.toGo();
        lion.fly();
        lion.swim();
        Snake snake = new Snake("Змея", 5, LocalDate.now(), new Owner());
        snake.toGo();
        snake.fly();
        snake.swim();
    }
}