package pl.surreal.dropwizard.dropwizardsoap.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by mikolaj.stefaniak on 12/04/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectCreateResponse {
    @XmlElement(required = true)
    private Integer responseCode;
    @XmlElement(required = false)
    private Integer objectID;

    public ObjectCreateResponse() {
    }

    public ObjectCreateResponse(Integer responseCode, Integer objectID) {
        this.responseCode = responseCode;
        this.objectID = objectID;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getObjectID() {
        return objectID;
    }

    public void setObjectID(Integer objectID) {
        this.objectID = objectID;
    }
}
