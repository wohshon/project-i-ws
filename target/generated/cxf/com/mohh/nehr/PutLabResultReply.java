
package com.mohh.nehr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlHeader" type="{http://www.mohh.com/nehr}controlHeaderType"/>
 *         &lt;element name="resultStatus" type="{http://www.mohh.com/nehr}resultStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "controlHeader",
    "resultStatus"
})
@XmlRootElement(name = "putLabResult_Reply")
public class PutLabResultReply {

    @XmlElement(required = true)
    protected ControlHeaderType controlHeader;
    @XmlElement(required = true)
    protected ResultStatusType resultStatus;

    /**
     * Gets the value of the controlHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ControlHeaderType }
     *     
     */
    public ControlHeaderType getControlHeader() {
        return controlHeader;
    }

    /**
     * Sets the value of the controlHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlHeaderType }
     *     
     */
    public void setControlHeader(ControlHeaderType value) {
        this.controlHeader = value;
    }

    /**
     * Gets the value of the resultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatusType }
     *     
     */
    public ResultStatusType getResultStatus() {
        return resultStatus;
    }

    /**
     * Sets the value of the resultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatusType }
     *     
     */
    public void setResultStatus(ResultStatusType value) {
        this.resultStatus = value;
    }

}
