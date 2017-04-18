
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de LogItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTypeID" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceMessageElementName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LogItemNote"/&gt;
 *         &lt;element name="NoteTemplateText" type="{http://sap.com/xi/AP/Common/GDT}LogItemNoteTemplateText" minOccurs="0"/&gt;
 *         &lt;element name="LogItemNotePlaceholderSubstitutionList" type="{http://sap.com/xi/AP/Common/GDT}LogItemNotePlaceholderSubstitutionList" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItem", propOrder = {
    "typeID",
    "categoryCode",
    "severityCode",
    "referenceObjectNodeSenderTechnicalID",
    "referenceMessageElementName",
    "note",
    "noteTemplateText",
    "logItemNotePlaceholderSubstitutionList",
    "webURI"
})
public class LogItem {

    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "CategoryCode")
    protected LogItemCategoryCode categoryCode;
    @XmlElement(name = "SeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String severityCode;
    @XmlElement(name = "ReferenceObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceObjectNodeSenderTechnicalID;
    @XmlElement(name = "ReferenceMessageElementName")
    protected String referenceMessageElementName;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "NoteTemplateText")
    protected String noteTemplateText;
    @XmlElement(name = "LogItemNotePlaceholderSubstitutionList")
    protected LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;

    /**
     * Obtém o valor da propriedade typeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Define o valor da propriedade typeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * Obtém o valor da propriedade categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public LogItemCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define o valor da propriedade categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public void setCategoryCode(LogItemCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Obtém o valor da propriedade severityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * Define o valor da propriedade severityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityCode(String value) {
        this.severityCode = value;
    }

    /**
     * Obtém o valor da propriedade referenceObjectNodeSenderTechnicalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceObjectNodeSenderTechnicalID() {
        return referenceObjectNodeSenderTechnicalID;
    }

    /**
     * Define o valor da propriedade referenceObjectNodeSenderTechnicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceObjectNodeSenderTechnicalID(String value) {
        this.referenceObjectNodeSenderTechnicalID = value;
    }

    /**
     * Obtém o valor da propriedade referenceMessageElementName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceMessageElementName() {
        return referenceMessageElementName;
    }

    /**
     * Define o valor da propriedade referenceMessageElementName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceMessageElementName(String value) {
        this.referenceMessageElementName = value;
    }

    /**
     * Obtém o valor da propriedade note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define o valor da propriedade note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtém o valor da propriedade noteTemplateText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTemplateText() {
        return noteTemplateText;
    }

    /**
     * Define o valor da propriedade noteTemplateText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTemplateText(String value) {
        this.noteTemplateText = value;
    }

    /**
     * Obtém o valor da propriedade logItemNotePlaceholderSubstitutionList.
     * 
     * @return
     *     possible object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList() {
        return logItemNotePlaceholderSubstitutionList;
    }

    /**
     * Define o valor da propriedade logItemNotePlaceholderSubstitutionList.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public void setLogItemNotePlaceholderSubstitutionList(LogItemNotePlaceholderSubstitutionList value) {
        this.logItemNotePlaceholderSubstitutionList = value;
    }

    /**
     * Obtém o valor da propriedade webURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURI() {
        return webURI;
    }

    /**
     * Define o valor da propriedade webURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURI(String value) {
        this.webURI = value;
    }

}
