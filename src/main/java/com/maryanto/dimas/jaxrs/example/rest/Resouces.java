package com.maryanto.dimas.jaxrs.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/halo")
public class Resouces {
	
	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public String messages() {
		return "{ \"value\" : \"Spring security\", \"nama\": \"Dimas Maryanto\"}";
	}

}
