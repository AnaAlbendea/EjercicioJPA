package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="roles")
@Inheritance(strategy = InheritanceType.JOINED)
public class Rol implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;

	private String rol;
	@ManyToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;


	private int getIdRol() {
		return idRol;
	}

	private void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getRol() {
		return rol;
	}

	protected void setRol(String rol) {
		this.rol = rol;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getIdPersona() {
		return persona.getIdPersona();
	}

	public String getApellidos() {
		return persona.getApellidos();
	}

	public List<Rol> getRoles() {
		return persona.getRoles();
	}

	@Override
	public int hashCode() {
		return Objects.hash(idRol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rol other = (Rol) obj;
		return idRol == other.idRol;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", rol=" + rol + ", persona=" + persona + "]";
	}
	
	
}


