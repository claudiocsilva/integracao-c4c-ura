
package com.sap.xi.ap.common.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standard" type="{http://sap.com/xi/AP/Common/Global}ExchangeFaultData"/&gt;
 *         &lt;element name="addition" type="{http://sap.com/xi/AP/Common/Global}StandardFaultMessageExtension"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "standard",
    "addition"
})
@XmlRootElement(name = "StandardFaultMessage")
public class StandardFaultMessage {

    @XmlElement(required = true)
    protected ExchangeFaultData standard;
    @XmlElement(required = true)
    protected StandardFaultMessageExtension addition;

    /**
     * Obtém o valor da propriedade standard.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeFaultData }
     *     
     */
    public ExchangeFaultData getStandard() {
        return standard;
    }

    /**
     * Define o valor da propriedade standard.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeFaultData }
     *     
     */
    public void setStandard(ExchangeFaultData value) {
        this.standard = value;
    }

    /**
     * Obtém o valor da propriedade addition.
     * 
     * @return
     *     possible object is
     *     {@link StandardFaultMessageExtension }
     *     
     */
    public StandardFaultMessageExtension getAddition() {
        return addition;
    }

    /**
     * Define o valor da propriedade addition.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardFaultMessageExtension }
     *     
     */
    public void setAddition(StandardFaultMessageExtension value) {
        this.addition = value;
    }

}
