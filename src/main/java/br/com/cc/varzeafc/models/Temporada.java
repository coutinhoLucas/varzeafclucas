package br.com.cc.varzeafc.models;

import java.util.List;

public class Temporada {

	private List<Campeonato> campeonatos;
	private int ano;

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
