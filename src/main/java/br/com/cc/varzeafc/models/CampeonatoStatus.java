package br.com.cc.varzeafc.models;

public enum CampeonatoStatus {
	
	ANDAMENTO("Em andamento"),
	ABERTO("Aberto para inscrições"),
	ENCERRADO("Encerrado");
	
	private String descricao;
	
	CampeonatoStatus(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
