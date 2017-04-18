
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessDocumentBasicMessageHeader complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentBasicMessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentBasicMessageHeader", propOrder = {
    "id",
    "uuid",
    "referenceID",
    "referenceUUID"
})
public class BusinessDocumentBasicMessageHeader {

    @XmlElement(name = "ID")
    protected BusinessDocumentMessageID id;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ReferenceID")
    protected BusinessDocumentMessageID referenceID;
    @XmlElement(name = "ReferenceUUID")
    protected UUID referenceUUID;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public BusinessDocumentMessageID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public void setID(BusinessDocumentMessageID value) {
        this.id = value;
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
     * Obtém o valor da propriedade referenceID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public BusinessDocumentMessageID getReferenceID() {
        return referenceID;
    }

    /**
     * Define o valor da propriedade referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public void setReferenceID(BusinessDocumentMessageID value) {
        this.referenceID = value;
    }

    /**
     * Obtém o valor da propriedade referenceUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReferenceUUID() {
        return referenceUUID;
    }

    /**
     * Define o valor da propriedade referenceUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReferenceUUID(UUID value) {
        this.referenceUUID = value;
    }

}
