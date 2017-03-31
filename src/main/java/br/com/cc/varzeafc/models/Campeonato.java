package br.com.cc.varzeafc.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Campeonato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private LocalDate dataCriacao;
	@ManyToMany
	@JoinTable(name = "CAMPEONATO_PATROCINADOR",
				joinColumns= @JoinColumn(name ="campeonato_id"),
				inverseJoinColumns = @JoinColumn(name = "patrocinador_id"))
	private List<Patrocinador> patrocinadores;
	@ManyToOne
	private Temporada temporada;
	@ManyToOne
	private StatusCampeonato status;
	@ManyToMany
	@JoinTable(name = "INSCRICAO",
				joinColumns= @JoinColumn(name ="campeonato_id"),
				inverseJoinColumns = @JoinColumn(name = "equipe_id"))
	private List<Equipe> equipes;
	@OneToMany(mappedBy="campeonato")	
	private List<Rodada> rodadas;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public StatusCampeonato getStatus() {
		return status;
	}

	public void setStatus(StatusCampeonato status) {
		this.status = status;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public List<Rodada> getRodadas() {
		return rodadas;
	}

	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	
}
