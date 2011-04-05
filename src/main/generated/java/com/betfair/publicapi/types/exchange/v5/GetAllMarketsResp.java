
package com.betfair.publicapi.types.exchange.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllMarketsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllMarketsResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.betfair.com/publicapi/types/exchange/v5/}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.betfair.com/publicapi/types/exchange/v5/}GetAllMarketsErrorEnum"/>
 *         &lt;element name="marketData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minorErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllMarketsResp", propOrder = {
    "errorCode",
    "marketData",
    "minorErrorCode"
})
public class GetAllMarketsResp
    extends APIResponse
{

    @XmlElement(required = true)
    protected GetAllMarketsErrorEnum errorCode;
    @XmlElement(required = true, nillable = true)
    protected String marketData;
    @XmlElement(required = true, nillable = true)
    protected String minorErrorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllMarketsErrorEnum }
     *     
     */
    public GetAllMarketsErrorEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllMarketsErrorEnum }
     *     
     */
    public void setErrorCode(GetAllMarketsErrorEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the marketData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketData() {
        return marketData;
    }

    /**
     * Sets the value of the marketData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketData(String value) {
        this.marketData = value;
    }

    /**
     * Gets the value of the minorErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorErrorCode() {
        return minorErrorCode;
    }

    /**
     * Sets the value of the minorErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorErrorCode(String value) {
        this.minorErrorCode = value;
    }

}
