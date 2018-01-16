package com.maryanto.dimas.jaxrs.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresouces")
public class Resouces {
	
	@GET()
	@Produces(MediaType.TEXT_PLAIN)
	public String messages() {
		return "Halo world";
	}

}
