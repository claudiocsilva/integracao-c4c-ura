
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
import com.sap.xi.ap.common.gdt.NamespaceURI;


/**
 * <p>Classe Java de MaintenanceAttachmentFolderDocumentProperty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceAttachmentFolderDocumentProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeFormatCode" type="{http://sap.com/xi/AP/Common/GDT}PropertyDataTypeFormatCode" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ChangeAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MultipleValueIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="NamespaceURI" type="{http://sap.com/xi/AP/Common/GDT}NamespaceURI" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="PropertyValue" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentPropertyPropertyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PropertyValueListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAttachmentFolderDocumentProperty", propOrder = {
    "technicalID",
    "name",
    "dataTypeFormatCode",
    "visibleIndicator",
    "changeAllowedIndicator",
    "multipleValueIndicator",
    "namespaceURI",
    "description",
    "propertyValue"
})
public class MaintenanceAttachmentFolderDocumentProperty {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DataTypeFormatCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataTypeFormatCode;
    @XmlElement(name = "VisibleIndicator")
    protected Boolean visibleIndicator;
    @XmlElement(name = "ChangeAllowedIndicator")
    protected Boolean changeAllowedIndicator;
    @XmlElement(name = "MultipleValueIndicator")
    protected Boolean multipleValueIndicator;
    @XmlElement(name = "NamespaceURI")
    protected NamespaceURI namespaceURI;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "PropertyValue")
    protected List<MaintenanceAttachmentFolderDocumentPropertyPropertyValue> propertyValue;
    @XmlAttribute(name = "PropertyValueListCompleteTransmissionIndicator")
    protected Boolean propertyValueListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Obtém o valor da propriedade technicalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Define o valor da propriedade technicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalID(String value) {
        this.technicalID = value;
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
     * Obtém o valor da propriedade dataTypeFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeFormatCode() {
        return dataTypeFormatCode;
    }

    /**
     * Define o valor da propriedade dataTypeFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeFormatCode(String value) {
        this.dataTypeFormatCode = value;
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
     * Obtém o valor da propriedade changeAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeAllowedIndicator() {
        return changeAllowedIndicator;
    }

    /**
     * Define o valor da propriedade changeAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeAllowedIndicator(Boolean value) {
        this.changeAllowedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade multipleValueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleValueIndicator() {
        return multipleValueIndicator;
    }

    /**
     * Define o valor da propriedade multipleValueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleValueIndicator(Boolean value) {
        this.multipleValueIndicator = value;
    }

    /**
     * Obtém o valor da propriedade namespaceURI.
     * 
     * @return
     *     possible object is
     *     {@link NamespaceURI }
     *     
     */
    public NamespaceURI getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * Define o valor da propriedade namespaceURI.
     * 
     * @param value
     *     allowed object is
     *     {@link NamespaceURI }
     *     
     */
    public void setNamespaceURI(NamespaceURI value) {
        this.namespaceURI = value;
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
     * Gets the value of the propertyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceAttachmentFolderDocumentPropertyPropertyValue }
     * 
     * 
     */
    public List<MaintenanceAttachmentFolderDocumentPropertyPropertyValue> getPropertyValue() {
        if (propertyValue == null) {
            propertyValue = new ArrayList<MaintenanceAttachmentFolderDocumentPropertyPropertyValue>();
        }
        return this.propertyValue;
    }

    /**
     * Obtém o valor da propriedade propertyValueListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyValueListCompleteTransmissionIndicator() {
        return propertyValueListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade propertyValueListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyValueListCompleteTransmissionIndicator(Boolean value) {
        this.propertyValueListCompleteTransmissionIndicator = value;
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
