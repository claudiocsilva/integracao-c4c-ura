
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.TextCollectionTextID;
import com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="TextID" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextID" minOccurs="0"/&gt;
 *         &lt;element name="TextTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextTypeCode"/&gt;
 *         &lt;element name="ContentText" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerOrderMaintainRequestText", propOrder = {
    "objectNodeSenderTechnicalID",
    "textID",
    "textTypeCode",
    "contentText",
    "creationDateTime"
})
public class CustomerOrderMaintainRequestText {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "TextID")
    protected TextCollectionTextID textID;
    @XmlElement(name = "TextTypeCode", required = true)
    protected TextCollectionTextTypeCode textTypeCode;
    @XmlElement(name = "ContentText")
    protected String contentText;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
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
     * Obtém o valor da propriedade textID.
     * 
     * @return
     *     possible object is
     *     {@link TextCollectionTextID }
     *     
     */
    public TextCollectionTextID getTextID() {
        return textID;
    }

    /**
     * Define o valor da propriedade textID.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCollectionTextID }
     *     
     */
    public void setTextID(TextCollectionTextID value) {
        this.textID = value;
    }

    /**
     * Obtém o valor da propriedade textTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public TextCollectionTextTypeCode getTextTypeCode() {
        return textTypeCode;
    }

    /**
     * Define o valor da propriedade textTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public void setTextTypeCode(TextCollectionTextTypeCode value) {
        this.textTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade contentText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * Define o valor da propriedade contentText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentText(String value) {
        this.contentText = value;
    }

    /**
     * Obtém o valor da propriedade creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Define o valor da propriedade creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
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
