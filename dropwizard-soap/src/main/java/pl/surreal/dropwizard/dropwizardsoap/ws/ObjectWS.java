package pl.surreal.dropwizard.dropwizardsoap.ws;

import com.codahale.metrics.annotation.Metered;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectCreateResponse;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectParameter;
import pl.surreal.dropwizard.dropwizardsoap.ws.types.ObjectParameters;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@WebService
public interface ObjectWS {
    @WebMethod(operationName="createObject")
    @Metered
    public @XmlElement(name="createObjectResponse",required = true) ObjectCreateResponse createObject(
            @XmlElement(name="name",required = true) String name,
            @XmlElement(name="note",required = false) String note,
            @XmlElement(name="parameters",required = true) ObjectParameters parameters
    );
}
