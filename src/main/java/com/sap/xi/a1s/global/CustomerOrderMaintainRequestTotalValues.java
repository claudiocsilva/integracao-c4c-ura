
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.Amount;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestTotalValues complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestTotalValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TotalValuesPricingSubtotals" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestTotalValuesPricingSubtotals" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GrossAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalValuesPricingSubtotalsCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestTotalValues", propOrder = {
    "netAmount",
    "totalValuesPricingSubtotals",
    "grossAmount",
    "taxAmount"
})
public class CustomerOrderMaintainRequestTotalValues {

    @XmlElement(name = "NetAmount")
    protected Amount netAmount;
    @XmlElement(name = "TotalValuesPricingSubtotals")
    protected List<CustomerOrderMaintainRequestTotalValuesPricingSubtotals> totalValuesPricingSubtotals;
    @XmlElement(name = "GrossAmount")
    protected Amount grossAmount;
    @XmlElement(name = "TaxAmount")
    protected Amount taxAmount;
    @XmlAttribute(name = "TotalValuesPricingSubtotalsCompleteTransmissionIndicator")
    protected Boolean totalValuesPricingSubtotalsCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade netAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetAmount() {
        return netAmount;
    }

    /**
     * Define o valor da propriedade netAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetAmount(Amount value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the totalValuesPricingSubtotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalValuesPricingSubtotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalValuesPricingSubtotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestTotalValuesPricingSubtotals }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestTotalValuesPricingSubtotals> getTotalValuesPricingSubtotals() {
        if (totalValuesPricingSubtotals == null) {
            totalValuesPricingSubtotals = new ArrayList<CustomerOrderMaintainRequestTotalValuesPricingSubtotals>();
        }
        return this.totalValuesPricingSubtotals;
    }

    /**
     * Obtém o valor da propriedade grossAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossAmount() {
        return grossAmount;
    }

    /**
     * Define o valor da propriedade grossAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossAmount(Amount value) {
        this.grossAmount = value;
    }

    /**
     * Obtém o valor da propriedade taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define o valor da propriedade taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxAmount(Amount value) {
        this.taxAmount = value;
    }

    /**
     * Obtém o valor da propriedade totalValuesPricingSubtotalsCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalValuesPricingSubtotalsCompleteTransmissionIndicator() {
        return totalValuesPricingSubtotalsCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade totalValuesPricingSubtotalsCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalValuesPricingSubtotalsCompleteTransmissionIndicator(Boolean value) {
        this.totalValuesPricingSubtotalsCompleteTransmissionIndicator = value;
    }

}
