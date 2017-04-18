
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Amount;
import com.sap.xi.ap.common.gdt.PricingSubtotalTypeCode;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestTotalValuesPricingSubtotals complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestTotalValuesPricingSubtotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}PricingSubtotalTypeCode"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestTotalValuesPricingSubtotals", propOrder = {
    "typeCode",
    "amount"
})
public class CustomerOrderMaintainRequestTotalValuesPricingSubtotals {

    @XmlElement(name = "TypeCode", required = true)
    protected PricingSubtotalTypeCode typeCode;
    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link PricingSubtotalTypeCode }
     *     
     */
    public PricingSubtotalTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSubtotalTypeCode }
     *     
     */
    public void setTypeCode(PricingSubtotalTypeCode value) {
        this.typeCode = value;
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
