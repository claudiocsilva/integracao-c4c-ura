
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.Log;


/**
 * <p>Classe Java de CustomerOrderMaintainConfirmationBundleMessage_sync_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainConfirmationBundleMessage_sync_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerOrder" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainBundleConfirmation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainConfirmationBundleMessage_sync_V1", propOrder = {
    "customerOrder",
    "log"
})
public class CustomerOrderMaintainConfirmationBundleMessageSyncV1 {

    @XmlElement(name = "CustomerOrder")
    protected List<CustomerOrderMaintainBundleConfirmation> customerOrder;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Gets the value of the customerOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderMaintainBundleConfirmation }
     * 
     * 
     */
    public List<CustomerOrderMaintainBundleConfirmation> getCustomerOrder() {
        if (customerOrder == null) {
            customerOrder = new ArrayList<CustomerOrderMaintainBundleConfirmation>();
        }
        return this.customerOrder;
    }

    /**
     * Obtém o valor da propriedade log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define o valor da propriedade log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
