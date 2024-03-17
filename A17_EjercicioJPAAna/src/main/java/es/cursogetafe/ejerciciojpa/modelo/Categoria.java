package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	private String  categoria; //Unidirecional por que no tiene atributo de empleados  mappebY es cuando bidireccional
	private double salarioConvenio;
	
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getSalarioConvenio() {
		return salarioConvenio;
	}
	public void setSalarioConvenio(double salarioConvenio) {
		this.salarioConvenio = salarioConvenio;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", salarioConvenio="
				+ salarioConvenio + "]";
	}
	
}
