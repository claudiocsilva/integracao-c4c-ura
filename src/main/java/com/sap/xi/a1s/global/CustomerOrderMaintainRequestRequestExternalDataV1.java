
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.PriceRecalculationTypeCode;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestRequestExternalData_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestRequestExternalData_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceRecalculationTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PriceRecalculationTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CheckNecessity" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestRequestExternalData_V1", propOrder = {
    "priceRecalculationTypeCode"
})
public class CustomerOrderMaintainRequestRequestExternalDataV1 {

    @XmlElement(name = "PriceRecalculationTypeCode")
    protected PriceRecalculationTypeCode priceRecalculationTypeCode;
    @XmlAttribute(name = "CheckNecessity")
    protected Boolean checkNecessity;

    /**
     * Obtém o valor da propriedade priceRecalculationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceRecalculationTypeCode }
     *     
     */
    public PriceRecalculationTypeCode getPriceRecalculationTypeCode() {
        return priceRecalculationTypeCode;
    }

    /**
     * Define o valor da propriedade priceRecalculationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRecalculationTypeCode }
     *     
     */
    public void setPriceRecalculationTypeCode(PriceRecalculationTypeCode value) {
        this.priceRecalculationTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade checkNecessity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckNecessity() {
        return checkNecessity;
    }

    /**
     * Define o valor da propriedade checkNecessity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckNecessity(Boolean value) {
        this.checkNecessity = value;
    }

}
