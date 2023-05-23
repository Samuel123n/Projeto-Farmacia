package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 5, max = 20, message = "Este atributo tem que ter no mínimo 5 caracteres e no máximo 20 caracteres")
	private String nome;

	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 10, max = 60, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 60 caracteres")
	private String Remedio;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRemedio() {
		return Remedio;
	}

	public void setRemedio(String remedio) {
		Remedio = remedio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}