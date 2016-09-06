
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
 *         &lt;element name="itemName" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;element name="itemNumericValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemNumericValueUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemTextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultStatus" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;element name="abnormalFlag" type="{http://www.mohh.com/nehr}codedValueType"/>
 *         &lt;element name="referenceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interpretationNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POCTIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "itemName",
    "itemNumericValue",
    "itemNumericValueUOM",
    "itemTextValue",
    "resultStatus",
    "abnormalFlag",
    "referenceRange",
    "interpretationNotes",
    "poctIndicator"
})
@XmlRootElement(name = "investigationItem")
public class InvestigationItem {

    @XmlElement(required = true)
    protected CodedValueType itemName;
    protected String itemNumericValue;
    protected String itemNumericValueUOM;
    protected String itemTextValue;
    @XmlElement(required = true)
    protected CodedValueType resultStatus;
    @XmlElement(required = true)
    protected CodedValueType abnormalFlag;
    protected String referenceRange;
    protected String interpretationNotes;
    @XmlElement(name = "POCTIndicator")
    protected Boolean poctIndicator;

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link CodedValueType }
     *     
     */
    public CodedValueType getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedValueType }
     *     
     */
    public void setItemName(CodedValueType value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumericValue() {
        return itemNumericValue;
    }

    /**
     * Sets the value of the itemNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumericValue(String value) {
        this.itemNumericValue = value;
    }

    /**
     * Gets the value of the itemNumericValueUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumericValueUOM() {
        return itemNumericValueUOM;
    }

    /**
     * Sets the value of the itemNumericValueUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumericValueUOM(String value) {
        this.itemNumericValueUOM = value;
    }

    /**
     * Gets the value of the itemTextValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTextValue() {
        return itemTextValue;
    }

    /**
     * Sets the value of the itemTextValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTextValue(String value) {
        this.itemTextValue = value;
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
     * Gets the value of the referenceRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceRange() {
        return referenceRange;
    }

    /**
     * Sets the value of the referenceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceRange(String value) {
        this.referenceRange = value;
    }

    /**
     * Gets the value of the interpretationNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretationNotes() {
        return interpretationNotes;
    }

    /**
     * Sets the value of the interpretationNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretationNotes(String value) {
        this.interpretationNotes = value;
    }

    /**
     * Gets the value of the poctIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOCTIndicator() {
        return poctIndicator;
    }

    /**
     * Sets the value of the poctIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOCTIndicator(Boolean value) {
        this.poctIndicator = value;
    }

}
