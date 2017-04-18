
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de Incoterms complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Incoterms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}IncotermsClassificationCode"/&gt;
 *         &lt;element name="TransferLocationName" type="{http://sap.com/xi/AP/Common/GDT}IncotermsTransferLocationName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms", propOrder = {
    "classificationCode",
    "transferLocationName"
})
public class Incoterms {

    @XmlElement(name = "ClassificationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String classificationCode;
    @XmlElement(name = "TransferLocationName")
    protected String transferLocationName;

    /**
     * Obtém o valor da propriedade classificationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Define o valor da propriedade classificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Obtém o valor da propriedade transferLocationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferLocationName() {
        return transferLocationName;
    }

    /**
     * Define o valor da propriedade transferLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferLocationName(String value) {
        this.transferLocationName = value;
    }

}
