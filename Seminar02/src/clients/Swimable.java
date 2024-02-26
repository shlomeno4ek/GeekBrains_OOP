package clients;

@FunctionalInterface
public interface Swimable {
    public static final double pi = 3.1415;
    void swim();

    default void sound(){
        System.out.println("Я дефолтный метод");
    }
}
