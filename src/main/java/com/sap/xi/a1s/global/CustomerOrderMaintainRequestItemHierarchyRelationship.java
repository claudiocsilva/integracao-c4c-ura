
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.UUID;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestItemHierarchyRelationship complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestItemHierarchyRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentItemID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="ParentItemUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestItemHierarchyRelationship", propOrder = {
    "parentItemID",
    "parentItemUUID"
})
public class CustomerOrderMaintainRequestItemHierarchyRelationship {

    @XmlElement(name = "ParentItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String parentItemID;
    @XmlElement(name = "ParentItemUUID")
    protected UUID parentItemUUID;

    /**
     * Obtém o valor da propriedade parentItemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentItemID() {
        return parentItemID;
    }

    /**
     * Define o valor da propriedade parentItemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentItemID(String value) {
        this.parentItemID = value;
    }

    /**
     * Obtém o valor da propriedade parentItemUUID.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getParentItemUUID() {
        return parentItemUUID;
    }

    /**
     * Define o valor da propriedade parentItemUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setParentItemUUID(UUID value) {
        this.parentItemUUID = value;
    }

}
