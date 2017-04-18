
package com.sap.xi.sapglobal20.global;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.sap.xi.a1s.global.CustomerOrderMaintainConfirmationBundleMessageSyncV1;
import com.sap.xi.a1s.global.CustomerOrderMaintainRequestBundleMessageSyncV1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.sapglobal20.global package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerOrderBundleMaintainConfirmationSyncV1_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerOrderBundleMaintainConfirmation_sync_V1");
    private final static QName _CustomerOrderBundleMaintainRequestSyncV1_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerOrderBundleMaintainRequest_sync_V1");
    private final static QName _CustomerOrderRequestBundleCheckConfirmationSyncV1_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerOrderRequestBundleCheckConfirmation_sync_V1");
    private final static QName _CustomerOrderRequestBundleCheckRequestSyncV1_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerOrderRequestBundleCheckRequest_sync_V1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.sapglobal20.global
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderMaintainConfirmationBundleMessageSyncV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerOrderBundleMaintainConfirmation_sync_V1")
    public JAXBElement<CustomerOrderMaintainConfirmationBundleMessageSyncV1> createCustomerOrderBundleMaintainConfirmationSyncV1(CustomerOrderMaintainConfirmationBundleMessageSyncV1 value) {
        return new JAXBElement<CustomerOrderMaintainConfirmationBundleMessageSyncV1>(_CustomerOrderBundleMaintainConfirmationSyncV1_QNAME, CustomerOrderMaintainConfirmationBundleMessageSyncV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderMaintainRequestBundleMessageSyncV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerOrderBundleMaintainRequest_sync_V1")
    public JAXBElement<CustomerOrderMaintainRequestBundleMessageSyncV1> createCustomerOrderBundleMaintainRequestSyncV1(CustomerOrderMaintainRequestBundleMessageSyncV1 value) {
        return new JAXBElement<CustomerOrderMaintainRequestBundleMessageSyncV1>(_CustomerOrderBundleMaintainRequestSyncV1_QNAME, CustomerOrderMaintainRequestBundleMessageSyncV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderMaintainConfirmationBundleMessageSyncV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerOrderRequestBundleCheckConfirmation_sync_V1")
    public JAXBElement<CustomerOrderMaintainConfirmationBundleMessageSyncV1> createCustomerOrderRequestBundleCheckConfirmationSyncV1(CustomerOrderMaintainConfirmationBundleMessageSyncV1 value) {
        return new JAXBElement<CustomerOrderMaintainConfirmationBundleMessageSyncV1>(_CustomerOrderRequestBundleCheckConfirmationSyncV1_QNAME, CustomerOrderMaintainConfirmationBundleMessageSyncV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderMaintainRequestBundleMessageSyncV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerOrderRequestBundleCheckRequest_sync_V1")
    public JAXBElement<CustomerOrderMaintainRequestBundleMessageSyncV1> createCustomerOrderRequestBundleCheckRequestSyncV1(CustomerOrderMaintainRequestBundleMessageSyncV1 value) {
        return new JAXBElement<CustomerOrderMaintainRequestBundleMessageSyncV1>(_CustomerOrderRequestBundleCheckRequestSyncV1_QNAME, CustomerOrderMaintainRequestBundleMessageSyncV1 .class, null, value);
    }

}
