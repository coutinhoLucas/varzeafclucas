package br.com.cc.varzeafc.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;

@Entity
public class Campeonato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Integer id;
	@Expose
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dataCriacao;
	@ManyToMany(fetch = javax.persistence.FetchType.EAGER)
	@JoinTable(name = "CAMPEONATO_PATROCINADOR", joinColumns = @JoinColumn(name = "campeonato_id"), inverseJoinColumns = @JoinColumn(name = "patrocinador_id"))
	private List<Patrocinador> patrocinadores;
	@ManyToOne
	@Expose
	private Temporada temporada;
	@Enumerated(EnumType.STRING)
	@Expose
	private CampeonatoStatus status;
	@ManyToMany
	@JoinTable(name = "INSCRICAO", joinColumns = @JoinColumn(name = "campeonato_id"), inverseJoinColumns = @JoinColumn(name = "equipe_id"))
	private List<Equipe> equipes;
	@OneToMany(mappedBy = "campeonato")
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

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
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

	public CampeonatoStatus getStatus() {
		return status;
	}

	public void setStatus(CampeonatoStatus status) {
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

	public String toJson() {
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		JsonElement jsonCampeonato = gson.toJsonTree(this);
		JsonElement jsonStatus = gson.toJsonTree(Arrays.asList(CampeonatoStatus.values()));
		jsonCampeonato.getAsJsonObject().addProperty("TodosStaus", gson.toJson(jsonStatus));
		return gson.toJson(jsonCampeonato);
	}

}
