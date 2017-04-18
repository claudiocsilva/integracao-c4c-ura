
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.CommunicationMediumTypeCode;
import com.sap.xi.ap.common.gdt.EmailURI;


/**
 * <p>Classe Java de CRMMaintainRequestBundleAddressInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CRMMaintainRequestBundleAddressInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="PreferredCommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestPartyAddressName" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestPartyAddressDisplayName" minOccurs="0"/&gt;
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestBundleAddressPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}CRMMaintainRequestBundleAddressTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CRMMaintainRequestBundleAddressInformation", propOrder = {
    "correspondenceLanguageCode",
    "preferredCommunicationMediumTypeCode",
    "name",
    "displayName",
    "emailURI",
    "facsimileFormattedNumberDescription",
    "postalAddress",
    "telephone",
    "webURI"
})
public class CRMMaintainRequestBundleAddressInformation {

    @XmlElement(name = "CorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String correspondenceLanguageCode;
    @XmlElement(name = "PreferredCommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode preferredCommunicationMediumTypeCode;
    @XmlElement(name = "Name")
    protected CRMMaintainRequestPartyAddressName name;
    @XmlElement(name = "DisplayName")
    protected CRMMaintainRequestPartyAddressDisplayName displayName;
    @XmlElement(name = "EmailURI")
    protected EmailURI emailURI;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "PostalAddress")
    protected CRMMaintainRequestBundleAddressPostalAddress postalAddress;
    @XmlElement(name = "Telephone")
    protected List<CRMMaintainRequestBundleAddressTelephone> telephone;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;

    /**
     * Obtém o valor da propriedade correspondenceLanguageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceLanguageCode() {
        return correspondenceLanguageCode;
    }

    /**
     * Define o valor da propriedade correspondenceLanguageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceLanguageCode(String value) {
        this.correspondenceLanguageCode = value;
    }

    /**
     * Obtém o valor da propriedade preferredCommunicationMediumTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public CommunicationMediumTypeCode getPreferredCommunicationMediumTypeCode() {
        return preferredCommunicationMediumTypeCode;
    }

    /**
     * Define o valor da propriedade preferredCommunicationMediumTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public void setPreferredCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.preferredCommunicationMediumTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link CRMMaintainRequestPartyAddressName }
     *     
     */
    public CRMMaintainRequestPartyAddressName getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMMaintainRequestPartyAddressName }
     *     
     */
    public void setName(CRMMaintainRequestPartyAddressName value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link CRMMaintainRequestPartyAddressDisplayName }
     *     
     */
    public CRMMaintainRequestPartyAddressDisplayName getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMMaintainRequestPartyAddressDisplayName }
     *     
     */
    public void setDisplayName(CRMMaintainRequestPartyAddressDisplayName value) {
        this.displayName = value;
    }

    /**
     * Obtém o valor da propriedade emailURI.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEmailURI() {
        return emailURI;
    }

    /**
     * Define o valor da propriedade emailURI.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEmailURI(EmailURI value) {
        this.emailURI = value;
    }

    /**
     * Obtém o valor da propriedade facsimileFormattedNumberDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacsimileFormattedNumberDescription() {
        return facsimileFormattedNumberDescription;
    }

    /**
     * Define o valor da propriedade facsimileFormattedNumberDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacsimileFormattedNumberDescription(String value) {
        this.facsimileFormattedNumberDescription = value;
    }

    /**
     * Obtém o valor da propriedade postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link CRMMaintainRequestBundleAddressPostalAddress }
     *     
     */
    public CRMMaintainRequestBundleAddressPostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Define o valor da propriedade postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMMaintainRequestBundleAddressPostalAddress }
     *     
     */
    public void setPostalAddress(CRMMaintainRequestBundleAddressPostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMMaintainRequestBundleAddressTelephone }
     * 
     * 
     */
    public List<CRMMaintainRequestBundleAddressTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CRMMaintainRequestBundleAddressTelephone>();
        }
        return this.telephone;
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
