package br.com.cc.varzeafc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import br.com.cc.varzeafc.models.Patrocinador;

public class PatrocinadorFormatter implements Formatter<Patrocinador> {

	@Override
	public String print(Patrocinador patrocinador, Locale locale) {
		return patrocinador.getId().toString();
	}

	@Override
	public Patrocinador parse(String id, Locale locale) throws ParseException {
		Patrocinador patrocinador = new Patrocinador();
		patrocinador.setId(Integer.parseInt(id));
		return patrocinador;
	}

}
