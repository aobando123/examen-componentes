package com.cenfotec.examen.domain;

import org.springframework.data.annotation.Id;

public class Productor {
	@Id
	private String cedula;
	private String nombre;

	private String Empresa;
	private String distrito;
	private String canton;
	private String provincia;
	private String direccion;
	
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmpresa() {
		return Empresa;
	}


	public void setEmpresa(String Empresa) {
		this.Empresa = Empresa;
	}


	public String getDistrito() {
		return distrito;
	}


	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}


	public String getCanton() {
		return canton;
	}


	public void setCanton(String canton) {
		this.canton = canton;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}




	public Productor(String cedula, String nombre, String empresa, String distrito, String canton, String provincia,
			String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		Empresa = empresa;
		this.distrito = distrito;
		this.canton = canton;
		this.provincia = provincia;
		this.direccion = direccion;
	}


	public Productor() {
		
	}
	
	
}
