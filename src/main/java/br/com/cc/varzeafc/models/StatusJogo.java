package br.com.cc.varzeafc.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class StatusJogo extends Status {

	@OneToMany(mappedBy="status")
	private List<Jogo> jogos;

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
}
