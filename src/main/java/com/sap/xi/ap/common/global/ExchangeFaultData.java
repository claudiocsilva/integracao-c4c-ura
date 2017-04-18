
package com.sap.xi.ap.common.global;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ExchangeFaultData complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExchangeFaultData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faultDetail" type="{http://sap.com/xi/AP/Common/Global}ExchangeLogData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeFaultData", propOrder = {
    "faultText",
    "faultUrl",
    "faultDetail"
})
public class ExchangeFaultData {

    @XmlElement(required = true)
    protected String faultText;
    protected String faultUrl;
    protected List<ExchangeLogData> faultDetail;

    /**
     * Obtém o valor da propriedade faultText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultText() {
        return faultText;
    }

    /**
     * Define o valor da propriedade faultText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultText(String value) {
        this.faultText = value;
    }

    /**
     * Obtém o valor da propriedade faultUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultUrl() {
        return faultUrl;
    }

    /**
     * Define o valor da propriedade faultUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultUrl(String value) {
        this.faultUrl = value;
    }

    /**
     * Gets the value of the faultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeLogData }
     * 
     * 
     */
    public List<ExchangeLogData> getFaultDetail() {
        if (faultDetail == null) {
            faultDetail = new ArrayList<ExchangeLogData>();
        }
        return this.faultDetail;
    }

}
