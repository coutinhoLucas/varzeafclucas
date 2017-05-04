package br.com.cc.varzeafc.models;

import java.util.List;

public class StatusCampeonato extends Status{

	private List<Campeonato> campeonatos;

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
}
