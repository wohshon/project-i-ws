
package com.mohh.nehr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="specimenCollectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="specimenReceivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examinationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="textValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reportedBy" type="{http://www.mohh.com/nehr}clinicianType" minOccurs="0"/>
 *         &lt;element name="abnormalFlag" type="{http://www.mohh.com/nehr}codedValueType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;element name="resultStatus" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;element ref="{http://www.mohh.com/nehr}investigationItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "specimenCollectedDate",
    "specimenReceivedDate",
    "comments",
    "examinationDate",
    "textValue",
    "reportDateTime",
    "reportedBy",
    "abnormalFlag",
    "name",
    "resultStatus",
    "investigationItem"
})
@XmlRootElement(name = "investigation")
public class Investigation {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specimenCollectedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specimenReceivedDate;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationDate;
    protected String textValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    protected ClinicianType reportedBy;
    protected CodedValueType abnormalFlag;
    @XmlElement(required = true)
    protected CodedValueType name;
    @XmlElement(required = true)
    protected CodedValueType resultStatus;
    protected List<InvestigationItem> investigationItem;

    /**
     * Gets the value of the specimenCollectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecimenCollectedDate() {
        return specimenCollectedDate;
    }

    /**
     * Sets the value of the specimenCollectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecimenCollectedDate(XMLGregorianCalendar value) {
        this.specimenCollectedDate = value;
    }

    /**
     * Gets the value of the specimenReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecimenReceivedDate() {
        return specimenReceivedDate;
    }

    /**
     * Sets the value of the specimenReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecimenReceivedDate(XMLGregorianCalendar value) {
        this.specimenReceivedDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the examinationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationDate() {
        return examinationDate;
    }

    /**
     * Sets the value of the examinationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationDate(XMLGregorianCalendar value) {
        this.examinationDate = value;
    }

    /**
     * Gets the value of the textValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * Sets the value of the textValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextValue(String value) {
        this.textValue = value;
    }

    /**
     * Gets the value of the reportDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * Sets the value of the reportDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * Gets the value of the reportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicianType }
     *     
     */
    public ClinicianType getReportedBy() {
        return reportedBy;
    }

    /**
     * Sets the value of the reportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicianType }
     *     
     */
    public void setReportedBy(ClinicianType value) {
        this.reportedBy = value;
    }

    /**
     * Gets the value of the abnormalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CodedValueType }
     *     
     */
    public CodedValueType getAbnormalFlag() {
        return abnormalFlag;
    }

    /**
     * Sets the value of the abnormalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedValueType }
     *     
     */
    public void setAbnormalFlag(CodedValueType value) {
        this.abnormalFlag = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodedValueType }
     *     
     */
    public CodedValueType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedValueType }
     *     
     */
    public void setName(CodedValueType value) {
        this.name = value;
    }

    /**
     * Gets the value of the resultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodedValueType }
     *     
     */
    public CodedValueType getResultStatus() {
        return resultStatus;
    }

    /**
     * Sets the value of the resultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedValueType }
     *     
     */
    public void setResultStatus(CodedValueType value) {
        this.resultStatus = value;
    }

    /**
     * Gets the value of the investigationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investigationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestigationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationItem }
     * 
     * 
     */
    public List<InvestigationItem> getInvestigationItem() {
        if (investigationItem == null) {
            investigationItem = new ArrayList<InvestigationItem>();
        }
        return this.investigationItem;
    }

}
