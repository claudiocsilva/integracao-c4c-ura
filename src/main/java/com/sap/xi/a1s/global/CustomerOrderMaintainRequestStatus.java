
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOrderLifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerQuoteLifeCycleStatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestStatus", propOrder = {
    "invoiceStatusCode",
    "customerOrderLifeCycleStatusCode"
})
public class CustomerOrderMaintainRequestStatus {

    @XmlElement(name = "InvoiceStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoiceStatusCode;
    @XmlElement(name = "CustomerOrderLifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerOrderLifeCycleStatusCode;

    /**
     * Obtém o valor da propriedade invoiceStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatusCode() {
        return invoiceStatusCode;
    }

    /**
     * Define o valor da propriedade invoiceStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatusCode(String value) {
        this.invoiceStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade customerOrderLifeCycleStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderLifeCycleStatusCode() {
        return customerOrderLifeCycleStatusCode;
    }

    /**
     * Define o valor da propriedade customerOrderLifeCycleStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderLifeCycleStatusCode(String value) {
        this.customerOrderLifeCycleStatusCode = value;
    }

}
