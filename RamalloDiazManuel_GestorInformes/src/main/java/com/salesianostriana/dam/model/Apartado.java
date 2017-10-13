package com.salesianostriana.dam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Apartado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String tipoApartado;
	private String diagnostico;
	private String objetivos;
	private String tareas;

	@ManyToOne
	private Informe informe;

	public Apartado() {
	}

	public Apartado(String tipoApartado, String diagnostico, String objetivos, String tareas, Informe informe) {
		this.tipoApartado = tipoApartado;
		this.diagnostico = diagnostico;
		this.objetivos = objetivos;
		this.tareas = tareas;
		this.informe = informe;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoApartado() {
		return tipoApartado;
	}

	public void setTipoApartado(String tipoApartado) {
		this.tipoApartado = tipoApartado;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diagnostico == null) ? 0 : diagnostico.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((informe == null) ? 0 : informe.hashCode());
		result = prime * result + ((objetivos == null) ? 0 : objetivos.hashCode());
		result = prime * result + ((tareas == null) ? 0 : tareas.hashCode());
		result = prime * result + ((tipoApartado == null) ? 0 : tipoApartado.hashCode());
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
		Apartado other = (Apartado) obj;
		if (diagnostico == null) {
			if (other.diagnostico != null)
				return false;
		} else if (!diagnostico.equals(other.diagnostico))
			return false;
		if (id != other.id)
			return false;
		if (informe == null) {
			if (other.informe != null)
				return false;
		} else if (!informe.equals(other.informe))
			return false;
		if (objetivos == null) {
			if (other.objetivos != null)
				return false;
		} else if (!objetivos.equals(other.objetivos))
			return false;
		if (tareas == null) {
			if (other.tareas != null)
				return false;
		} else if (!tareas.equals(other.tareas))
			return false;
		if (tipoApartado == null) {
			if (other.tipoApartado != null)
				return false;
		} else if (!tipoApartado.equals(other.tipoApartado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apartado [id=" + id + ", tipoApartado=" + tipoApartado + ", diagnostico=" + diagnostico + ", objetivos="
				+ objetivos + ", tareas=" + tareas + ", informe=" + informe + "]";
	}

}
