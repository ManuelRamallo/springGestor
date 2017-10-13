package com.salesianostriana.dam.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Residente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellidos;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaIngreso;

	@OneToMany(mappedBy = "residente", cascade = CascadeType.ALL)
	private List<Informe> informe = new ArrayList<>();

	public Residente() {
	}

	

	public Residente(String nombre, String apellidos, Date fechaNacimiento, Date fechaIngreso,
			List<Informe> informe) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.informe = informe;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public List<Informe> getInforme() {
		return informe;
	}

	public void setInforme(List<Informe> informe) {
		this.informe = informe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((informe == null) ? 0 : informe.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Residente other = (Residente) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (id != other.id)
			return false;
		if (informe == null) {
			if (other.informe != null)
				return false;
		} else if (!informe.equals(other.informe))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Residente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", informe=" + informe + "]";
	}

}
