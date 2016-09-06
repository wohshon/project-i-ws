
package com.mohh.nehr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for controlHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="srcApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgSequenceID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlHeaderType", propOrder = {
    "srcInstitution",
    "srcApplication",
    "msgID",
    "msgSequenceID",
    "msgDateTime"
})
public class ControlHeaderType {

    @XmlElement(required = true)
    protected String srcInstitution;
    @XmlElement(required = true)
    protected String srcApplication;
    @XmlElement(required = true)
    protected String msgID;
    protected long msgSequenceID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgDateTime;

    /**
     * Gets the value of the srcInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcInstitution() {
        return srcInstitution;
    }

    /**
     * Sets the value of the srcInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcInstitution(String value) {
        this.srcInstitution = value;
    }

    /**
     * Gets the value of the srcApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcApplication() {
        return srcApplication;
    }

    /**
     * Sets the value of the srcApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcApplication(String value) {
        this.srcApplication = value;
    }

    /**
     * Gets the value of the msgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgID() {
        return msgID;
    }

    /**
     * Sets the value of the msgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgID(String value) {
        this.msgID = value;
    }

    /**
     * Gets the value of the msgSequenceID property.
     * 
     */
    public long getMsgSequenceID() {
        return msgSequenceID;
    }

    /**
     * Sets the value of the msgSequenceID property.
     * 
     */
    public void setMsgSequenceID(long value) {
        this.msgSequenceID = value;
    }

    /**
     * Gets the value of the msgDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgDateTime() {
        return msgDateTime;
    }

    /**
     * Sets the value of the msgDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgDateTime(XMLGregorianCalendar value) {
        this.msgDateTime = value;
    }

}
