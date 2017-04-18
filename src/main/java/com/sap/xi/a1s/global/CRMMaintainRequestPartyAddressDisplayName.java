
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.LONGName;


/**
 * <p>Classe Java de CRMMaintainRequestPartyAddressDisplayName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CRMMaintainRequestPartyAddressDisplayName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedName" type="{http://sap.com/xi/AP/Common/GDT}LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMMaintainRequestPartyAddressDisplayName", propOrder = {
    "formattedName"
})
public class CRMMaintainRequestPartyAddressDisplayName {

    @XmlElement(name = "FormattedName")
    protected LONGName formattedName;

    /**
     * Obtém o valor da propriedade formattedName.
     * 
     * @return
     *     possible object is
     *     {@link LONGName }
     *     
     */
    public LONGName getFormattedName() {
        return formattedName;
    }

    /**
     * Define o valor da propriedade formattedName.
     * 
     * @param value
     *     allowed object is
     *     {@link LONGName }
     *     
     */
    public void setFormattedName(LONGName value) {
        this.formattedName = value;
    }

}
