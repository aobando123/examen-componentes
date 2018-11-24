package com.cenfotec.examen.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Finca {
	@Id
	private String idFinca;
	private String nombre;
	private List<Cafe> siembra;
	private Productor dueno;
	public String getIdFinca() {
		return idFinca;
	}
	public void setIdFinca(String IdFinca) {
		this.idFinca = IdFinca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Cafe> getSiembra() {
		return siembra;
	}
	public void setSiembra(Cafe cafe) {
		siembra.add(cafe);
	}
	public Productor getDueno() {
		return dueno;
	}
	public void setDueno(Productor dueno) {
		this.dueno = dueno;
	}
	public Finca(String idFinca, String nombre, List<Cafe> siembra, Productor dueno) {
		super();
		this.idFinca = idFinca;
		this.nombre = nombre;
		this.siembra = siembra;
		this.dueno = dueno;
	}
	public Finca() {
		super();
		this.siembra = new ArrayList<Cafe>();
	}
	
	
}
