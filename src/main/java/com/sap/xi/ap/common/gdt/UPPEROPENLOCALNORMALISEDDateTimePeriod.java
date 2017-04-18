
package com.sap.xi.ap.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.basis.global.LOCALNORMALISEDDateTime;


/**
 * <p>Classe Java de UPPEROPEN_LOCALNORMALISED_DateTimePeriod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UPPEROPEN_LOCALNORMALISED_DateTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCALNORMALISED_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://sap.com/xi/BASIS/Global}LOCALNORMALISED_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPPEROPEN_LOCALNORMALISED_DateTimePeriod", propOrder = {
    "startDateTime",
    "endDateTime"
})
public class UPPEROPENLOCALNORMALISEDDateTimePeriod {

    @XmlElement(name = "StartDateTime")
    protected LOCALNORMALISEDDateTime startDateTime;
    @XmlElement(name = "EndDateTime")
    protected LOCALNORMALISEDDateTime endDateTime;

    /**
     * Obtém o valor da propriedade startDateTime.
     * 
     * @return
     *     possible object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public LOCALNORMALISEDDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Define o valor da propriedade startDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public void setStartDateTime(LOCALNORMALISEDDateTime value) {
        this.startDateTime = value;
    }

    /**
     * Obtém o valor da propriedade endDateTime.
     * 
     * @return
     *     possible object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public LOCALNORMALISEDDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Define o valor da propriedade endDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALNORMALISEDDateTime }
     *     
     */
    public void setEndDateTime(LOCALNORMALISEDDateTime value) {
        this.endDateTime = value;
    }

}
