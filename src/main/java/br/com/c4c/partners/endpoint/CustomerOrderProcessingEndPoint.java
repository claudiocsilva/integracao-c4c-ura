package br.com.c4c.partners.endpoint;

import com.sap.xi.a1s.global.CustomerOrderMaintainConfirmationBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderProcessingManageCustomerOrderIn;
import com.sap.xi.a1s.global.StandardFaultMessage;
import com.sap.xi.sapglobal20.global.ObjectFactory;

public class CustomerOrderProcessingEndPoint implements CustomerOrderProcessingManageCustomerOrderIn {

	@Override
	public CustomerOrderMaintainConfirmationBundleMessageSyncV1 checkMaintainBundle(
			CustomerOrderMaintainRequestBundleMessageSyncV1 customerOrderRequestBundleCheckRequestSyncV1)
			throws StandardFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrderMaintainConfirmationBundleMessageSyncV1 maintainBundle(
			CustomerOrderMaintainRequestBundleMessageSyncV1 customerOrderBundleMaintainRequestSyncV1)
			throws StandardFaultMessage {
		ObjectFactory factory = new ObjectFactory();
		CustomerOrderMaintainRequestBundleMessageSyncV1 c = new CustomerOrderMaintainRequestBundleMessageSyncV1();
		factory.createCustomerOrderBundleMaintainRequestSyncV1(customerOrderBundleMaintainRequestSyncV1);
		c.getCustomerOrder();
		return null;
	}

}
