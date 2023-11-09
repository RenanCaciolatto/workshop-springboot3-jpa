package com.renancaciolatto.curso.entities;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String numero;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(Long id, String nome, String email, String numero, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.numero = numero;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getNumero() {
		return numero;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}	
}
