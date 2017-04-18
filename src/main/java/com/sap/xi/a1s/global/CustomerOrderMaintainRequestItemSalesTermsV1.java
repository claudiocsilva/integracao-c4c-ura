
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.CancellationReasonCode;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestItemSalesTerms_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestItemSalesTerms_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CancellationReasonCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestItemSalesTerms_V1", propOrder = {
    "cancellationReasonCode"
})
public class CustomerOrderMaintainRequestItemSalesTermsV1 {

    @XmlElement(name = "CancellationReasonCode")
    protected CancellationReasonCode cancellationReasonCode;

    /**
     * Obtém o valor da propriedade cancellationReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonCode }
     *     
     */
    public CancellationReasonCode getCancellationReasonCode() {
        return cancellationReasonCode;
    }

    /**
     * Define o valor da propriedade cancellationReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonCode }
     *     
     */
    public void setCancellationReasonCode(CancellationReasonCode value) {
        this.cancellationReasonCode = value;
    }

}
