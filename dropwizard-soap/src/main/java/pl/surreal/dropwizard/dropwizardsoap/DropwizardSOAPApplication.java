package pl.surreal.dropwizard.dropwizardsoap;

import com.roskart.dropwizard.jaxws.EndpointBuilder;
import com.roskart.dropwizard.jaxws.JAXWSBundle;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import pl.surreal.dropwizard.dropwizardsoap.ws.ObjectWSImpl;
import pl.surreal.dropwizard.dropwizardsoap.ws.SimpleWS;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
public class DropwizardSOAPApplication extends Application<DropwizardSOAPConfiguration>
{
    private JAXWSBundle jaxWsBundle = new JAXWSBundle("/ws");

    @Override
    public String getName() {
        return "dropwizard-soap";
    }

    @Override
    public void initialize(Bootstrap<DropwizardSOAPConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );
        bootstrap.addBundle(jaxWsBundle);
    }

    @Override
    public void run(DropwizardSOAPConfiguration dropwizardSOAPConfiguration, Environment environment) throws Exception {
        jaxWsBundle.publishEndpoint(
                new EndpointBuilder("/simple", new SimpleWS()));

        jaxWsBundle.publishEndpoint(
                new EndpointBuilder("/object", new ObjectWSImpl()));
    }

    public static void main(String[]args) throws Exception {
        new DropwizardSOAPApplication().run(args);
    }
}
