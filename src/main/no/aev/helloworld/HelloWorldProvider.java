package no.aev.helloworld;

public class HelloWorldProvider {

    private static final HelloWorldFactory HELLO_WORLD_FACTORY = new HelloWorldFactory();

    // Shouldn't make instances of this class
    private HelloWorldProvider() {
    }

    public static String get() {
        return HELLO_WORLD_FACTORY.create();
    }
}
