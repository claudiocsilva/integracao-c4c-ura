
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.PriceSpecificationElementTypeCode;
import com.sap.xi.ap.common.gdt.QuantityTypeCode;
import com.sap.xi.ap.common.gdt.Rate;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Classe Java de CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}PriceSpecificationElementTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}Rate" minOccurs="0"/&gt;
 *         &lt;element name="RateBaseQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent", propOrder = {
    "objectNodeSenderTechnicalID",
    "uuid",
    "typeCode",
    "rate",
    "rateBaseQuantityTypeCode"
})
public class CustomerQuoteMaintainRequestPriceAndTaxCalculationPriceComponent {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "TypeCode")
    protected PriceSpecificationElementTypeCode typeCode;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "RateBaseQuantityTypeCode")
    protected QuantityTypeCode rateBaseQuantityTypeCode;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Obtém o valor da propriedade objectNodeSenderTechnicalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * Define o valor da propriedade objectNodeSenderTechnicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
    }

    /**
     * Obtém o valor da propriedade uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Define o valor da propriedade uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceSpecificationElementTypeCode }
     *     
     */
    public PriceSpecificationElementTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSpecificationElementTypeCode }
     *     
     */
    public void setTypeCode(PriceSpecificationElementTypeCode value) {
        this.typeCode = value;
    }

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
