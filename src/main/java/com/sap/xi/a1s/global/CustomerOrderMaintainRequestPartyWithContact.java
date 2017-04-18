
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
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestPartyWithContact complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestPartyWithContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="AddressUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestBundleAddressInformation" minOccurs="0"/&gt;
 *         &lt;element name="ContactParty" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestPartyContactParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="contactPartyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestPartyWithContact", propOrder = {
    "businessPartnerInternalID",
    "addressUUID",
    "address",
    "contactParty"
})
public class CustomerOrderMaintainRequestPartyWithContact {

    @XmlElement(name = "BusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerInternalID;
    @XmlElement(name = "AddressUUID")
    protected UUID addressUUID;
    @XmlElement(name = "Address")
    protected CRMMaintainRequestBundleAddressInformation address;
    @XmlElement(name = "ContactParty")
    protected List<CustomerOrderMaintainRequestPartyContactParty> contactParty;
    @XmlAttribute(name = "contactPartyListCompleteTransmissionIndicator")
    protected Boolean contactPartyListCompleteTransmissionIndicator;

    /**
     * Obtém o valor da propriedade businessPartnerInternalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerInternalID() {
        return businessPartnerInternalID;
    }

    /**
     * Define o valor da propriedade businessPartnerInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerInternalID(String value) {
        this.businessPartnerInternalID = value;
    }

    /**
     * Obtém o valor da propriedade addressUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getAddressUUID() {
        return addressUUID;
    }

    /**
     * Define o valor da propriedade addressUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setAddressUUID(UUID value) {
        this.addressUUID = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link CRMMaintainRequestBundleAddressInformation }
     *     
     */
    public CRMMaintainRequestBundleAddressInformation getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMMaintainRequestBundleAddressInformation }
     *     
     */
    public void setAddress(CRMMaintainRequestBundleAddressInformation value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestPartyContactParty }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestPartyContactParty> getContactParty() {
        if (contactParty == null) {
            contactParty = new ArrayList<CustomerOrderMaintainRequestPartyContactParty>();
        }
        return this.contactParty;
    }

    /**
     * Obtém o valor da propriedade contactPartyListCompleteTransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactPartyListCompleteTransmissionIndicator() {
        return contactPartyListCompleteTransmissionIndicator;
    }

    /**
     * Define o valor da propriedade contactPartyListCompleteTransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactPartyListCompleteTransmissionIndicator(Boolean value) {
        this.contactPartyListCompleteTransmissionIndicator = value;
    }

}
