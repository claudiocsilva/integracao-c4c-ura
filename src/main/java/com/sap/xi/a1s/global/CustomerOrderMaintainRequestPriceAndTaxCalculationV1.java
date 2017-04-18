
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestPriceAndTaxCalculation_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestPriceAndTaxCalculation_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainDiscount" type="{http://sap.com/xi/A1S/Global}CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount" minOccurs="0"/&gt;
 *         &lt;element name="PriceComponent" type="{http://sap.com/xi/A1S/Global}CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="priceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestPriceAndTaxCalculation_V1", propOrder = {
    "mainDiscount",
    "priceComponent"
})
public class CustomerOrderMaintainRequestPriceAndTaxCalculationV1 {

    @XmlElement(name = "MainDiscount")
    protected CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount mainDiscount;
    @XmlElement(name = "PriceComponent")
    protected List<CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent> priceComponent;
    @XmlAttribute(name = "priceComponentListCompleteTransmissionIndicator")
    protected Boolean priceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Obtém o valor da propriedade mainDiscount.
     * 
     * @return
     *     possible object is
     *     {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount }
     *     
     */
    public CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount getMainDiscount() {
        return mainDiscount;
    }

    /**
     * Define o valor da propriedade mainDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount }
     *     
     */
    public void setMainDiscount(CustomerQuoteMaintainRequestPriceAndTaxCalculationMainDiscount value) {
        this.mainDiscount = value;
    }

    /**
     * Gets the value of the priceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent }
     * 
     * 
     */
    public List<CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent> getPriceComponent() {
        if (priceComponent == null) {
            priceComponent = new ArrayList<CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent>();
        }
        return this.priceComponent;
    }

    /**
     * Obtém o valor da propriedade priceComponentListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceComponentListCompleteTransmissionIndicator() {
        return priceComponentListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade priceComponentListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceComponentListCompleteTransmissionIndicator(Boolean value) {
        this.priceComponentListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade actionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Define o valor da propriedade actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
