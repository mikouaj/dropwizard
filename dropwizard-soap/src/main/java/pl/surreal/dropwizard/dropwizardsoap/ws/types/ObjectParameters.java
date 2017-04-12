package pl.surreal.dropwizard.dropwizardsoap.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectParameters {
    @XmlElement(name="parameter",required = false)
    private List<ObjectParameter> objectParameters = new ArrayList<>();

    public ObjectParameters() {
    }

    public List<ObjectParameter> getObjectParameters() {
        return objectParameters;
    }

    public void setObjectParameters(List<ObjectParameter> objectParameters) {
        this.objectParameters = objectParameters;
    }
}
