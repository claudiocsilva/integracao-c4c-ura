
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
 * <p>Classe Java de CustomerOrderMaintainRequestPriceAndTaxCalculationItem_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestPriceAndTaxCalculationItem_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemMainDiscount" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount" minOccurs="0"/&gt;
 *         &lt;element name="ItemMainPrice" type="{http://sap.com/xi/A1S/Global}CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceComponent" type="{http://sap.com/xi/A1S/Global}CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemPriceComponentListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestPriceAndTaxCalculationItem_V1", propOrder = {
    "itemMainDiscount",
    "itemMainPrice",
    "itemPriceComponent"
})
public class CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 {

    @XmlElement(name = "ItemMainDiscount")
    protected CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount itemMainDiscount;
    @XmlElement(name = "ItemMainPrice")
    protected CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice itemMainPrice;
    @XmlElement(name = "ItemPriceComponent")
    protected List<CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemPriceComponent> itemPriceComponent;
    @XmlAttribute(name = "itemPriceComponentListCompleteTransmissionIndicator")
    protected Boolean itemPriceComponentListCompleteTransmissionIndicator;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Obtém o valor da propriedade itemMainDiscount.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount }
     *     
     */
    public CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount getItemMainDiscount() {
        return itemMainDiscount;
    }

    /**
     * Define o valor da propriedade itemMainDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount }
     *     
     */
    public void setItemMainDiscount(CustomerOrderMaintainRequestPriceAndTaxCalculationItemItemMainDiscount value) {
        this.itemMainDiscount = value;
    }

    /**
     * Obtém o valor da propriedade itemMainPrice.
     * 
     * @return
     *     possible object is
     *     {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice }
     *     
     */
    public CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice getItemMainPrice() {
        return itemMainPrice;
    }

    /**
     * Define o valor da propriedade itemMainPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice }
     *     
     */
    public void setItemMainPrice(CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemMainPrice value) {
        this.itemMainPrice = value;
    }

    /**
     * Gets the value of the itemPriceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPriceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemPriceComponent }
     * 
     * 
     */
    public List<CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemPriceComponent> getItemPriceComponent() {
        if (itemPriceComponent == null) {
            itemPriceComponent = new ArrayList<CustomerQuoteMaintainRequestPriceAndTaxCalculationItemItemPriceComponent>();
        }
        return this.itemPriceComponent;
    }

    /**
     * Obtém o valor da propriedade itemPriceComponentListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemPriceComponentListCompleteTransmissionIndicator() {
        return itemPriceComponentListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade itemPriceComponentListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemPriceComponentListCompleteTransmissionIndicator(Boolean value) {
        this.itemPriceComponentListCompleteTransmissionIndicator = value;
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
