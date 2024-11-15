package com.project.alertamogi.model;
import java.sql.Blob;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table (name = "tb_image")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_image")
	private Long id;

	@NotBlank
	@Column(name = "name_image")
	private String nameImage;
	
	@NotNull
	@Column(name = "type_imagem")
	private String typeImage;
	
	@Column(name = "size_image")
	private Long sizeImage;
	
	@NotNull
	@Column(name = "content_image")
	@Size(min = 10, max = 100000000)
	private String imagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameImage() {
		return nameImage;
	}

	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
	}

	public String getTypeImage() {
		return typeImage;
	}

	public void setTypeImage(String typeImage) {
		this.typeImage = typeImage;
	}

	public Long getSizeImage() {
		return sizeImage;
	}

	public void setSizeImage(Long sizeImage) {
		this.sizeImage = sizeImage;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	
}
