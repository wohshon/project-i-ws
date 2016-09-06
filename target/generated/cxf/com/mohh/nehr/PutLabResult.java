
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
 *         &lt;element ref="{http://www.mohh.com/nehr}patient"/>
 *         &lt;element ref="{http://www.mohh.com/nehr}labResult"/>
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
    "patient",
    "labResult"
})
@XmlRootElement(name = "putLabResult")
public class PutLabResult {

    @XmlElement(required = true)
    protected ControlHeaderType controlHeader;
    @XmlElement(required = true)
    protected Patient patient;
    @XmlElement(required = true)
    protected LabResult labResult;

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
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the labResult property.
     * 
     * @return
     *     possible object is
     *     {@link LabResult }
     *     
     */
    public LabResult getLabResult() {
        return labResult;
    }

    /**
     * Sets the value of the labResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabResult }
     *     
     */
    public void setLabResult(LabResult value) {
        this.labResult = value;
    }

}
