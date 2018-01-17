package com.maryanto.dimas.jaxrs.example.filterbean;

import javax.ws.rs.QueryParam;

public class PesertaFilterBean {

	@QueryParam("kode")
	private Integer id;
	@QueryParam("nama")
	private String nama;
	@QueryParam("status")
	private boolean active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
