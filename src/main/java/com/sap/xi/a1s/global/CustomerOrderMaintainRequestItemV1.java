
package com.sap.xi.a1s.global;

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
import javax.xml.datatype.XMLGregorianCalendar;
import com.sap.xi.ap.common.gdt.Quantity;
import com.sap.xi.ap.common.gdt.SHORTDescription;
import com.sap.xi.ap.common.gdt.SalesOrderItemBusinessTransactionDocumentReference;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestItem_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestItem_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="BuyerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="PostingDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemProcessingTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ItemHierarchyRelationship" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItemHierarchyRelationship" minOccurs="0"/&gt;
 *         &lt;element name="ItemProduct" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItemProduct_V1_1" minOccurs="0"/&gt;
 *         &lt;element name="ItemRequestedScheduleLine" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItemScheduleLine_V1" minOccurs="0"/&gt;
 *         &lt;element name="ItemProductRecipientParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithoutContact" minOccurs="0"/&gt;
 *         &lt;element name="ItemSalesTerms" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItemSalesTerms_V1" minOccurs="0"/&gt;
 *         &lt;element name="ItemBusinessTransactionDocumentReference" type="{http://sap.com/xi/AP/Common/GDT}SalesOrderItemBusinessTransactionDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemText" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemAttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="ItemParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItemPartyWithContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExternalPriceCalculationItem" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestExternalPriceDocumentItem" minOccurs="0"/&gt;
 *         &lt;element name="ItemTotalValues" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestTotalValues" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceCalculation" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPriceAndTaxCalculationItem_V1" minOccurs="0"/&gt;
 *         &lt;element name="ItemFulfilmentStatus" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A0014}Ext00163E2B4F971ED787AB520417E9144A"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="itemBTDReferenceListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="textListCompleteTransimissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestItem_V1", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "buyerID",
    "postingDateTime",
    "description",
    "processingTypeCode",
    "itemHierarchyRelationship",
    "itemProduct",
    "itemRequestedScheduleLine",
    "itemProductRecipientParty",
    "itemSalesTerms",
    "itemBusinessTransactionDocumentReference",
    "itemText",
    "itemAttachmentFolder",
    "itemParty",
    "externalPriceCalculationItem",
    "itemTotalValues",
    "itemPriceCalculation",
    "itemFulfilmentStatus",
    "quantity"
})
public class CustomerOrderMaintainRequestItemV1 {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "BuyerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buyerID;
    @XmlElement(name = "PostingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDateTime;
    @XmlElement(name = "Description")
    protected SHORTDescription description;
    @XmlElement(name = "ProcessingTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingTypeCode;
    @XmlElement(name = "ItemHierarchyRelationship")
    protected CustomerOrderMaintainRequestItemHierarchyRelationship itemHierarchyRelationship;
    @XmlElement(name = "ItemProduct")
    protected CustomerOrderMaintainRequestItemProductV11 itemProduct;
    @XmlElement(name = "ItemRequestedScheduleLine")
    protected CustomerOrderMaintainRequestItemScheduleLineV1 itemRequestedScheduleLine;
    @XmlElement(name = "ItemProductRecipientParty")
    protected CustomerOrderMaintainRequestPartyWithoutContact itemProductRecipientParty;
    @XmlElement(name = "ItemSalesTerms")
    protected CustomerOrderMaintainRequestItemSalesTermsV1 itemSalesTerms;
    @XmlElement(name = "ItemBusinessTransactionDocumentReference")
    protected List<SalesOrderItemBusinessTransactionDocumentReference> itemBusinessTransactionDocumentReference;
    @XmlElement(name = "ItemText")
    protected List<CustomerOrderMaintainRequestText> itemText;
    @XmlElement(name = "ItemAttachmentFolder")
    protected MaintenanceAttachmentFolder itemAttachmentFolder;
    @XmlElement(name = "ItemParty")
    protected List<CustomerOrderMaintainRequestItemPartyWithContact> itemParty;
    @XmlElement(name = "ExternalPriceCalculationItem")
    protected CustomerOrderMaintainRequestExternalPriceDocumentItem externalPriceCalculationItem;
    @XmlElement(name = "ItemTotalValues")
    protected CustomerOrderMaintainRequestTotalValues itemTotalValues;
    @XmlElement(name = "ItemPriceCalculation")
    protected CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 itemPriceCalculation;
    @XmlElement(name = "ItemFulfilmentStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemFulfilmentStatus;
    @XmlElement(name = "Quantity", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A0014")
    protected Quantity quantity;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "itemBTDReferenceListCompleteTransmissionIndicator")
    protected Boolean itemBTDReferenceListCompleteTransmissionIndicator;
    @XmlAttribute(name = "textListCompleteTransimissionIndicator")
    protected Boolean textListCompleteTransimissionIndicator;

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
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade buyerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerID() {
        return buyerID;
    }

    /**
     * Define o valor da propriedade buyerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerID(String value) {
        this.buyerID = value;
    }

    /**
     * Obtém o valor da propriedade postingDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDateTime() {
        return postingDateTime;
    }

    /**
     * Define o valor da propriedade postingDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDateTime(XMLGregorianCalendar value) {
        this.postingDateTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setDescription(SHORTDescription value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade processingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingTypeCode() {
        return processingTypeCode;
    }

    /**
     * Define o valor da propriedade processingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingTypeCode(String value) {
        this.processingTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade itemHierarchyRelationship.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestItemHierarchyRelationship }
     *     
     */
    public CustomerOrderMaintainRequestItemHierarchyRelationship getItemHierarchyRelationship() {
        return itemHierarchyRelationship;
    }

    /**
     * Define o valor da propriedade itemHierarchyRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestItemHierarchyRelationship }
     *     
     */
    public void setItemHierarchyRelationship(CustomerOrderMaintainRequestItemHierarchyRelationship value) {
        this.itemHierarchyRelationship = value;
    }

    /**
     * Obtém o valor da propriedade itemProduct.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestItemProductV11 }
     *     
     */
    public CustomerOrderMaintainRequestItemProductV11 getItemProduct() {
        return itemProduct;
    }

    /**
     * Define o valor da propriedade itemProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestItemProductV11 }
     *     
     */
    public void setItemProduct(CustomerOrderMaintainRequestItemProductV11 value) {
        this.itemProduct = value;
    }

    /**
     * Obtém o valor da propriedade itemRequestedScheduleLine.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestItemScheduleLineV1 }
     *     
     */
    public CustomerOrderMaintainRequestItemScheduleLineV1 getItemRequestedScheduleLine() {
        return itemRequestedScheduleLine;
    }

    /**
     * Define o valor da propriedade itemRequestedScheduleLine.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestItemScheduleLineV1 }
     *     
     */
    public void setItemRequestedScheduleLine(CustomerOrderMaintainRequestItemScheduleLineV1 value) {
        this.itemRequestedScheduleLine = value;
    }

    /**
     * Obtém o valor da propriedade itemProductRecipientParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithoutContact getItemProductRecipientParty() {
        return itemProductRecipientParty;
    }

    /**
     * Define o valor da propriedade itemProductRecipientParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public void setItemProductRecipientParty(CustomerOrderMaintainRequestPartyWithoutContact value) {
        this.itemProductRecipientParty = value;
    }

    /**
     * Obtém o valor da propriedade itemSalesTerms.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestItemSalesTermsV1 }
     *     
     */
    public CustomerOrderMaintainRequestItemSalesTermsV1 getItemSalesTerms() {
        return itemSalesTerms;
    }

    /**
     * Define o valor da propriedade itemSalesTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestItemSalesTermsV1 }
     *     
     */
    public void setItemSalesTerms(CustomerOrderMaintainRequestItemSalesTermsV1 value) {
        this.itemSalesTerms = value;
    }

    /**
     * Gets the value of the itemBusinessTransactionDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemBusinessTransactionDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemBusinessTransactionDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderItemBusinessTransactionDocumentReference }
     * 
     * 
     */
    public List<SalesOrderItemBusinessTransactionDocumentReference> getItemBusinessTransactionDocumentReference() {
        if (itemBusinessTransactionDocumentReference == null) {
            itemBusinessTransactionDocumentReference = new ArrayList<SalesOrderItemBusinessTransactionDocumentReference>();
        }
        return this.itemBusinessTransactionDocumentReference;
    }

    /**
     * Gets the value of the itemText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestText }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestText> getItemText() {
        if (itemText == null) {
            itemText = new ArrayList<CustomerOrderMaintainRequestText>();
        }
        return this.itemText;
    }

    /**
     * Obtém o valor da propriedade itemAttachmentFolder.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public MaintenanceAttachmentFolder getItemAttachmentFolder() {
        return itemAttachmentFolder;
    }

    /**
     * Define o valor da propriedade itemAttachmentFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public void setItemAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.itemAttachmentFolder = value;
    }

    /**
     * Gets the value of the itemParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestItemPartyWithContact }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestItemPartyWithContact> getItemParty() {
        if (itemParty == null) {
            itemParty = new ArrayList<CustomerOrderMaintainRequestItemPartyWithContact>();
        }
        return this.itemParty;
    }

    /**
     * Obtém o valor da propriedade externalPriceCalculationItem.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestExternalPriceDocumentItem }
     *     
     */
    public CustomerOrderMaintainRequestExternalPriceDocumentItem getExternalPriceCalculationItem() {
        return externalPriceCalculationItem;
    }

    /**
     * Define o valor da propriedade externalPriceCalculationItem.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestExternalPriceDocumentItem }
     *     
     */
    public void setExternalPriceCalculationItem(CustomerOrderMaintainRequestExternalPriceDocumentItem value) {
        this.externalPriceCalculationItem = value;
    }

    /**
     * Obtém o valor da propriedade itemTotalValues.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestTotalValues }
     *     
     */
    public CustomerOrderMaintainRequestTotalValues getItemTotalValues() {
        return itemTotalValues;
    }

    /**
     * Define o valor da propriedade itemTotalValues.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestTotalValues }
     *     
     */
    public void setItemTotalValues(CustomerOrderMaintainRequestTotalValues value) {
        this.itemTotalValues = value;
    }

    /**
     * Obtém o valor da propriedade itemPriceCalculation.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 }
     *     
     */
    public CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 getItemPriceCalculation() {
        return itemPriceCalculation;
    }

    /**
     * Define o valor da propriedade itemPriceCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 }
     *     
     */
    public void setItemPriceCalculation(CustomerOrderMaintainRequestPriceAndTaxCalculationItemV1 value) {
        this.itemPriceCalculation = value;
    }

    /**
     * Obtém o valor da propriedade itemFulfilmentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFulfilmentStatus() {
        return itemFulfilmentStatus;
    }

    /**
     * Define o valor da propriedade itemFulfilmentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFulfilmentStatus(String value) {
        this.itemFulfilmentStatus = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
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

    /**
     * Obtém o valor da propriedade itemBTDReferenceListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemBTDReferenceListCompleteTransmissionIndicator() {
        return itemBTDReferenceListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade itemBTDReferenceListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemBTDReferenceListCompleteTransmissionIndicator(Boolean value) {
        this.itemBTDReferenceListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade textListCompleteTransimissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextListCompleteTransimissionIndicator() {
        return textListCompleteTransimissionIndicator;
    }

    /**
     * Define o valor da propriedade textListCompleteTransimissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextListCompleteTransimissionIndicator(Boolean value) {
        this.textListCompleteTransimissionIndicator = value;
    }

}
