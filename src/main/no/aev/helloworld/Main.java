package no.aev.helloworld;

public class Main {

    public static void main(String[] args) {
        final HelloWorldProvider helloWorldProvider = new HelloWorldProvider();
        StringPrinter.print(helloWorldProvider.get());
    }
}
