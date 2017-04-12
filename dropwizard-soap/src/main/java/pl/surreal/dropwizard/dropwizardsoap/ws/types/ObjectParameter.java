package pl.surreal.dropwizard.dropwizardsoap.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectParameter {
    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private String value;

    public ObjectParameter() {
    }

    public ObjectParameter(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
