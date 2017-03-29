package br.com.cc.varzeafc.models;

public class Scout {

	private Escalacao escalacao;
	private TipoScout tipo;
	private Integer quantidade;
	private String tempo;
	
	public Escalacao getEscalacao() {
		return escalacao;
	}

	public void setEscalacao(Escalacao escalacao) {
		this.escalacao = escalacao;
	}

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

	public TipoScout getTipo() {
		return tipo;
	}

	public void setTipo(TipoScout tipo) {
		this.tipo = tipo;
	}
	
}
