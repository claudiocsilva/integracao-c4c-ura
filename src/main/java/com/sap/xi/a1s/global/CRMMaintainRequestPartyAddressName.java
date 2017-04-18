
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.AddressRepresentationCode;
import com.sap.xi.ap.common.gdt.OrganisationName;


/**
 * <p>Classe Java de CRMMaintainRequestPartyAddressName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CRMMaintainRequestPartyAddressName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressRepresentationCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}OrganisationName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMMaintainRequestPartyAddressName", propOrder = {
    "addressRepresentationCode",
    "name"
})
public class CRMMaintainRequestPartyAddressName {

    @XmlElement(name = "AddressRepresentationCode")
    protected AddressRepresentationCode addressRepresentationCode;
    @XmlElement(name = "Name")
    protected OrganisationName name;

    /**
     * Obtém o valor da propriedade addressRepresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * Define o valor da propriedade addressRepresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setAddressRepresentationCode(AddressRepresentationCode value) {
        this.addressRepresentationCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setName(OrganisationName value) {
        this.name = value;
    }

}
