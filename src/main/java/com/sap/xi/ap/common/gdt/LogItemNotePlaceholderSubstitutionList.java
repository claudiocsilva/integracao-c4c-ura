
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de LogItemNotePlaceholderSubstitutionList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LogItemNotePlaceholderSubstitutionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID"/&gt;
 *         &lt;element name="SecondPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FirstPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText"/&gt;
 *         &lt;element name="SecondPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItemNotePlaceholderSubstitutionList", propOrder = {
    "firstPlaceholderID",
    "secondPlaceholderID",
    "thirdPlaceholderID",
    "fourthPlaceholderID",
    "firstPlaceholderSubstitutionText",
    "secondPlaceholderSubstitutionText",
    "thirdPlaceholderSubstitutionText",
    "fourthPlaceholderSubstitutionText"
})
public class LogItemNotePlaceholderSubstitutionList {

    @XmlElement(name = "FirstPlaceholderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPlaceholderID;
    @XmlElement(name = "SecondPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPlaceholderID;
    @XmlElement(name = "ThirdPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPlaceholderID;
    @XmlElement(name = "FourthPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPlaceholderID;
    @XmlElement(name = "FirstPlaceholderSubstitutionText", required = true)
    protected String firstPlaceholderSubstitutionText;
    @XmlElement(name = "SecondPlaceholderSubstitutionText")
    protected String secondPlaceholderSubstitutionText;
    @XmlElement(name = "ThirdPlaceholderSubstitutionText")
    protected String thirdPlaceholderSubstitutionText;
    @XmlElement(name = "FourthPlaceholderSubstitutionText")
    protected String fourthPlaceholderSubstitutionText;

    /**
     * Obtém o valor da propriedade firstPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderID() {
        return firstPlaceholderID;
    }

    /**
     * Define o valor da propriedade firstPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderID(String value) {
        this.firstPlaceholderID = value;
    }

    /**
     * Obtém o valor da propriedade secondPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderID() {
        return secondPlaceholderID;
    }

    /**
     * Define o valor da propriedade secondPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderID(String value) {
        this.secondPlaceholderID = value;
    }

    /**
     * Obtém o valor da propriedade thirdPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderID() {
        return thirdPlaceholderID;
    }

    /**
     * Define o valor da propriedade thirdPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderID(String value) {
        this.thirdPlaceholderID = value;
    }

    /**
     * Obtém o valor da propriedade fourthPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderID() {
        return fourthPlaceholderID;
    }

    /**
     * Define o valor da propriedade fourthPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderID(String value) {
        this.fourthPlaceholderID = value;
    }

    /**
     * Obtém o valor da propriedade firstPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderSubstitutionText() {
        return firstPlaceholderSubstitutionText;
    }

    /**
     * Define o valor da propriedade firstPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderSubstitutionText(String value) {
        this.firstPlaceholderSubstitutionText = value;
    }

    /**
     * Obtém o valor da propriedade secondPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderSubstitutionText() {
        return secondPlaceholderSubstitutionText;
    }

    /**
     * Define o valor da propriedade secondPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderSubstitutionText(String value) {
        this.secondPlaceholderSubstitutionText = value;
    }

    /**
     * Obtém o valor da propriedade thirdPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderSubstitutionText() {
        return thirdPlaceholderSubstitutionText;
    }

    /**
     * Define o valor da propriedade thirdPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderSubstitutionText(String value) {
        this.thirdPlaceholderSubstitutionText = value;
    }

    /**
     * Obtém o valor da propriedade fourthPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderSubstitutionText() {
        return fourthPlaceholderSubstitutionText;
    }

    /**
     * Define o valor da propriedade fourthPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderSubstitutionText(String value) {
        this.fourthPlaceholderSubstitutionText = value;
    }

}
