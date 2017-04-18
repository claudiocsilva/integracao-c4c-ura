
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.DistributionChannelCode;
import com.sap.xi.ap.common.gdt.DivisionCode;
import com.sap.xi.ap.common.gdt.SalesTerritoryID;


/**
 * <p>Classe Java de CustomerOrderMaintainRequestSalesAndServiceBusinessArea_V1 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderMaintainRequestSalesAndServiceBusinessArea_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrganisationID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannelCode" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="DivisionCode" type="{http://sap.com/xi/AP/Common/GDT}DivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="SalesTerritoryID" type="{http://sap.com/xi/AP/Common/GDT}SalesTerritoryID" minOccurs="0"/&gt;
 *         &lt;element name="SalesGroupID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="SalesOfficeID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderMaintainRequestSalesAndServiceBusinessArea_V1", propOrder = {
    "salesOrganisationID",
    "distributionChannelCode",
    "divisionCode",
    "salesTerritoryID",
    "salesGroupID",
    "salesOfficeID"
})
public class CustomerOrderMaintainRequestSalesAndServiceBusinessAreaV1 {

    @XmlElement(name = "SalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganisationID;
    @XmlElement(name = "DistributionChannelCode")
    protected DistributionChannelCode distributionChannelCode;
    @XmlElement(name = "DivisionCode")
    protected DivisionCode divisionCode;
    @XmlElement(name = "SalesTerritoryID")
    protected SalesTerritoryID salesTerritoryID;
    @XmlElement(name = "SalesGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesGroupID;
    @XmlElement(name = "SalesOfficeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOfficeID;

    /**
     * Obtém o valor da propriedade salesOrganisationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganisationID() {
        return salesOrganisationID;
    }

    /**
     * Define o valor da propriedade salesOrganisationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganisationID(String value) {
        this.salesOrganisationID = value;
    }

    /**
     * Obtém o valor da propriedade distributionChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * Define o valor da propriedade distributionChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setDistributionChannelCode(DistributionChannelCode value) {
        this.distributionChannelCode = value;
    }

    /**
     * Obtém o valor da propriedade divisionCode.
     * 
     * @return
     *     possible object is
     *     {@link DivisionCode }
     *     
     */
    public DivisionCode getDivisionCode() {
        return divisionCode;
    }

    /**
     * Define o valor da propriedade divisionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionCode }
     *     
     */
    public void setDivisionCode(DivisionCode value) {
        this.divisionCode = value;
    }

    /**
     * Obtém o valor da propriedade salesTerritoryID.
     * 
     * @return
     *     possible object is
     *     {@link SalesTerritoryID }
     *     
     */
    public SalesTerritoryID getSalesTerritoryID() {
        return salesTerritoryID;
    }

    /**
     * Define o valor da propriedade salesTerritoryID.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTerritoryID }
     *     
     */
    public void setSalesTerritoryID(SalesTerritoryID value) {
        this.salesTerritoryID = value;
    }

    /**
     * Obtém o valor da propriedade salesGroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGroupID() {
        return salesGroupID;
    }

    /**
     * Define o valor da propriedade salesGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGroupID(String value) {
        this.salesGroupID = value;
    }

    /**
     * Obtém o valor da propriedade salesOfficeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficeID() {
        return salesOfficeID;
    }

    /**
     * Define o valor da propriedade salesOfficeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficeID(String value) {
        this.salesOfficeID = value;
    }

}
