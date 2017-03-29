package br.com.cc.varzeafc.models;

import java.util.List;

public class StatusJogo extends Status {

	private List<Jogo> jogos;

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
}
