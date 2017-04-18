
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrganisationName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganisationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="FirstLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SecondLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="ThirdLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FourthLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationName", propOrder = {
    "formOfAddressCode",
    "firstLineName",
    "secondLineName",
    "thirdLineName",
    "fourthLineName"
})
public class OrganisationName {

    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "FirstLineName")
    protected String firstLineName;
    @XmlElement(name = "SecondLineName")
    protected String secondLineName;
    @XmlElement(name = "ThirdLineName")
    protected String thirdLineName;
    @XmlElement(name = "FourthLineName")
    protected String fourthLineName;

    /**
     * Obtém o valor da propriedade formOfAddressCode.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * Define o valor da propriedade formOfAddressCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * Obtém o valor da propriedade firstLineName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineName() {
        return firstLineName;
    }

    /**
     * Define o valor da propriedade firstLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineName(String value) {
        this.firstLineName = value;
    }

    /**
     * Obtém o valor da propriedade secondLineName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLineName() {
        return secondLineName;
    }

    /**
     * Define o valor da propriedade secondLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLineName(String value) {
        this.secondLineName = value;
    }

    /**
     * Obtém o valor da propriedade thirdLineName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdLineName() {
        return thirdLineName;
    }

    /**
     * Define o valor da propriedade thirdLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdLineName(String value) {
        this.thirdLineName = value;
    }

    /**
     * Obtém o valor da propriedade fourthLineName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthLineName() {
        return fourthLineName;
    }

    /**
     * Define o valor da propriedade fourthLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthLineName(String value) {
        this.fourthLineName = value;
    }

}
