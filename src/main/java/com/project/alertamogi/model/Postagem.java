package com.project.alertamogi.model;

import java.net.URI;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo título é obrigatório")
	@Size(max = 200, message = "O atributo título deve ter no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank
	@Size(min = 10, max = 3000, message = "O atributo texto deve ter no mínimo 50 e no máximo 3000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	private TagEnum tag;
	
	@NotBlank
	@Size(min = 10, max = 300, message = "O atributo rua deve ser preenchido")
	private String rua;
	
	@NotNull
	private Long numero;
	
	@NotBlank
	@Size(min = 10, max = 300, message = "O atributo bairro deve ser preenchido")
	private String bairro;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TagEnum getTag() {
		return tag;
	}

	public void setTag(TagEnum tag) {
		this.tag = tag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
