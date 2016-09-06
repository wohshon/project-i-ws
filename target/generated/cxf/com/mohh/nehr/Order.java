
package com.mohh.nehr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="orderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonForInvestigation" type="{http://www.mohh.com/nehr}codedValueType" minOccurs="0"/>
 *         &lt;element name="orderedBy" type="{http://www.mohh.com/nehr}clinicianType" minOccurs="0"/>
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
    "orderDateTime",
    "orderNo",
    "orderInstitution",
    "reasonForInvestigation",
    "orderedBy"
})
@XmlRootElement(name = "order")
public class Order {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDateTime;
    protected String orderNo;
    protected String orderInstitution;
    protected CodedValueType reasonForInvestigation;
    protected ClinicianType orderedBy;

    /**
     * Gets the value of the orderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDateTime() {
        return orderDateTime;
    }

    /**
     * Sets the value of the orderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDateTime(XMLGregorianCalendar value) {
        this.orderDateTime = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the orderInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInstitution() {
        return orderInstitution;
    }

    /**
     * Sets the value of the orderInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInstitution(String value) {
        this.orderInstitution = value;
    }

    /**
     * Gets the value of the reasonForInvestigation property.
     * 
     * @return
     *     possible object is
     *     {@link CodedValueType }
     *     
     */
    public CodedValueType getReasonForInvestigation() {
        return reasonForInvestigation;
    }

    /**
     * Sets the value of the reasonForInvestigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedValueType }
     *     
     */
    public void setReasonForInvestigation(CodedValueType value) {
        this.reasonForInvestigation = value;
    }

    /**
     * Gets the value of the orderedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicianType }
     *     
     */
    public ClinicianType getOrderedBy() {
        return orderedBy;
    }

    /**
     * Sets the value of the orderedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicianType }
     *     
     */
    public void setOrderedBy(ClinicianType value) {
        this.orderedBy = value;
    }

}
