package com.ws.impl;

import cat.jaume.suma.Suma;
import cat.jaume.suma.SumarResponse;

//import pe.joedayz.sumservice.schema.GetSumRequest;
//import pe.joedayz.sumservice.schema.GetSumResponse;

public interface IServeiDeCalcul {
	
//	public GetSumResponse getSuma(GetSumRequest parameters);
	
	public SumarResponse getSuma(Suma parameters);
}
