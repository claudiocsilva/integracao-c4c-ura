package com.c4c.partners.endpoint;

import java.math.BigDecimal;

import javax.jws.WebMethod;

import com.sap.xi.a1s.global.CustomerOrderMaintainConfirmationBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestItemProductV11;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestItemV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestPartyContactParty;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestPartyWithContact;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestPartyWithoutContact;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestPartyWithoutContactWithEmployee;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestText;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestV1;
import com.sap.xi.a1s.global.StandardFaultMessage;
import com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID;
import com.sap.xi.ap.common.gdt.NOCONVERSIONProductID;
import com.sap.xi.ap.common.gdt.Quantity;



public class CustomerOrderMockEndPoint extends CustomerOrderProcessingEndPoint{

	
	@WebMethod
	public BusinessTransactionDocumentID invoqueWS(String input) throws StandardFaultMessage{
		CustomerOrderMaintainRequestBundleMessageSyncV1 request = new CustomerOrderMaintainRequestBundleMessageSyncV1();
		
		CustomerOrderMaintainRequestV1 customerOrder = new CustomerOrderMaintainRequestV1();
		customerOrder.setProcessingTypeCode("OR");
		
		CustomerOrderMaintainRequestPartyWithContact BusinessPartnerInternalID = new CustomerOrderMaintainRequestPartyWithContact();
		BusinessPartnerInternalID.setBusinessPartnerInternalID("1005216");
		CustomerOrderMaintainRequestPartyContactParty customerOrderMaintainRequestPartyContactParty = new CustomerOrderMaintainRequestPartyContactParty();
		customerOrderMaintainRequestPartyContactParty.setBusinessPartnerInternalID("1005217");
		BusinessPartnerInternalID.getContactParty().add(customerOrderMaintainRequestPartyContactParty);
		
		customerOrder.setBuyerParty(BusinessPartnerInternalID);
		
		
		CustomerOrderMaintainRequestPartyWithoutContact payerParty = new CustomerOrderMaintainRequestPartyWithoutContact();
		payerParty.setBusinessPartnerInternalID("1005216");
		customerOrder.setPayerParty(payerParty);
		
		
		CustomerOrderMaintainRequestPartyWithoutContactWithEmployee employeeResponsibleParty = new CustomerOrderMaintainRequestPartyWithoutContactWithEmployee();
		employeeResponsibleParty.setBusinessPartnerInternalID("1");
		employeeResponsibleParty.setEmployeeID("1");
		customerOrder.setEmployeeResponsibleParty(employeeResponsibleParty);
		
		
		
		
		/** ITEM 1 **/
		
		CustomerOrderMaintainRequestItemV1 item1 = new CustomerOrderMaintainRequestItemV1();
		item1.setActionCode("01");
		item1.setID("10");
		
		CustomerOrderMaintainRequestItemProductV11 itemProduct = new CustomerOrderMaintainRequestItemProductV11();
		NOCONVERSIONProductID itemProductId = new NOCONVERSIONProductID();
		itemProductId.setSchemeID("10004030");
		itemProduct.setProductID(itemProductId);
		
		Quantity quantity = new Quantity();
		quantity.setUnitCode("EA");
		
		BigDecimal bg1 = new BigDecimal(1);
		quantity.setValue(bg1);
		item1.setQuantity(quantity);
		item1.setItemProduct(itemProduct);
		
		CustomerOrderMaintainRequestText itemText = new CustomerOrderMaintainRequestText();
		itemText.setActionCode("01");
		item1.getItemText().add(itemText);
		
		
		
		/** ITEM 2 **/
		
		CustomerOrderMaintainRequestItemV1 item2 = new CustomerOrderMaintainRequestItemV1();
		item2.setActionCode("01");
		item2.setID("20");
		
		CustomerOrderMaintainRequestItemProductV11 itemProduct2 = new CustomerOrderMaintainRequestItemProductV11();
		NOCONVERSIONProductID itemProductId2 = new NOCONVERSIONProductID();
		itemProductId2.setSchemeID("10004034");
		itemProduct2.setProductID(itemProductId2);
		
		Quantity quantity2 = new Quantity();
		quantity2.setUnitCode("EA");
		
		BigDecimal bg2 = new BigDecimal(1);
		quantity2.setValue(bg2);
		item2.setQuantity(quantity2);
		item2.setItemProduct(itemProduct2);
		
		CustomerOrderMaintainRequestText itemText2 = new CustomerOrderMaintainRequestText();
		itemText2.setActionCode("01");
		item2.getItemText().add(itemText2);
		
		
		/** ITEM 3 **/
		
		
		CustomerOrderMaintainRequestItemV1 item3 = new CustomerOrderMaintainRequestItemV1();
		item3.setActionCode("01");
		item3.setID("30");
		
		CustomerOrderMaintainRequestItemProductV11 itemProduct3 = new CustomerOrderMaintainRequestItemProductV11();
		NOCONVERSIONProductID itemProductId3 = new NOCONVERSIONProductID();
		itemProductId3.setSchemeID("10004032");
		itemProduct3.setProductID(itemProductId3);
		
		Quantity quantity3 = new Quantity();
		quantity3.setUnitCode("EA");
		
		BigDecimal bg3 = new BigDecimal(10);
		quantity3.setValue(bg3);
		item3.setQuantity(quantity3);
		item3.setItemProduct(itemProduct3);
		
		CustomerOrderMaintainRequestText itemText3 = new CustomerOrderMaintainRequestText();
		itemText3.setActionCode("01");
		item3.getItemText().add(itemText3);
		
		
		
		customerOrder.getItem();
		
		
		
		request.getCustomerOrder().add(customerOrder);
		
		CustomerOrderMaintainConfirmationBundleMessageSyncV1 result = new CustomerOrderMaintainConfirmationBundleMessageSyncV1();
		
		result = maintainBundle(request);
		return result.getCustomerOrder().get(0).getID();
		
	}

}
