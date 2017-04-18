
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
 * <p>Classe Java de PriceComponentCalculationBasis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PriceComponentCalculationBasis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationBaseCode"/&gt;
 *         &lt;element name="Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="QuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AdaptationFactorDecimalValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceComponentCalculationBasis", propOrder = {
    "baseCode",
    "quantity",
    "quantityTypeCode",
    "amount",
    "adaptationFactorDecimalValue"
})
public class PriceComponentCalculationBasis {

    @XmlElement(name = "BaseCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseCode;
    @XmlElement(name = "Quantity")
    protected Quantity quantity;
    @XmlElement(name = "QuantityTypeCode")
    protected QuantityTypeCode quantityTypeCode;
    @XmlElement(name = "Amount")
    protected Amount amount;
    @XmlElement(name = "AdaptationFactorDecimalValue")
    protected BigDecimal adaptationFactorDecimalValue;

    /**
     * Obtém o valor da propriedade baseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCode() {
        return baseCode;
    }

    /**
     * Define o valor da propriedade baseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCode(String value) {
        this.baseCode = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade quantityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getQuantityTypeCode() {
        return quantityTypeCode;
    }

    /**
     * Define o valor da propriedade quantityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setQuantityTypeCode(QuantityTypeCode value) {
        this.quantityTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade amount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Define o valor da propriedade amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Obtém o valor da propriedade adaptationFactorDecimalValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdaptationFactorDecimalValue() {
        return adaptationFactorDecimalValue;
    }

    /**
     * Define o valor da propriedade adaptationFactorDecimalValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdaptationFactorDecimalValue(BigDecimal value) {
        this.adaptationFactorDecimalValue = value;
    }

}
