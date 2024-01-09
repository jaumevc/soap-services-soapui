package com.ws.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.springframework.stereotype.Service;

import cat.jaume.suma.Suma;

//import pe.joedayz.sumservice.schema.GetSumRequest;
//import pe.joedayz.sumservice.schema.GetSumResponse;
//import pe.joedayz.sumservice.wsdl.SumServicePort;

@Service
@SchemaValidation(type= SchemaValidationType.REQUEST)
public class ServeiDeCalculImpl implements Suma {


//	@Override
//	public GetSumResponse getSum(GetSumRequest parameters) {
//		GetSumResponse respostaSuma = new GetSumResponse();
//		respostaSuma.setResult(parameters.getAddendOne()+ parameters.getAddendTwo());
//		return respostaSuma;
//	}

	@Override
	public int sumar(int parametreA, int parametreB) {
		// TODO Auto-generated method stub
		return parametreA+parametreB;
	}

}
