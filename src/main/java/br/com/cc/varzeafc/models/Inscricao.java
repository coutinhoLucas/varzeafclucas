package br.com.cc.varzeafc.models;

import java.time.LocalDate;
import java.util.List;

public class Inscricao {

	private Campeonato campeonato;
	private Equipe equipe;
	private Double valor;
	private LocalDate DataPagamento;
	private String statusPagamento;
	private List<Jogador> jogadores;

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		DataPagamento = dataPagamento;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
