package br.com.cc.varzeafc.models;

import java.time.LocalDate;
import java.util.List;

public class Jogo {

	private Integer id;
	private Equipe equipeMandante;
	private Equipe equipeVisitante;
	private LocalDate dataDaPartida;
	private Integer golsMandante;
	private Integer golsVisitante;
	private StatusJogo status;
	private Rodada rodada;
	private LocalPartida localDaPartida;
	private List<Jogador> jogadores;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Equipe getEquipeMandante() {
		return equipeMandante;
	}

	public void setEquipeMandante(Equipe equipeMandante) {
		this.equipeMandante = equipeMandante;
	}

	public Equipe getEquipeVisitante() {
		return equipeVisitante;
	}

	public void setEquipeVisitante(Equipe equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}

	public LocalDate getDataDaPartida() {
		return dataDaPartida;
	}

	public void setDataDaPartida(LocalDate dataDaPartida) {
		this.dataDaPartida = dataDaPartida;
	}

	public Integer getGolsMandante() {
		return golsMandante;
	}

	public void setGolsMandante(Integer golsMandante) {
		this.golsMandante = golsMandante;
	}

	public Integer getGolsVisitante() {
		return golsVisitante;
	}

	public void setGolsVisitante(Integer golsVisitante) {
		this.golsVisitante = golsVisitante;
	}

	public StatusJogo getStatus() {
		return status;
	}

	public void setStatus(StatusJogo status) {
		this.status = status;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public LocalPartida getLocalDaPartida() {
		return localDaPartida;
	}

	public void setLocalDaPartida(LocalPartida localDaPartida) {
		this.localDaPartida = localDaPartida;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
