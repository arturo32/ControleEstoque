package br.ufrn.imd.controleestoque.model;

import jakarta.persistence.Entity;

@Entity
public class Estoque {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
