
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


/**
 * <p>Classe Java de CustomerOrderMaintainRequestExternalPriceDocument complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestExternalPriceDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://sap.com/xi/AP/Common/GDT}CalculationStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="PriceComponent" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestExternalPriceDocument", propOrder = {
    "status",
    "priceComponent"
})
public class CustomerOrderMaintainRequestExternalPriceDocument {

    @XmlElement(name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String status;
    @XmlElement(name = "PriceComponent")
    protected List<CustomerOrderMaintainRequestExternalPriceDocmentPriceComponent> priceComponent;

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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

}
