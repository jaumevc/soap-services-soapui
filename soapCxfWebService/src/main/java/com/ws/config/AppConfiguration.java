package com.ws.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ws.impl.ServeiDeCalculImpl;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.soap.*;

@Configuration
public class AppConfiguration {

	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint(ServeiDeCalculImpl servei) {
		Endpoint endpoint = new EndpointImpl(bus, servei, SOAPBinding.SOAP12HTTP_BINDING); 
		
		endpoint.publish("/soap/SumService");
		return endpoint;
	}
	
}
