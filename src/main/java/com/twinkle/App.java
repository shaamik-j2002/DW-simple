package com.twinkle;

import com.twinkle.health.HelloHealthCheck;
import com.twinkle.resources.HelloResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class App extends Application<AppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "true";
    }

    @Override
    public void initialize(final Bootstrap<AppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final AppConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application

        //register resources here
        environment.jersey().register(new HelloResource());

        //register healthchecks here
        environment.healthChecks().register("hello", new HelloHealthCheck());
    }
}
