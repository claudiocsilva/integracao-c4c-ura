
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.NOCONVERSIONProductID;
import com.sap.xi.ap.common.gdt.ProductInternalID;
import com.sap.xi.ap.common.gdt.ProductStandardID;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestItemProduct_V1_1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestItemProduct_V1_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}NOCONVERSION_ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ProductStandardID" type="{http://sap.com/xi/AP/Common/GDT}ProductStandardID" minOccurs="0"/&gt;
 *         &lt;element name="ProductBuyerID" type="{http://sap.com/xi/AP/Common/GDT}ProductPartyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestItemProduct_V1_1", propOrder = {
    "productID",
    "productInternalID",
    "productStandardID",
    "productBuyerID"
})
public class CustomerOrderMaintainRequestItemProductV11 {

    @XmlElement(name = "ProductID")
    protected NOCONVERSIONProductID productID;
    @XmlElement(name = "ProductInternalID")
    protected ProductInternalID productInternalID;
    @XmlElement(name = "ProductStandardID")
    protected ProductStandardID productStandardID;
    @XmlElement(name = "ProductBuyerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productBuyerID;

    /**
     * Obtém o valor da propriedade productID.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public NOCONVERSIONProductID getProductID() {
        return productID;
    }

    /**
     * Define o valor da propriedade productID.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public void setProductID(NOCONVERSIONProductID value) {
        this.productID = value;
    }

    /**
     * Obtém o valor da propriedade productInternalID.
     * 
     * @return
     *     possible object is
     *     {@link ProductInternalID }
     *     
     */
    public ProductInternalID getProductInternalID() {
        return productInternalID;
    }

    /**
     * Define o valor da propriedade productInternalID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInternalID }
     *     
     */
    public void setProductInternalID(ProductInternalID value) {
        this.productInternalID = value;
    }

    /**
     * Obtém o valor da propriedade productStandardID.
     * 
     * @return
     *     possible object is
     *     {@link ProductStandardID }
     *     
     */
    public ProductStandardID getProductStandardID() {
        return productStandardID;
    }

    /**
     * Define o valor da propriedade productStandardID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStandardID }
     *     
     */
    public void setProductStandardID(ProductStandardID value) {
        this.productStandardID = value;
    }

    /**
     * Obtém o valor da propriedade productBuyerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductBuyerID() {
        return productBuyerID;
    }

    /**
     * Define o valor da propriedade productBuyerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductBuyerID(String value) {
        this.productBuyerID = value;
    }

}
