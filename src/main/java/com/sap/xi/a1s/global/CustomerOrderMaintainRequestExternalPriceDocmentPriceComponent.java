
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Amount;
import com.sap.xi.ap.common.gdt.PriceComponentCalculationBasis;
import com.sap.xi.ap.common.gdt.PriceSpecificationElementCategoryCode;
import com.sap.xi.ap.common.gdt.PriceSpecificationElementPurposeCode;
import com.sap.xi.ap.common.gdt.QuantityTypeCode;
import com.sap.xi.ap.common.gdt.Rate;
import com.sap.xi.ap.common.gdt.SHORTDescription;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="MajorLevelOrdinalNumberValue" type="{http://sap.com/xi/AP/Common/GDT}OrdinalNumberValue" minOccurs="0"/&gt;
 *         &lt;element name="MinorLevelOrdinalNumberValue" type="{http://sap.com/xi/AP/Common/GDT}OrdinalNumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}ExternalSalesPriceSpecificationElementTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationElementCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="PurposeCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationElementPurposeCode" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CalculationBasis" type="{http://sap.com/xi/AP/Common/GDT}PriceComponentCalculationBasis" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="RoundingDifferenceAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="GroupedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ManuallyChangedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FixationCode" type="{http://sap.com/xi/AP/Common/GDT}PriceComponentFixationCode" minOccurs="0"/&gt;
 *         &lt;element name="InactivityReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PriceComponentInactivityReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="OriginCode" type="{http://sap.com/xi/AP/Common/GDT}PriceComponentOriginCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent", propOrder = {
    "uuid",
    "description",
    "majorLevelOrdinalNumberValue",
    "minorLevelOrdinalNumberValue",
    "typeCode",
    "categoryCode",
    "purposeCode",
    "rate",
    "rateBaseQuantityTypeCode",
    "calculationBasis",
    "calculatedAmount",
    "roundingDifferenceAmount",
    "effectiveIndicator",
    "groupedIndicator",
    "manuallyChangedIndicator",
    "fixationCode",
    "inactivityReasonCode",
    "originCode"
})
public class CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent {

    @XmlElement(name = "UUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uuid;
    @XmlElement(name = "Description")
    protected SHORTDescription description;
    @XmlElement(name = "MajorLevelOrdinalNumberValue")
    protected Integer majorLevelOrdinalNumberValue;
    @XmlElement(name = "MinorLevelOrdinalNumberValue")
    protected Integer minorLevelOrdinalNumberValue;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    @XmlElement(name = "CategoryCode")
    protected PriceSpecificationElementCategoryCode categoryCode;
    @XmlElement(name = "PurposeCode")
    protected PriceSpecificationElementPurposeCode purposeCode;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RateBaseQuantityTypeCode")
    protected QuantityTypeCode rateBaseQuantityTypeCode;
    @XmlElement(name = "CalculationBasis")
    protected PriceComponentCalculationBasis calculationBasis;
    @XmlElement(name = "CalculatedAmount")
    protected Amount calculatedAmount;
    @XmlElement(name = "RoundingDifferenceAmount")
    protected Amount roundingDifferenceAmount;
    @XmlElement(name = "EffectiveIndicator")
    protected Boolean effectiveIndicator;
    @XmlElement(name = "GroupedIndicator")
    protected Boolean groupedIndicator;
    @XmlElement(name = "ManuallyChangedIndicator")
    protected Boolean manuallyChangedIndicator;
    @XmlElement(name = "FixationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fixationCode;
    @XmlElement(name = "InactivityReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inactivityReasonCode;
    @XmlElement(name = "OriginCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originCode;

    /**
     * Obtém o valor da propriedade uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define o valor da propriedade uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setDescription(SHORTDescription value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade majorLevelOrdinalNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorLevelOrdinalNumberValue() {
        return majorLevelOrdinalNumberValue;
    }

    /**
     * Define o valor da propriedade majorLevelOrdinalNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorLevelOrdinalNumberValue(Integer value) {
        this.majorLevelOrdinalNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade minorLevelOrdinalNumberValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorLevelOrdinalNumberValue() {
        return minorLevelOrdinalNumberValue;
    }

    /**
     * Define o valor da propriedade minorLevelOrdinalNumberValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorLevelOrdinalNumberValue(Integer value) {
        this.minorLevelOrdinalNumberValue = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationElementCategoryCode }
     *     
     */
    public PriceSpecificationElementCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define o valor da propriedade categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationElementCategoryCode }
     *     
     */
    public void setCategoryCode(PriceSpecificationElementCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Obtém o valor da propriedade purposeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationElementPurposeCode }
     *     
     */
    public PriceSpecificationElementPurposeCode getPurposeCode() {
        return purposeCode;
    }

    /**
     * Define o valor da propriedade purposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationElementPurposeCode }
     *     
     */
    public void setPurposeCode(PriceSpecificationElementPurposeCode value) {
        this.purposeCode = value;
    }

    /**
     * Obtém o valor da propriedade rate.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Define o valor da propriedade rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Obtém o valor da propriedade rateBaseQuantityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getRateBaseQuantityTypeCode() {
        return rateBaseQuantityTypeCode;
    }

    /**
     * Define o valor da propriedade rateBaseQuantityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setRateBaseQuantityTypeCode(QuantityTypeCode value) {
        this.rateBaseQuantityTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade calculationBasis.
     * 
     * @return
     *     possible object is
     *     {@link PriceComponentCalculationBasis }
     *     
     */
    public PriceComponentCalculationBasis getCalculationBasis() {
        return calculationBasis;
    }

    /**
     * Define o valor da propriedade calculationBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceComponentCalculationBasis }
     *     
     */
    public void setCalculationBasis(PriceComponentCalculationBasis value) {
        this.calculationBasis = value;
    }

    /**
     * Obtém o valor da propriedade calculatedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCalculatedAmount() {
        return calculatedAmount;
    }

    /**
     * Define o valor da propriedade calculatedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCalculatedAmount(Amount value) {
        this.calculatedAmount = value;
    }

    /**
     * Obtém o valor da propriedade roundingDifferenceAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRoundingDifferenceAmount() {
        return roundingDifferenceAmount;
    }

    /**
     * Define o valor da propriedade roundingDifferenceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRoundingDifferenceAmount(Amount value) {
        this.roundingDifferenceAmount = value;
    }

    /**
     * Obtém o valor da propriedade effectiveIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEffectiveIndicator() {
        return effectiveIndicator;
    }

    /**
     * Define o valor da propriedade effectiveIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEffectiveIndicator(Boolean value) {
        this.effectiveIndicator = value;
    }

    /**
     * Obtém o valor da propriedade groupedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupedIndicator() {
        return groupedIndicator;
    }

    /**
     * Define o valor da propriedade groupedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupedIndicator(Boolean value) {
        this.groupedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade manuallyChangedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuallyChangedIndicator() {
        return manuallyChangedIndicator;
    }

    /**
     * Define o valor da propriedade manuallyChangedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyChangedIndicator(Boolean value) {
        this.manuallyChangedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade fixationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixationCode() {
        return fixationCode;
    }

    /**
     * Define o valor da propriedade fixationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixationCode(String value) {
        this.fixationCode = value;
    }

    /**
     * Obtém o valor da propriedade inactivityReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactivityReasonCode() {
        return inactivityReasonCode;
    }

    /**
     * Define o valor da propriedade inactivityReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactivityReasonCode(String value) {
        this.inactivityReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade originCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Define o valor da propriedade originCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

}
