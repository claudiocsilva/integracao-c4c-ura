
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.QuantityTypeCode;
import com.sap.xi.ap.common.gdt.Rate;


/**
 * <p>Classe Java de CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount", propOrder = {
    "rate",
    "rateBaseQuantityTypeCode"
})
public class CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount {

    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RateBaseQuantityTypeCode")
    protected QuantityTypeCode rateBaseQuantityTypeCode;

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

}
