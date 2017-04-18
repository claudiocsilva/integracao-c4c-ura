package com.c4c.partners.endpoint;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sap.xi.a1s.global.CustomerOrderMaintainConfirmationBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderProcessingManageCustomerOrderIn;
import com.sap.xi.a1s.global.StandardFaultMessage;

@Service
public class CustomerOrderProcessingEndPoint implements CustomerOrderProcessingManageCustomerOrderIn {

	
	@Value("${c4c.manage.endpoint}")
	private String MaintainBundleEndPoint;
	
	@Value("${c4c.manage.login}")
	private String userAuthentication;
	
	@Value("${c4c.manage.password}")
	private String userPasswordAuthentication;
	
	private String authorizationType = "Basic";
	

	@Override
	public CustomerOrderMaintainConfirmationBundleMessageSyncV1 maintainBundle(CustomerOrderMaintainRequestBundleMessageSyncV1 customerOrderBundleMaintainRequestSyncV1)
			throws StandardFaultMessage {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		factory.setServiceClass(CustomerOrderProcessingManageCustomerOrderIn.class);
		factory.setAddress(MaintainBundleEndPoint);
		CustomerOrderProcessingManageCustomerOrderIn port = (CustomerOrderProcessingManageCustomerOrderIn) factory.create();
		
		Client client = ClientProxy.getClient(port);
		
		HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
		httpConduit.getAuthorization().setUserName(userAuthentication);
		httpConduit.getAuthorization().setPassword(userPasswordAuthentication);
		httpConduit.getAuthorization().setAuthorizationType(authorizationType);
		
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
