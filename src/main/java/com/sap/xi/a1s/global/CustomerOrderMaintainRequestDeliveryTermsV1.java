
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Incoterms;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestDeliveryTerms_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestDeliveryTerms_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPriorityCode" type="{http://sap.com/xi/AP/Common/GDT}PriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://sap.com/xi/AP/Common/GDT}Incoterms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestDeliveryTerms_V1", propOrder = {
    "deliveryPriorityCode",
    "incoterms"
})
public class CustomerOrderMaintainRequestDeliveryTermsV1 {

    @XmlElement(name = "DeliveryPriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryPriorityCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;

    /**
     * Obtém o valor da propriedade deliveryPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriorityCode() {
        return deliveryPriorityCode;
    }

    /**
     * Define o valor da propriedade deliveryPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriorityCode(String value) {
        this.deliveryPriorityCode = value;
    }

    /**
     * Obtém o valor da propriedade incoterms.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Define o valor da propriedade incoterms.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

}
