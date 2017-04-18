
package com.sap.xi.a1s.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestBundleMessage_sync_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestBundleMessage_sync_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOrder" type="{http://sap.com/xi/A1S/Global}CustomerOrderMaintainRequest_V1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestBundleMessage_sync_V1", propOrder = {
    "basicMessageHeader",
    "customerOrder"
})
public class CustomerOrderMaintainRequestBundleMessageSyncV1 {

    @XmlElement(name = "BasicMessageHeader")
    protected BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "CustomerOrder", required = true)
    protected List<CustomerOrderMaintainRequestV1> customerOrder;

    /**
     * Obtém o valor da propriedade basicMessageHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * Define o valor da propriedade basicMessageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public void setBasicMessageHeader(BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

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
     * {@link CustomerOrderMaintainRequestV1 }
     * 
     * 
     */
    public List<CustomerOrderMaintainRequestV1> getCustomerOrder() {
        if (customerOrder == null) {
            customerOrder = new ArrayList<CustomerOrderMaintainRequestV1>();
        }
        return this.customerOrder;
    }

}
