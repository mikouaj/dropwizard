package pl.surreal.dropwizard.dropwizardsoap.ws;

import com.codahale.metrics.annotation.Metered;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.Calendar;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@WebService
public class SimpleWS
{
    @WebMethod
    @Metered
    public @XmlElement(name="outputMessage",required = true) String echo(@WebParam(name = "inputMessage") @XmlElement(required = true) String input) {
        return Calendar.getInstance().getTime().toString()+" "+input;
    }
}