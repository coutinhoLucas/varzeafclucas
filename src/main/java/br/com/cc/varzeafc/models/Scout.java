package br.com.cc.varzeafc.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCOUT")
public class Scout  implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Escalacao escalacao;
	
	@ManyToOne
	private TipoScout tipoScout;
	
	private Integer quantidade;
	private String tempo;

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Escalacao getEscalacao() {
		return escalacao;
	}

	public void setEscalacao(Escalacao escalacao) {
		this.escalacao = escalacao;
	}

	public TipoScout getTipoScout() {
		return tipoScout;
	}

	public void setTipoScout(TipoScout tipoScout) {
		this.tipoScout = tipoScout;
	}


	
}
