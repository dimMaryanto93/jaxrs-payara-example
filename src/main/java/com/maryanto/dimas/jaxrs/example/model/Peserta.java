package com.maryanto.dimas.jaxrs.example.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Peserta {

	private String id;
	private String nama;
	private String alamat;
	private Date tanggalLahir;
	private Boolean active;
	private Timestamp createdDate;
	
	public Peserta() {
		
	}
	
	public Peserta(String id, String nama, String alamat, Date tanggalLahir, Boolean active, Timestamp createdDate) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.active = active;
		this.createdDate = createdDate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
