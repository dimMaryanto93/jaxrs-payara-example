package com.maryanto.dimas.jaxrs.example.rest;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.maryanto.dimas.jaxrs.example.model.Peserta;

@Path("/peserta")
public class PesertaController {

	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<Peserta> daftarPeserta() {
		List<Peserta> list = new ArrayList<Peserta>(Arrays.asList(
				new Peserta("001", "Dimas Maryanto", "jl.bukit indah", Date.valueOf(LocalDate.now()), false,
						Timestamp.valueOf(LocalDateTime.now())),
				new Peserta("002", "Maryanto", "jl.bukit indah", Date.valueOf(LocalDate.now()), false,
						Timestamp.valueOf(LocalDateTime.now())),
				new Peserta("002", "Dimas", "jl.bukit indah", Date.valueOf(LocalDate.now()), false,
						Timestamp.valueOf(LocalDateTime.now()))));
		return list;
	}

	@Path("/{pesertaId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Peserta get(@PathParam("pesertaId") String pesertaId) {
		return new Peserta(pesertaId, null, null, null, null, null);
	}

}
