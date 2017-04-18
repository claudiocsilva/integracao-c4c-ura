package com.c4c.partners.endpoint;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.stereotype.Service;

import com.sap.xi.a1s.global.CustomerOrderMaintainConfirmationBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderProcessingManageCustomerOrderIn;
import com.sap.xi.a1s.global.StandardFaultMessage;

@Service
public class CustomerOrderProcessingEndPoint implements CustomerOrderProcessingManageCustomerOrderIn {


	@Override
	public CustomerOrderMaintainConfirmationBundleMessageSyncV1 maintainBundle(CustomerOrderMaintainRequestBundleMessageSyncV1 customerOrderBundleMaintainRequestSyncV1)
			throws StandardFaultMessage {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		factory.setServiceClass(CustomerOrderProcessingManageCustomerOrderIn.class);
		factory.setAddress("https://my331048.crm.ondemand.com/sap/bc/srt/scs/sap/customerorderprocessingmanagec");
		CustomerOrderProcessingManageCustomerOrderIn port = (CustomerOrderProcessingManageCustomerOrderIn) factory.create();
		
		Client client = ClientProxy.getClient(port);
		
		HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
		httpConduit.getAuthorization().setUserName("_ZIVR_CCTR");
		httpConduit.getAuthorization().setPassword("Welcome1");
		httpConduit.getAuthorization().setAuthorizationType("Basic");
		
		CustomerOrderMaintainConfirmationBundleMessageSyncV1 response = port.maintainBundle(customerOrderBundleMaintainRequestSyncV1);
		
		return response;
	}

	@Override
	public CustomerOrderMaintainConfirmationBundleMessageSyncV1 checkMaintainBundle(
			CustomerOrderMaintainRequestBundleMessageSyncV1 customerOrderRequestBundleCheckRequestSyncV1)
			throws StandardFaultMessage {
		return null;
	}

}
