package pl.surreal.dropwizard.dropwizardsoap.ws;

import com.codahale.metrics.annotation.Metered;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectCreateResponse;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectParameter;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectParameters;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@WebService
public class ObjectWSImpl implements ObjectWS {
    @Override
    @WebMethod(operationName ="createObject")
    @Metered
    public ObjectCreateResponse createObject(String name, String note, ObjectParameters parameters) {
        int randObjectID = ThreadLocalRandom.current().nextInt(1,100);
        return new ObjectCreateResponse(200,randObjectID);
    }
}
