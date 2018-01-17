package com.maryanto.dimas.jaxrs.example.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/halo")
public class Resouces {
	
	private final static Logger console = LoggerFactory.getLogger(Resouces.class);
	
	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public String messages() {
		return "{ \"value\" : \"Spring security\", \"nama\": \"Dimas Maryanto\"}";
	}
	

	@POST
	@Consumes("text/plain")
	public void postClichedMessage(String message) {
	    // Store the message
		console.info("method");
	}

}
