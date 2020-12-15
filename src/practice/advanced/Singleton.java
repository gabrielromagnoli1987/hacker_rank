package practice.advanced;

public class Singleton {

    // https://en.wikipedia.org/wiki/Singleton_pattern

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public String str;

    public static Singleton getSingleInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = "Hello";
        System.out.println(singleton.str);
    }
}
