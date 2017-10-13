package com.salesianostriana.dam.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Informe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@ManyToOne
	private Residente residente;

	@OneToMany(mappedBy = "informe", cascade = CascadeType.ALL)
	private List<Apartado> apartado = new ArrayList<>();

	public Informe() {
	}

	public Informe(Date fecha, Residente residente, List<Apartado> apartado) {
		this.fecha = fecha;
		this.residente = residente;
		this.apartado = apartado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Residente getResidente() {
		return residente;
	}

	public void setResidente(Residente residente) {
		this.residente = residente;
	}

	public List<Apartado> getApartado() {
		return apartado;
	}

	public void setApartado(List<Apartado> apartado) {
		this.apartado = apartado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apartado == null) ? 0 : apartado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((residente == null) ? 0 : residente.hashCode());
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
		Informe other = (Informe) obj;
		if (apartado == null) {
			if (other.apartado != null)
				return false;
		} else if (!apartado.equals(other.apartado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (residente == null) {
			if (other.residente != null)
				return false;
		} else if (!residente.equals(other.residente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Informe [id=" + id + ", fecha=" + fecha + ", residente=" + residente + ", apartado=" + apartado + "]";
	}

}
