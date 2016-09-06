
package com.mohh.nehr;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="name" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.mohh.com/nehr}investigationSubType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.mohh.com/nehr}investigation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
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
    "name",
    "investigationSubType",
    "investigation"
})
@XmlRootElement(name = "investigationType")
public class InvestigationType {

    @XmlElement(required = true)
    protected CodedValueType name;
    protected List<InvestigationSubType> investigationSubType;
    protected List<Investigation> investigation;

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
     * Gets the value of the investigationSubType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investigationSubType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestigationSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationSubType }
     * 
     * 
     */
    public List<InvestigationSubType> getInvestigationSubType() {
        if (investigationSubType == null) {
            investigationSubType = new ArrayList<InvestigationSubType>();
        }
        return this.investigationSubType;
    }

    /**
     * Gets the value of the investigation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investigation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestigation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Investigation }
     * 
     * 
     */
    public List<Investigation> getInvestigation() {
        if (investigation == null) {
            investigation = new ArrayList<Investigation>();
        }
        return this.investigation;
    }

}
