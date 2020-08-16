package no.aev.helloworld;

public class HelloWorldProvider {

    private HelloWorldFactory helloWorldFactory;

    public HelloWorldProvider() {
        helloWorldFactory = new HelloWorldFactory();
    }

    public String get() {
        return helloWorldFactory.create();
    }
}
