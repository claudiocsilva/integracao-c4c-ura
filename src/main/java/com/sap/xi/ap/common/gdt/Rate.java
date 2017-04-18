
package com.sap.xi.ap.common.gdt;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de Rate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Rate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecimalValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue"/&gt;
 *         &lt;element name="MeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseDecimalValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="BaseMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseCurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "decimalValue",
    "measureUnitCode",
    "currencyCode",
    "baseDecimalValue",
    "baseMeasureUnitCode",
    "baseCurrencyCode"
})
public class Rate {

    @XmlElement(name = "DecimalValue", required = true)
    protected BigDecimal decimalValue;
    @XmlElement(name = "MeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String measureUnitCode;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "BaseDecimalValue", defaultValue = "1")
    protected BigDecimal baseDecimalValue;
    @XmlElement(name = "BaseMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseMeasureUnitCode;
    @XmlElement(name = "BaseCurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseCurrencyCode;

    /**
     * Obtém o valor da propriedade decimalValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * Define o valor da propriedade decimalValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalValue(BigDecimal value) {
        this.decimalValue = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitCode() {
        return measureUnitCode;
    }

    /**
     * Define o valor da propriedade measureUnitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitCode(String value) {
        this.measureUnitCode = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade baseDecimalValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseDecimalValue() {
        return baseDecimalValue;
    }

    /**
     * Define o valor da propriedade baseDecimalValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseDecimalValue(BigDecimal value) {
        this.baseDecimalValue = value;
    }

    /**
     * Obtém o valor da propriedade baseMeasureUnitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMeasureUnitCode() {
        return baseMeasureUnitCode;
    }

    /**
     * Define o valor da propriedade baseMeasureUnitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMeasureUnitCode(String value) {
        this.baseMeasureUnitCode = value;
    }

    /**
     * Obtém o valor da propriedade baseCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * Define o valor da propriedade baseCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCode(String value) {
        this.baseCurrencyCode = value;
    }

}
