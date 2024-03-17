package es.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="empleados")


public class Empleado extends Rol implements Serializable {

	private int nroEmpleado;
	
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;

	public Empleado(){
		setRol("EMPLEADO");
	}
	
	public int getNroEmpleado() {
		return nroEmpleado;
	}

	public void setNroEmpleado(int nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [nroEmpleado=" + nroEmpleado + ", categoria=" + categoria + "]";
	}
	
}
