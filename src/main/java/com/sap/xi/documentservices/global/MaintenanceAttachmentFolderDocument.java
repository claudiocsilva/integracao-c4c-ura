
package com.sap.xi.documentservices.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Description;
import com.sap.xi.ap.common.gdt.DocumentTypeCode;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Classe Java de MaintenanceAttachmentFolderDocument complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceAttachmentFolderDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LinkInternalIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MIMECode" type="{http://sap.com/xi/AP/Common/GDT}MIMECode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="InternalLinkUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLinkWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileContent" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentFileContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PropertyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAttachmentFolderDocument", propOrder = {
    "uuid",
    "linkInternalIndicator",
    "visibleIndicator",
    "categoryCode",
    "typeCode",
    "mimeCode",
    "name",
    "alternativeName",
    "internalLinkUUID",
    "description",
    "externalLinkWebURI",
    "property",
    "fileContent"
})
public class MaintenanceAttachmentFolderDocument {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "LinkInternalIndicator")
    protected Boolean linkInternalIndicator;
    @XmlElement(name = "VisibleIndicator")
    protected Boolean visibleIndicator;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "TypeCode")
    protected DocumentTypeCode typeCode;
    @XmlElement(name = "MIMECode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mimeCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AlternativeName")
    protected String alternativeName;
    @XmlElement(name = "InternalLinkUUID")
    protected UUID internalLinkUUID;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "ExternalLinkWebURI")
    @XmlSchemaType(name = "anyURI")
    protected String externalLinkWebURI;
    @XmlElement(name = "Property")
    protected List<MaintenanceAttachmentFolderDocumentProperty> property;
    @XmlElement(name = "FileContent")
    protected MaintenanceAttachmentFolderDocumentFileContent fileContent;
    @XmlAttribute(name = "PropertyListCompleteTransmissionIndicator")
    protected Boolean propertyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

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
     * Obtém o valor da propriedade linkInternalIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkInternalIndicator() {
        return linkInternalIndicator;
    }

    /**
     * Define o valor da propriedade linkInternalIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkInternalIndicator(Boolean value) {
        this.linkInternalIndicator = value;
    }

    /**
     * Obtém o valor da propriedade visibleIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibleIndicator() {
        return visibleIndicator;
    }

    /**
     * Define o valor da propriedade visibleIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibleIndicator(Boolean value) {
        this.visibleIndicator = value;
    }

    /**
     * Obtém o valor da propriedade categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define o valor da propriedade categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCode }
     *     
     */
    public DocumentTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCode }
     *     
     */
    public void setTypeCode(DocumentTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade mimeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMECode() {
        return mimeCode;
    }

    /**
     * Define o valor da propriedade mimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMECode(String value) {
        this.mimeCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade alternativeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeName() {
        return alternativeName;
    }

    /**
     * Define o valor da propriedade alternativeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeName(String value) {
        this.alternativeName = value;
    }

    /**
     * Obtém o valor da propriedade internalLinkUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getInternalLinkUUID() {
        return internalLinkUUID;
    }

    /**
     * Define o valor da propriedade internalLinkUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setInternalLinkUUID(UUID value) {
        this.internalLinkUUID = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade externalLinkWebURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLinkWebURI() {
        return externalLinkWebURI;
    }

    /**
     * Define o valor da propriedade externalLinkWebURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLinkWebURI(String value) {
        this.externalLinkWebURI = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceAttachmentFolderDocumentProperty }
     * 
     * 
     */
    public List<MaintenanceAttachmentFolderDocumentProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<MaintenanceAttachmentFolderDocumentProperty>();
        }
        return this.property;
    }

    /**
     * Obtém o valor da propriedade fileContent.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolderDocumentFileContent }
     *     
     */
    public MaintenanceAttachmentFolderDocumentFileContent getFileContent() {
        return fileContent;
    }

    /**
     * Define o valor da propriedade fileContent.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolderDocumentFileContent }
     *     
     */
    public void setFileContent(MaintenanceAttachmentFolderDocumentFileContent value) {
        this.fileContent = value;
    }

    /**
     * Obtém o valor da propriedade propertyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyListCompleteTransmissionIndicator() {
        return propertyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade propertyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyListCompleteTransmissionIndicator(Boolean value) {
        this.propertyListCompleteTransmissionIndicator = value;
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
