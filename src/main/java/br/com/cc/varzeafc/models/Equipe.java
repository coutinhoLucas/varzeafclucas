package br.com.cc.varzeafc.models;

import java.time.LocalDate;
import java.util.List;

public class Equipe {

	private Integer id;
	private List<Campeonato> campeonatos;
	private String nome;
	private String sigla;
	private LocalDate dataCriacao;
	private Presidente presidente;
	private List<Jogo> jogosMandante;
	private List<Jogo> jogosVisitante;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public List<Jogo> getJogosMandante() {
		return jogosMandante;
	}

	public void setJogosMandante(List<Jogo> jogosMandante) {
		this.jogosMandante = jogosMandante;
	}

	public List<Jogo> getJogosVisitante() {
		return jogosVisitante;
	}

	public void setJogosVisitante(List<Jogo> jogosVisitante) {
		this.jogosVisitante = jogosVisitante;
	}
}
