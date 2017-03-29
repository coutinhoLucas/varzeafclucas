package br.com.cc.varzeafc.models;

import java.time.LocalDate;
import java.util.List;

public class Campeonato {

	private Integer id;
	private String nome;
	private LocalDate dataCriacao;
	private List<Patrocinador> patrocinadores;
	private Temporada temporada;
	private StatusCampeonato status;
	private List<Equipe> equipes;
	private List<Rodada> rodadas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public StatusCampeonato getStatus() {
		return status;
	}

	public void setStatus(StatusCampeonato status) {
		this.status = status;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public List<Rodada> getRodadas() {
		return rodadas;
	}

	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}

}
