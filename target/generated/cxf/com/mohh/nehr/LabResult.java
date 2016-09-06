
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
 *         &lt;element name="labInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labFacilityUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.mohh.com/nehr}order" minOccurs="0"/>
 *         &lt;element ref="{http://www.mohh.com/nehr}investigationType"/>
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
    "labInstitution",
    "labFacilityUnit",
    "accessionNumber",
    "eventID",
    "order",
    "investigationType"
})
@XmlRootElement(name = "labResult")
public class LabResult {

    protected String labInstitution;
    protected String labFacilityUnit;
    @XmlElement(required = true)
    protected String accessionNumber;
    protected String eventID;
    protected Order order;
    @XmlElement(required = true)
    protected InvestigationType investigationType;

    /**
     * Gets the value of the labInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabInstitution() {
        return labInstitution;
    }

    /**
     * Sets the value of the labInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabInstitution(String value) {
        this.labInstitution = value;
    }

    /**
     * Gets the value of the labFacilityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabFacilityUnit() {
        return labFacilityUnit;
    }

    /**
     * Sets the value of the labFacilityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabFacilityUnit(String value) {
        this.labFacilityUnit = value;
    }

    /**
     * Gets the value of the accessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionNumber() {
        return accessionNumber;
    }

    /**
     * Sets the value of the accessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionNumber(String value) {
        this.accessionNumber = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the investigationType property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationType }
     *     
     */
    public InvestigationType getInvestigationType() {
        return investigationType;
    }

    /**
     * Sets the value of the investigationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationType }
     *     
     */
    public void setInvestigationType(InvestigationType value) {
        this.investigationType = value;
    }

}
