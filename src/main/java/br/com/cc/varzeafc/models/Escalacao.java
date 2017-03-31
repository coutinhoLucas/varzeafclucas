package br.com.cc.varzeafc.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ESCALACAO")
public class Escalacao {

	@EmbeddedId
	private EscalacaoPK escalacaoPK;

	public EscalacaoPK getEscalacaoPK() {
		return escalacaoPK;
	}

	public void setEscalacaoPK(EscalacaoPK escalacaoPK) {
		this.escalacaoPK = escalacaoPK;
	}

}
