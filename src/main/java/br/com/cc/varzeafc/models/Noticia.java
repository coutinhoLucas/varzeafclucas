package br.com.cc.varzeafc.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Noticia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dataPublicacao;
	private String titulo;
	private String introducao;
	private String descricao;
	private String caminhoImagem;
	@ManyToOne
	private Rodada rodada;

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntroducao() {
		return introducao;
	}

	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
