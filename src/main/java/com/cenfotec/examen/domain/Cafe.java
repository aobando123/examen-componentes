package com.cenfotec.examen.domain;

import org.springframework.data.annotation.Id;

public class Cafe {
	@Id
	public String id;
	public String nombre;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
