package com.ws;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.message.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cat.jaume.suma.Suma;
import cat.jaume.suma.Suma_Service;
import cat.jaume.suma.Sumar;

@SpringBootApplication
public class SoapCxfWebServiceClientApp implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SoapCxfWebServiceClientApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Suma_Service sumaService = new Suma_Service();
		Suma sumaServicePort = sumaService.getSumaSOAP();
		
		//cxf:
		Client client = ClientProxy.getClient(sumaServicePort);
		
//		Endpoint endpoint = client.getEndpoint();
		
		client.getRequestContext().put(Message.ENDPOINT_ADDRESS, "http://localhost:9093/services/soap/SumService");
		
		
		Sumar request = new Sumar();
		request.setParametreA(9);
		request.setParametreB(16);
		
//		SumarResponse response = new SumarResponse();
//		response.setSumaParametres(sumaServicePort.sumar(request.getParametreA(),request.getParametreB()));
		
		System.out.println(sumaServicePort.sumar(request.getParametreA(),request.getParametreB()));
	}

}
