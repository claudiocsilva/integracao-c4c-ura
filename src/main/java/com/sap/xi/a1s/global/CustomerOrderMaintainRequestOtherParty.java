
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
 * <p>Classe Java de CustomerOrderMaintainRequestOtherParty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestOtherParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="RoleCode" type="{http://sap.com/xi/AP/Common/GDT}PartyRoleCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerOrderMaintainRequestOtherParty", propOrder = {
    "businessPartnerInternalID",
    "roleCode",
    "addressUUID",
    "address"
})
public class CustomerOrderMaintainRequestOtherParty {

    @XmlElement(name = "BusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerInternalID;
    @XmlElement(name = "RoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roleCode;
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
     * Obtém o valor da propriedade roleCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Define o valor da propriedade roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
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
