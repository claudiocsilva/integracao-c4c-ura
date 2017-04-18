
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestExternalPriceDocumentItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestExternalPriceDocumentItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceComponent" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UpdateEnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestExternalPriceDocumentItem", propOrder = {
    "priceComponent",
    "updateEnabledIndicator"
})
public class CustomerOrderMaintainRequestExternalPriceDocumentItem {

    @XmlElement(name = "PriceComponent")
    protected List<CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent> priceComponent;
    @XmlElement(name = "UpdateEnabledIndicator")
    protected Boolean updateEnabledIndicator;

    /**
     * Gets the value of the priceComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent> getPriceComponent() {
        if (priceComponent == null) {
            priceComponent = new ArrayList<CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent>();
        }
        return this.priceComponent;
    }

    /**
     * Obtém o valor da propriedade updateEnabledIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateEnabledIndicator() {
        return updateEnabledIndicator;
    }

    /**
     * Define o valor da propriedade updateEnabledIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateEnabledIndicator(Boolean value) {
        this.updateEnabledIndicator = value;
    }

}
