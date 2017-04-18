
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.Quantity;
import com.sap.xi.ap.common.gdt.UPPEROPENLOCALNORMALISEDDateTimePeriod;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestItemScheduleLine_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestItemScheduleLine_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemScheduleLineID" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="DateTimePeriod" type="{http://sap.com/xi/AP/Common/GDT}UPPEROPEN_LOCALNORMALISED_DateTimePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestItemScheduleLine_V1", propOrder = {
    "id",
    "quantity",
    "dateTimePeriod"
})
public class CustomerOrderMaintainRequestItemScheduleLineV1 {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "Quantity")
    protected Quantity quantity;
    @XmlElement(name = "DateTimePeriod")
    protected UPPEROPENLOCALNORMALISEDDateTimePeriod dateTimePeriod;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade dateTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link UPPEROPENLOCALNORMALISEDDateTimePeriod }
     *     
     */
    public UPPEROPENLOCALNORMALISEDDateTimePeriod getDateTimePeriod() {
        return dateTimePeriod;
    }

    /**
     * Define o valor da propriedade dateTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link UPPEROPENLOCALNORMALISEDDateTimePeriod }
     *     
     */
    public void setDateTimePeriod(UPPEROPENLOCALNORMALISEDDateTimePeriod value) {
        this.dateTimePeriod = value;
    }

}
