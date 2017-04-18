
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestPartyWithMainIndicator complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestPartyWithMainIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="MainIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AddressUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestBundleAddressInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestPartyWithMainIndicator", propOrder = {
    "businessPartnerInternalID",
    "mainIndicator",
    "addressUUID",
    "address"
})
public class CustomerOrderMaintainRequestPartyWithMainIndicator {

    @XmlElement(name = "BusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerInternalID;
    @XmlElement(name = "MainIndicator")
    protected Boolean mainIndicator;
    @XmlElement(name = "AddressUUID")
    protected UUID addressUUID;
    @XmlElement(name = "Address")
    protected CRMMaintainRequestBundleAddressInformation address;

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
     * Obtém o valor da propriedade mainIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainIndicator() {
        return mainIndicator;
    }

    /**
     * Define o valor da propriedade mainIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainIndicator(Boolean value) {
        this.mainIndicator = value;
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

}
