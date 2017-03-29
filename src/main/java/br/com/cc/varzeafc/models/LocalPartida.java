package br.com.cc.varzeafc.models;

import java.util.List;

public class LocalPartida {

	private String nomeLocalPartida;
	private Endereco endereco;
	private List<Jogo> jogos;

	public String getNomeLocalPartida() {
		return nomeLocalPartida;
	}

	public void setNomeLocalPartida(String nomeLocalPartida) {
		this.nomeLocalPartida = nomeLocalPartida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

}
