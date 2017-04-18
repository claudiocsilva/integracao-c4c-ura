
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
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID;
import com.sap.xi.ap.common.gdt.EXTENDEDName;
import com.sap.xi.ap.common.gdt.SalesOrderBusinessTransactionDocumentReference;
import com.sap.xi.ap.common.gdt.UUID;
import com.sap.xi.documentservices.global.MaintenanceAttachmentFolder;


/**
 * <p>Classe Java de CustomerOrderMaintainRequest_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequest_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentProcessingTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="PostingDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="DataOriginTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentDataOriginTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="RequestExternalData" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestRequestExternalData_V1" minOccurs="0"/&gt;
 *         &lt;element name="OrderReasonCode" type="{http://sap.com/xi/AP/CRM/Global}CustomerOrderReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="BuyerParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithContact" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeResponsibleParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithoutContactWithEmployee" minOccurs="0"/&gt;
 *         &lt;element name="ProductRecipientParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithContact" minOccurs="0"/&gt;
 *         &lt;element name="SalesEmployeeParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWihoutContactMainIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesPartnerParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithMainIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesUnitParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestSalesUnitPartyWithoutContact" minOccurs="0"/&gt;
 *         &lt;element name="BillToParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithoutContact" minOccurs="0"/&gt;
 *         &lt;element name="EndBuyerParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithContact" minOccurs="0"/&gt;
 *         &lt;element name="PayerParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithoutContact" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithMainIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestOtherParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApproverParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyWithMainIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SellerParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestSalesUnitPartyWithoutContact" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesAndServiceBusinessArea" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestSalesAndServiceBusinessArea_V1" minOccurs="0"/&gt;
 *         &lt;element name="RequestedFulfillmentPeriod" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTerms" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestDeliveryTerms_V1" minOccurs="0"/&gt;
 *         &lt;element name="PricingTerms" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPricingTerms_V1" minOccurs="0"/&gt;
 *         &lt;element name="SalesTerms" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestSalesTerms_V1" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTerms" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestCashDiscountTerms_V1" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestItem_V1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentReference" type="{http://sap.com/xi/AP/Common/GDT}SalesOrderBusinessTransactionDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceCalculation" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPriceAndTaxCalculation_V1" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="ExternalPriceCalculation" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestExternalPriceDocument" minOccurs="0"/&gt;
 *         &lt;element name="SubmitForApproval" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="RequestSalesOrderRequest" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FinishSalesOrder" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="FulfilmentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentFulfilmentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="InvoicingBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}InvoicingBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestStatus" minOccurs="0"/&gt;
 *         &lt;element name="CompleteSalesOrderIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TotalValues" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestTotalValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="businessTransactionDocumentReferenceListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="salesEmployeePartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ApproverPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="otherPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="competitorPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="salesPartnerListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="itemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="textListCompleteTransimissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequest_V1", propOrder = {
    "objectNodeSenderTechnicalID",
    "id",
    "uuid",
    "processingTypeCode",
    "buyerID",
    "postingDateTime",
    "name",
    "dataOriginTypeCode",
    "requestExternalData",
    "orderReasonCode",
    "buyerParty",
    "employeeResponsibleParty",
    "productRecipientParty",
    "salesEmployeeParty",
    "salesPartnerParty",
    "salesUnitParty",
    "billToParty",
    "endBuyerParty",
    "payerParty",
    "competitorParty",
    "otherParty",
    "approverParty",
    "sellerParty",
    "party",
    "salesAndServiceBusinessArea",
    "requestedFulfillmentPeriod",
    "deliveryTerms",
    "pricingTerms",
    "salesTerms",
    "cashDiscountTerms",
    "item",
    "businessTransactionDocumentReference",
    "priceCalculation",
    "text",
    "attachmentFolder",
    "changeStateID",
    "externalPriceCalculation",
    "submitForApproval",
    "requestSalesOrderRequest",
    "finishSalesOrder",
    "fulfillmentStatusCode",
    "fulfilmentBlockingReasonCode",
    "invoicingBlockingReasonCode",
    "status",
    "completeSalesOrderIndicator",
    "totalValues"
})
public class CustomerOrderMaintainRequestV1 {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ID")
    protected BusinessTransactionDocumentID id;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ProcessingTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingTypeCode;
    @XmlElement(name = "BuyerID")
    protected BusinessTransactionDocumentID buyerID;
    @XmlElement(name = "PostingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDateTime;
    @XmlElement(name = "Name")
    protected EXTENDEDName name;
    @XmlElement(name = "DataOriginTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataOriginTypeCode;
    @XmlElement(name = "RequestExternalData")
    protected CustomerOrderMaintainRequestRequestExternalDataV1 requestExternalData;
    @XmlElement(name = "OrderReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderReasonCode;
    @XmlElement(name = "BuyerParty")
    protected CustomerOrderMaintainRequestPartyWithContact buyerParty;
    @XmlElement(name = "EmployeeResponsibleParty")
    protected CustomerOrderMaintainRequestPartyWithoutContactWithEmployee employeeResponsibleParty;
    @XmlElement(name = "ProductRecipientParty")
    protected CustomerOrderMaintainRequestPartyWithContact productRecipientParty;
    @XmlElement(name = "SalesEmployeeParty")
    protected List<CustomerOrderMaintainRequestPartyWihoutContactMainIndicator> salesEmployeeParty;
    @XmlElement(name = "SalesPartnerParty")
    protected List<CustomerOrderMaintainRequestPartyWithMainIndicator> salesPartnerParty;
    @XmlElement(name = "SalesUnitParty")
    protected CustomerOrderMaintainRequestSalesUnitPartyWithoutContact salesUnitParty;
    @XmlElement(name = "BillToParty")
    protected CustomerOrderMaintainRequestPartyWithoutContact billToParty;
    @XmlElement(name = "EndBuyerParty")
    protected CustomerOrderMaintainRequestPartyWithContact endBuyerParty;
    @XmlElement(name = "PayerParty")
    protected CustomerOrderMaintainRequestPartyWithoutContact payerParty;
    @XmlElement(name = "CompetitorParty")
    protected List<CustomerOrderMaintainRequestPartyWithMainIndicator> competitorParty;
    @XmlElement(name = "OtherParty")
    protected List<CustomerOrderMaintainRequestOtherParty> otherParty;
    @XmlElement(name = "ApproverParty")
    protected List<CustomerOrderMaintainRequestPartyWithMainIndicator> approverParty;
    @XmlElement(name = "SellerParty")
    protected CustomerOrderMaintainRequestSalesUnitPartyWithoutContact sellerParty;
    @XmlElement(name = "Party")
    protected List<CustomerOrderMaintainRequestParty> party;
    @XmlElement(name = "SalesAndServiceBusinessArea")
    protected CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 salesAndServiceBusinessArea;
    @XmlElement(name = "RequestedFulfillmentPeriod")
    protected CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod requestedFulfillmentPeriod;
    @XmlElement(name = "DeliveryTerms")
    protected CustomerOrderMaintainRequestDeliveryTermsV1 deliveryTerms;
    @XmlElement(name = "PricingTerms")
    protected CustomerOrderMaintainRequestPricingTermsV1 pricingTerms;
    @XmlElement(name = "SalesTerms")
    protected CustomerOrderMaintainRequestSalesTermsV1 salesTerms;
    @XmlElement(name = "CashDiscountTerms")
    protected CustomerOrderMaintainRequestCashDiscountTermsV1 cashDiscountTerms;
    @XmlElement(name = "Item")
    protected List<CustomerOrderMaintainRequestItemV1> item;
    @XmlElement(name = "BusinessTransactionDocumentReference")
    protected List<SalesOrderBusinessTransactionDocumentReference> businessTransactionDocumentReference;
    @XmlElement(name = "PriceCalculation")
    protected CustomerOrderMaintainRequestPriceAndTaxCalculationV1 priceCalculation;
    @XmlElement(name = "Text")
    protected List<CustomerOrderMaintainRequestText> text;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "ExternalPriceCalculation")
    protected CustomerOrderMaintainRequestExternalPriceDocument externalPriceCalculation;
    @XmlElement(name = "SubmitForApproval")
    protected Boolean submitForApproval;
    @XmlElement(name = "RequestSalesOrderRequest")
    protected Boolean requestSalesOrderRequest;
    @XmlElement(name = "FinishSalesOrder")
    protected Boolean finishSalesOrder;
    @XmlElement(name = "FulfillmentStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fulfillmentStatusCode;
    @XmlElement(name = "FulfilmentBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fulfilmentBlockingReasonCode;
    @XmlElement(name = "InvoicingBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoicingBlockingReasonCode;
    @XmlElement(name = "Status")
    protected CustomerOrderMaintainRequestStatus status;
    @XmlElement(name = "CompleteSalesOrderIndicator")
    protected Boolean completeSalesOrderIndicator;
    @XmlElement(name = "TotalValues")
    protected CustomerOrderMaintainRequestTotalValues totalValues;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "businessTransactionDocumentReferenceListCompleteTransmissionIndicator")
    protected Boolean businessTransactionDocumentReferenceListCompleteTransmissionIndicator;
    @XmlAttribute(name = "salesEmployeePartyListCompleteTransmissionIndicator")
    protected Boolean salesEmployeePartyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ApproverPartyListCompleteTransmissionIndicator")
    protected Boolean approverPartyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "otherPartyListCompleteTransmissionIndicator")
    protected Boolean otherPartyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "competitorPartyListCompleteTransmissionIndicator")
    protected Boolean competitorPartyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "salesPartnerListCompleteTransmissionIndicator")
    protected Boolean salesPartnerListCompleteTransmissionIndicator;
    @XmlAttribute(name = "itemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;
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
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setID(BusinessTransactionDocumentID value) {
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
     * Obtém o valor da propriedade buyerID.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getBuyerID() {
        return buyerID;
    }

    /**
     * Define o valor da propriedade buyerID.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setBuyerID(BusinessTransactionDocumentID value) {
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
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link EXTENDEDName }
     *     
     */
    public EXTENDEDName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTENDEDName }
     *     
     */
    public void setName(EXTENDEDName value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade dataOriginTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOriginTypeCode() {
        return dataOriginTypeCode;
    }

    /**
     * Define o valor da propriedade dataOriginTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOriginTypeCode(String value) {
        this.dataOriginTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade requestExternalData.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestRequestExternalDataV1 }
     *     
     */
    public CustomerOrderMaintainRequestRequestExternalDataV1 getRequestExternalData() {
        return requestExternalData;
    }

    /**
     * Define o valor da propriedade requestExternalData.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestRequestExternalDataV1 }
     *     
     */
    public void setRequestExternalData(CustomerOrderMaintainRequestRequestExternalDataV1 value) {
        this.requestExternalData = value;
    }

    /**
     * Obtém o valor da propriedade orderReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Define o valor da propriedade orderReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReasonCode(String value) {
        this.orderReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade buyerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithContact getBuyerParty() {
        return buyerParty;
    }

    /**
     * Define o valor da propriedade buyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public void setBuyerParty(CustomerOrderMaintainRequestPartyWithContact value) {
        this.buyerParty = value;
    }

    /**
     * Obtém o valor da propriedade employeeResponsibleParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContactWithEmployee }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithoutContactWithEmployee getEmployeeResponsibleParty() {
        return employeeResponsibleParty;
    }

    /**
     * Define o valor da propriedade employeeResponsibleParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContactWithEmployee }
     *     
     */
    public void setEmployeeResponsibleParty(CustomerOrderMaintainRequestPartyWithoutContactWithEmployee value) {
        this.employeeResponsibleParty = value;
    }

    /**
     * Obtém o valor da propriedade productRecipientParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithContact getProductRecipientParty() {
        return productRecipientParty;
    }

    /**
     * Define o valor da propriedade productRecipientParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public void setProductRecipientParty(CustomerOrderMaintainRequestPartyWithContact value) {
        this.productRecipientParty = value;
    }

    /**
     * Gets the value of the salesEmployeeParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesEmployeeParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesEmployeeParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestPartyWihoutContactMainIndicator }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestPartyWihoutContactMainIndicator> getSalesEmployeeParty() {
        if (salesEmployeeParty == null) {
            salesEmployeeParty = new ArrayList<CustomerOrderMaintainRequestPartyWihoutContactMainIndicator>();
        }
        return this.salesEmployeeParty;
    }

    /**
     * Gets the value of the salesPartnerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesPartnerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPartnerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestPartyWithMainIndicator }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestPartyWithMainIndicator> getSalesPartnerParty() {
        if (salesPartnerParty == null) {
            salesPartnerParty = new ArrayList<CustomerOrderMaintainRequestPartyWithMainIndicator>();
        }
        return this.salesPartnerParty;
    }

    /**
     * Obtém o valor da propriedade salesUnitParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestSalesUnitPartyWithoutContact }
     *     
     */
    public CustomerOrderMaintainRequestSalesUnitPartyWithoutContact getSalesUnitParty() {
        return salesUnitParty;
    }

    /**
     * Define o valor da propriedade salesUnitParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestSalesUnitPartyWithoutContact }
     *     
     */
    public void setSalesUnitParty(CustomerOrderMaintainRequestSalesUnitPartyWithoutContact value) {
        this.salesUnitParty = value;
    }

    /**
     * Obtém o valor da propriedade billToParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithoutContact getBillToParty() {
        return billToParty;
    }

    /**
     * Define o valor da propriedade billToParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public void setBillToParty(CustomerOrderMaintainRequestPartyWithoutContact value) {
        this.billToParty = value;
    }

    /**
     * Obtém o valor da propriedade endBuyerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithContact getEndBuyerParty() {
        return endBuyerParty;
    }

    /**
     * Define o valor da propriedade endBuyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithContact }
     *     
     */
    public void setEndBuyerParty(CustomerOrderMaintainRequestPartyWithContact value) {
        this.endBuyerParty = value;
    }

    /**
     * Obtém o valor da propriedade payerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public CustomerOrderMaintainRequestPartyWithoutContact getPayerParty() {
        return payerParty;
    }

    /**
     * Define o valor da propriedade payerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPartyWithoutContact }
     *     
     */
    public void setPayerParty(CustomerOrderMaintainRequestPartyWithoutContact value) {
        this.payerParty = value;
    }

    /**
     * Gets the value of the competitorParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitorParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitorParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestPartyWithMainIndicator }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestPartyWithMainIndicator> getCompetitorParty() {
        if (competitorParty == null) {
            competitorParty = new ArrayList<CustomerOrderMaintainRequestPartyWithMainIndicator>();
        }
        return this.competitorParty;
    }

    /**
     * Gets the value of the otherParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestOtherParty }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestOtherParty> getOtherParty() {
        if (otherParty == null) {
            otherParty = new ArrayList<CustomerOrderMaintainRequestOtherParty>();
        }
        return this.otherParty;
    }

    /**
     * Gets the value of the approverParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approverParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproverParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestPartyWithMainIndicator }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestPartyWithMainIndicator> getApproverParty() {
        if (approverParty == null) {
            approverParty = new ArrayList<CustomerOrderMaintainRequestPartyWithMainIndicator>();
        }
        return this.approverParty;
    }

    /**
     * Obtém o valor da propriedade sellerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestSalesUnitPartyWithoutContact }
     *     
     */
    public CustomerOrderMaintainRequestSalesUnitPartyWithoutContact getSellerParty() {
        return sellerParty;
    }

    /**
     * Define o valor da propriedade sellerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestSalesUnitPartyWithoutContact }
     *     
     */
    public void setSellerParty(CustomerOrderMaintainRequestSalesUnitPartyWithoutContact value) {
        this.sellerParty = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestParty }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestParty> getParty() {
        if (party == null) {
            party = new ArrayList<CustomerOrderMaintainRequestParty>();
        }
        return this.party;
    }

    /**
     * Obtém o valor da propriedade salesAndServiceBusinessArea.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 }
     *     
     */
    public CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 getSalesAndServiceBusinessArea() {
        return salesAndServiceBusinessArea;
    }

    /**
     * Define o valor da propriedade salesAndServiceBusinessArea.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 }
     *     
     */
    public void setSalesAndServiceBusinessArea(CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 value) {
        this.salesAndServiceBusinessArea = value;
    }

    /**
     * Obtém o valor da propriedade requestedFulfillmentPeriod.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod }
     *     
     */
    public CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod getRequestedFulfillmentPeriod() {
        return requestedFulfillmentPeriod;
    }

    /**
     * Define o valor da propriedade requestedFulfillmentPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod }
     *     
     */
    public void setRequestedFulfillmentPeriod(CustomerOrderMaintainRequestRequestedFulfillmentPeriodPeriod value) {
        this.requestedFulfillmentPeriod = value;
    }

    /**
     * Obtém o valor da propriedade deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestDeliveryTermsV1 }
     *     
     */
    public CustomerOrderMaintainRequestDeliveryTermsV1 getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Define o valor da propriedade deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestDeliveryTermsV1 }
     *     
     */
    public void setDeliveryTerms(CustomerOrderMaintainRequestDeliveryTermsV1 value) {
        this.deliveryTerms = value;
    }

    /**
     * Obtém o valor da propriedade pricingTerms.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPricingTermsV1 }
     *     
     */
    public CustomerOrderMaintainRequestPricingTermsV1 getPricingTerms() {
        return pricingTerms;
    }

    /**
     * Define o valor da propriedade pricingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPricingTermsV1 }
     *     
     */
    public void setPricingTerms(CustomerOrderMaintainRequestPricingTermsV1 value) {
        this.pricingTerms = value;
    }

    /**
     * Obtém o valor da propriedade salesTerms.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestSalesTermsV1 }
     *     
     */
    public CustomerOrderMaintainRequestSalesTermsV1 getSalesTerms() {
        return salesTerms;
    }

    /**
     * Define o valor da propriedade salesTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestSalesTermsV1 }
     *     
     */
    public void setSalesTerms(CustomerOrderMaintainRequestSalesTermsV1 value) {
        this.salesTerms = value;
    }

    /**
     * Obtém o valor da propriedade cashDiscountTerms.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestCashDiscountTermsV1 }
     *     
     */
    public CustomerOrderMaintainRequestCashDiscountTermsV1 getCashDiscountTerms() {
        return cashDiscountTerms;
    }

    /**
     * Define o valor da propriedade cashDiscountTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestCashDiscountTermsV1 }
     *     
     */
    public void setCashDiscountTerms(CustomerOrderMaintainRequestCashDiscountTermsV1 value) {
        this.cashDiscountTerms = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestItemV1 }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestItemV1> getItem() {
        if (item == null) {
            item = new ArrayList<CustomerOrderMaintainRequestItemV1>();
        }
        return this.item;
    }

    /**
     * Gets the value of the businessTransactionDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessTransactionDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessTransactionDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderBusinessTransactionDocumentReference }
     * 
     * 
     */
    public List<SalesOrderBusinessTransactionDocumentReference> getBusinessTransactionDocumentReference() {
        if (businessTransactionDocumentReference == null) {
            businessTransactionDocumentReference = new ArrayList<SalesOrderBusinessTransactionDocumentReference>();
        }
        return this.businessTransactionDocumentReference;
    }

    /**
     * Obtém o valor da propriedade priceCalculation.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationV1 }
     *     
     */
    public CustomerOrderMaintainRequestPriceAndTaxCalculationV1 getPriceCalculation() {
        return priceCalculation;
    }

    /**
     * Define o valor da propriedade priceCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestPriceAndTaxCalculationV1 }
     *     
     */
    public void setPriceCalculation(CustomerOrderMaintainRequestPriceAndTaxCalculationV1 value) {
        this.priceCalculation = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestText }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestText> getText() {
        if (text == null) {
            text = new ArrayList<CustomerOrderMaintainRequestText>();
        }
        return this.text;
    }

    /**
     * Obtém o valor da propriedade attachmentFolder.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public MaintenanceAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * Define o valor da propriedade attachmentFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAttachmentFolder }
     *     
     */
    public void setAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * Obtém o valor da propriedade changeStateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * Define o valor da propriedade changeStateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * Obtém o valor da propriedade externalPriceCalculation.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestExternalPriceDocument }
     *     
     */
    public CustomerOrderMaintainRequestExternalPriceDocument getExternalPriceCalculation() {
        return externalPriceCalculation;
    }

    /**
     * Define o valor da propriedade externalPriceCalculation.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestExternalPriceDocument }
     *     
     */
    public void setExternalPriceCalculation(CustomerOrderMaintainRequestExternalPriceDocument value) {
        this.externalPriceCalculation = value;
    }

    /**
     * Obtém o valor da propriedade submitForApproval.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmitForApproval() {
        return submitForApproval;
    }

    /**
     * Define o valor da propriedade submitForApproval.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmitForApproval(Boolean value) {
        this.submitForApproval = value;
    }

    /**
     * Obtém o valor da propriedade requestSalesOrderRequest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestSalesOrderRequest() {
        return requestSalesOrderRequest;
    }

    /**
     * Define o valor da propriedade requestSalesOrderRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestSalesOrderRequest(Boolean value) {
        this.requestSalesOrderRequest = value;
    }

    /**
     * Obtém o valor da propriedade finishSalesOrder.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinishSalesOrder() {
        return finishSalesOrder;
    }

    /**
     * Define o valor da propriedade finishSalesOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinishSalesOrder(Boolean value) {
        this.finishSalesOrder = value;
    }

    /**
     * Obtém o valor da propriedade fulfillmentStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentStatusCode() {
        return fulfillmentStatusCode;
    }

    /**
     * Define o valor da propriedade fulfillmentStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentStatusCode(String value) {
        this.fulfillmentStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade fulfilmentBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfilmentBlockingReasonCode() {
        return fulfilmentBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade fulfilmentBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfilmentBlockingReasonCode(String value) {
        this.fulfilmentBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade invoicingBlockingReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingBlockingReasonCode() {
        return invoicingBlockingReasonCode;
    }

    /**
     * Define o valor da propriedade invoicingBlockingReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingBlockingReasonCode(String value) {
        this.invoicingBlockingReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestStatus }
     *     
     */
    public CustomerOrderMaintainRequestStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestStatus }
     *     
     */
    public void setStatus(CustomerOrderMaintainRequestStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade completeSalesOrderIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteSalesOrderIndicator() {
        return completeSalesOrderIndicator;
    }

    /**
     * Define o valor da propriedade completeSalesOrderIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteSalesOrderIndicator(Boolean value) {
        this.completeSalesOrderIndicator = value;
    }

    /**
     * Obtém o valor da propriedade totalValues.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderMaintainRequestTotalValues }
     *     
     */
    public CustomerOrderMaintainRequestTotalValues getTotalValues() {
        return totalValues;
    }

    /**
     * Define o valor da propriedade totalValues.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderMaintainRequestTotalValues }
     *     
     */
    public void setTotalValues(CustomerOrderMaintainRequestTotalValues value) {
        this.totalValues = value;
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
     * Obtém o valor da propriedade businessTransactionDocumentReferenceListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator() {
        return businessTransactionDocumentReferenceListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade businessTransactionDocumentReferenceListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessTransactionDocumentReferenceListCompleteTransmissionIndicator(Boolean value) {
        this.businessTransactionDocumentReferenceListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade salesEmployeePartyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesEmployeePartyListCompleteTransmissionIndicator() {
        return salesEmployeePartyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade salesEmployeePartyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesEmployeePartyListCompleteTransmissionIndicator(Boolean value) {
        this.salesEmployeePartyListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade approverPartyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproverPartyListCompleteTransmissionIndicator() {
        return approverPartyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade approverPartyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproverPartyListCompleteTransmissionIndicator(Boolean value) {
        this.approverPartyListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade otherPartyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherPartyListCompleteTransmissionIndicator() {
        return otherPartyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade otherPartyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherPartyListCompleteTransmissionIndicator(Boolean value) {
        this.otherPartyListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade competitorPartyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompetitorPartyListCompleteTransmissionIndicator() {
        return competitorPartyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade competitorPartyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompetitorPartyListCompleteTransmissionIndicator(Boolean value) {
        this.competitorPartyListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade salesPartnerListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesPartnerListCompleteTransmissionIndicator() {
        return salesPartnerListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade salesPartnerListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesPartnerListCompleteTransmissionIndicator(Boolean value) {
        this.salesPartnerListCompleteTransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade itemListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemListCompleteTransmissionIndicator() {
        return itemListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade itemListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemListCompleteTransmissionIndicator(Boolean value) {
        this.itemListCompleteTransmissionIndicator = value;
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
