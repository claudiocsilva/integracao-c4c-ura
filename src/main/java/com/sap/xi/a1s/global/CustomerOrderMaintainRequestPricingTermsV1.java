
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.basis.global.LOCALNORMALISEDDateTime;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestPricingTerms_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestPricingTerms_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="PriceDateTime" type="{http://sap.com/xi/BASIS/Global}LOCALNORMALISED_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestPricingTerms_V1", propOrder = {
    "currencyCode",
    "priceDateTime"
})
public class CustomerOrderMaintainRequestPricingTermsV1 {

    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "PriceDateTime")
    protected LOCALNORMALISEDDateTime priceDateTime;

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
     * Obtém o valor da propriedade priceDateTime.
     * 
     * @return
     *     possible object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public LOCALNORMALISEDDateTime getPriceDateTime() {
        return priceDateTime;
    }

    /**
     * Define o valor da propriedade priceDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public void setPriceDateTime(LOCALNORMALISEDDateTime value) {
        this.priceDateTime = value;
    }

}
