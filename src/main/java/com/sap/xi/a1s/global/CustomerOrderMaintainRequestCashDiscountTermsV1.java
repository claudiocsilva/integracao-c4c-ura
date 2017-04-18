
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.CashDiscountTermsCode;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestCashDiscountTerms_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestCashDiscountTerms_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://sap.com/xi/AP/Common/GDT}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBaselineDate" type="{http://sap.com/xi/BASIS/Global}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestCashDiscountTerms_V1", propOrder = {
    "code",
    "paymentBaselineDate"
})
public class CustomerOrderMaintainRequestCashDiscountTermsV1 {

    @XmlElement(name = "Code")
    protected CashDiscountTermsCode code;
    @XmlElement(name = "PaymentBaselineDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentBaselineDate;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setCode(CashDiscountTermsCode value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade paymentBaselineDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentBaselineDate() {
        return paymentBaselineDate;
    }

    /**
     * Define o valor da propriedade paymentBaselineDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentBaselineDate(XMLGregorianCalendar value) {
        this.paymentBaselineDate = value;
    }

}
