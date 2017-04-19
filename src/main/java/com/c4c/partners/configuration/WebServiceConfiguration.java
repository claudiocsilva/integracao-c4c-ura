package com.c4c.partners.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.c4c.partners.endpoint.CustomerOrderMockEndPoint;
import com.c4c.partners.endpoint.CustomerOrderProcessingEndPoint;
import com.sap.xi.a1s.global.CustomerOrderProcessingManageCustomerOrderIn;


@Configuration
public class WebServiceConfiguration {

	@Bean
	public ServletRegistrationBean cxfServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/c4c-soap-api/*");
	}

	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	
//	@Bean
//	public CustomerOrderProcessingManageCustomerOrderIn CustomerService() {
//		return new CustomerOrderProcessingEndPoint();
//	}
	
	@Bean
	public CustomerOrderMockEndPoint CustomerService() {
		return new CustomerOrderMockEndPoint();
	}
	
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), CustomerService());
		endpoint.publish("/C4C_SalesOrder");
		endpoint.setWsdlLocation("c4c_wsdl_salesorder.wsdl");
		return endpoint;
	}
}
