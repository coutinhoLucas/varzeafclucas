package br.com.cc.varzeafc.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Presidente extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message= "nome é obrigatório")
	private String nome;
	@NotBlank(message= "cpf é obrigatório")
	private String cpf;
	@NotBlank(message= "rg é obrigatório")
	private String rg;
	@NotBlank(message= "email é obrigatório")
	private String email;
	@OneToOne(cascade=CascadeType.ALL, mappedBy="presidente")
	private Equipe equipe;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
