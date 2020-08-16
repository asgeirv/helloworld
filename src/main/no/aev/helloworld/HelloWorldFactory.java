package no.aev.helloworld;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldFactory {

    private final List<StringProvider> providers = new ArrayList<>();

    public HelloWorldFactory() {
        providers.add(new HelloProvider());
        providers.add(new CommaProvider());
        providers.add(new SpaceProvider());
        providers.add(new WorldProvider());
        providers.add(new ExclamationPointProvider());
    }

    public String create() {
        final StringBuilder builder = new StringBuilder();

        for (final StringProvider provider : providers) {
            builder.append(provider.get());
        }

        return builder.toString();
    }
}
