package com.bootcamp.ms.models.documents;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

//@Document(collection="clientes")
public class Products {
	
	@Id
	private String id;
	
	@NotNull
	private String producto;
	
	@NotNull
	private String tipoProducto;
	
	@Null
	private String titulares;
	
	@Null
	private String firmantes;
	
	@NotEmpty
	private String comision;
	
	@NotEmpty
	private String limiteMovimiento;
	
	@NotEmpty
	private String lineaCredito;
	
	public Products() {}

	public Products(String producto, String tipoProducto, 
			String titulares, String firmantes, String comision, 
			String limiteMovimiento, String lineaCredito, Date createAt) {
		this.producto = producto;
		this.tipoProducto = tipoProducto;
		this.titulares = titulares;
		this.firmantes = firmantes;
		this.comision = comision;
		this.limiteMovimiento = limiteMovimiento;
		this.lineaCredito = lineaCredito;
		
	}
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	

	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	public String getTitulares() {
		return titulares;
	}
	public void setTitulares(String titulares) {
		this.titulares = titulares;
	}
	
	public String getFirmantes() {
		return firmantes;
	}
	public void setFirmantes(String firmantes) {
		this.firmantes = firmantes;
	}
	
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	
	public String getLimiteMovimiento() {
		return limiteMovimiento;
	}

	public void setLimiteMovimiento(String limiteMovimiento) {
		this.limiteMovimiento = limiteMovimiento;
	}

	public String getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(String lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

}
