package com.deveducation.aspas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_comentario")
public class ComentarioModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_comentario;
	
	@Column
	@NotEmpty
	private String comentario;
	
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date data;

	public Long getId_comentario() {
		return id_comentario;
	}

	public void setId_comentario(Long id_comentario) {
		this.id_comentario = id_comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}