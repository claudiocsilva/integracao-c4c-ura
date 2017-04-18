
package com.sap.xi.a1s.global;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.ap.common.gdt.AddressRepresentationCode;
import com.sap.xi.ap.common.gdt.RegionCode;


/**
 * <p>Classe Java de CRMMaintainRequestBundleAddressPostalAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CRMMaintainRequestBundleAddressPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressRepresentationCode" type="{http://sap.com/xi/AP/Common/GDT}AddressRepresentationCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CountyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CompanyPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="BuildingID" type="{http://sap.com/xi/AP/Common/GDT}BuildingID" minOccurs="0"/&gt;
 *         &lt;element name="RoomID" type="{http://sap.com/xi/AP/Common/GDT}RoomID" minOccurs="0"/&gt;
 *         &lt;element name="FloorID" type="{http://sap.com/xi/AP/Common/GDT}FloorID" minOccurs="0"/&gt;
 *         &lt;element name="CareOfName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxID" type="{http://sap.com/xi/AP/Common/GDT}POBoxID" minOccurs="0"/&gt;
 *         &lt;element name="POBoxIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://sap.com/xi/AP/Common/GDT}TimeZoneCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMMaintainRequestBundleAddressPostalAddress", propOrder = {
    "addressRepresentationCode",
    "countryCode",
    "regionCode",
    "countyName",
    "cityName",
    "additionalCityName",
    "districtName",
    "streetPostalCode",
    "poBoxPostalCode",
    "companyPostalCode",
    "streetPrefixName",
    "additionalStreetPrefixName",
    "streetName",
    "streetSuffixName",
    "additionalStreetSuffixName",
    "houseID",
    "buildingID",
    "roomID",
    "floorID",
    "careOfName",
    "poBoxDeviatingCountryCode",
    "poBoxDeviatingRegionCode",
    "poBoxDeviatingCityName",
    "poBoxID",
    "poBoxIndicator",
    "timeZoneCode"
})
public class CRMMaintainRequestBundleAddressPostalAddress {

    @XmlElement(name = "AddressRepresentationCode")
    protected AddressRepresentationCode addressRepresentationCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "AdditionalCityName")
    protected String additionalCityName;
    @XmlElement(name = "DistrictName")
    protected String districtName;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String streetPostalCode;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxPostalCode;
    @XmlElement(name = "CompanyPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyPostalCode;
    @XmlElement(name = "StreetPrefixName")
    protected String streetPrefixName;
    @XmlElement(name = "AdditionalStreetPrefixName")
    protected String additionalStreetPrefixName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffixName")
    protected String streetSuffixName;
    @XmlElement(name = "AdditionalStreetSuffixName")
    protected String additionalStreetSuffixName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "BuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buildingID;
    @XmlElement(name = "RoomID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomID;
    @XmlElement(name = "FloorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String floorID;
    @XmlElement(name = "CareOfName")
    protected String careOfName;
    @XmlElement(name = "POBoxDeviatingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxDeviatingCountryCode;
    @XmlElement(name = "POBoxDeviatingRegionCode")
    protected RegionCode poBoxDeviatingRegionCode;
    @XmlElement(name = "POBoxDeviatingCityName")
    protected String poBoxDeviatingCityName;
    @XmlElement(name = "POBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxID;
    @XmlElement(name = "POBoxIndicator")
    protected Boolean poBoxIndicator;
    @XmlElement(name = "TimeZoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneCode;

    /**
     * Obtém o valor da propriedade addressRepresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public AddressRepresentationCode getAddressRepresentationCode() {
        return addressRepresentationCode;
    }

    /**
     * Define o valor da propriedade addressRepresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRepresentationCode }
     *     
     */
    public void setAddressRepresentationCode(AddressRepresentationCode value) {
        this.addressRepresentationCode = value;
    }

    /**
     * Obtém o valor da propriedade countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define o valor da propriedade countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtém o valor da propriedade regionCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Define o valor da propriedade regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Obtém o valor da propriedade countyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Define o valor da propriedade countyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Obtém o valor da propriedade cityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Define o valor da propriedade cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Obtém o valor da propriedade additionalCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCityName() {
        return additionalCityName;
    }

    /**
     * Define o valor da propriedade additionalCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCityName(String value) {
        this.additionalCityName = value;
    }

    /**
     * Obtém o valor da propriedade districtName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Define o valor da propriedade districtName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Obtém o valor da propriedade streetPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPostalCode() {
        return streetPostalCode;
    }

    /**
     * Define o valor da propriedade streetPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPostalCode(String value) {
        this.streetPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxPostalCode() {
        return poBoxPostalCode;
    }

    /**
     * Define o valor da propriedade poBoxPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxPostalCode(String value) {
        this.poBoxPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade companyPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * Define o valor da propriedade companyPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * Obtém o valor da propriedade streetPrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPrefixName() {
        return streetPrefixName;
    }

    /**
     * Define o valor da propriedade streetPrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPrefixName(String value) {
        this.streetPrefixName = value;
    }

    /**
     * Obtém o valor da propriedade additionalStreetPrefixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetPrefixName() {
        return additionalStreetPrefixName;
    }

    /**
     * Define o valor da propriedade additionalStreetPrefixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetPrefixName(String value) {
        this.additionalStreetPrefixName = value;
    }

    /**
     * Obtém o valor da propriedade streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define o valor da propriedade streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtém o valor da propriedade streetSuffixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffixName() {
        return streetSuffixName;
    }

    /**
     * Define o valor da propriedade streetSuffixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffixName(String value) {
        this.streetSuffixName = value;
    }

    /**
     * Obtém o valor da propriedade additionalStreetSuffixName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStreetSuffixName() {
        return additionalStreetSuffixName;
    }

    /**
     * Define o valor da propriedade additionalStreetSuffixName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStreetSuffixName(String value) {
        this.additionalStreetSuffixName = value;
    }

    /**
     * Obtém o valor da propriedade houseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * Define o valor da propriedade houseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * Obtém o valor da propriedade buildingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingID() {
        return buildingID;
    }

    /**
     * Define o valor da propriedade buildingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingID(String value) {
        this.buildingID = value;
    }

    /**
     * Obtém o valor da propriedade roomID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * Define o valor da propriedade roomID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * Obtém o valor da propriedade floorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorID() {
        return floorID;
    }

    /**
     * Define o valor da propriedade floorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorID(String value) {
        this.floorID = value;
    }

    /**
     * Obtém o valor da propriedade careOfName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOfName() {
        return careOfName;
    }

    /**
     * Define o valor da propriedade careOfName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOfName(String value) {
        this.careOfName = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCountryCode() {
        return poBoxDeviatingCountryCode;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCountryCode(String value) {
        this.poBoxDeviatingCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingRegionCode.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getPOBoxDeviatingRegionCode() {
        return poBoxDeviatingRegionCode;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingRegionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setPOBoxDeviatingRegionCode(RegionCode value) {
        this.poBoxDeviatingRegionCode = value;
    }

    /**
     * Obtém o valor da propriedade poBoxDeviatingCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxDeviatingCityName() {
        return poBoxDeviatingCityName;
    }

    /**
     * Define o valor da propriedade poBoxDeviatingCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxDeviatingCityName(String value) {
        this.poBoxDeviatingCityName = value;
    }

    /**
     * Obtém o valor da propriedade poBoxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxID() {
        return poBoxID;
    }

    /**
     * Define o valor da propriedade poBoxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxID(String value) {
        this.poBoxID = value;
    }

    /**
     * Obtém o valor da propriedade poBoxIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOBoxIndicator() {
        return poBoxIndicator;
    }

    /**
     * Define o valor da propriedade poBoxIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOBoxIndicator(Boolean value) {
        this.poBoxIndicator = value;
    }

    /**
     * Obtém o valor da propriedade timeZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * Define o valor da propriedade timeZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneCode(String value) {
        this.timeZoneCode = value;
    }

}
