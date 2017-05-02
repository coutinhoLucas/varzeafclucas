package br.com.cc.varzeafc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import br.com.cc.varzeafc.models.Temporada;

public class TemporadaFormatter implements Formatter<Temporada>{

	@Override
	public String print(Temporada temporada, Locale locale) {
		return temporada.getId().toString();
	}

	@Override
	public Temporada parse(String id, Locale locale) throws ParseException {
		Temporada temporada = new Temporada();
		temporada.setId(Integer.parseInt(id));
		return temporada;
	}

}
