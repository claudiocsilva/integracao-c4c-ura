
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestSalesUnitPartyWithoutContact complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestSalesUnitPartyWithoutContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganisationalCentreID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestSalesUnitPartyWithoutContact", propOrder = {
    "organisationalCentreID"
})
public class CustomerOrderMaintainRequestSalesUnitPartyWithoutContact {

    @XmlElement(name = "OrganisationalCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationalCentreID;

    /**
     * Obtém o valor da propriedade organisationalCentreID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationalCentreID() {
        return organisationalCentreID;
    }

    /**
     * Define o valor da propriedade organisationalCentreID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationalCentreID(String value) {
        this.organisationalCentreID = value;
    }

}
