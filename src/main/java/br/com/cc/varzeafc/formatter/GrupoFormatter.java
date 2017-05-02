package br.com.cc.varzeafc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import br.com.cc.varzeafc.models.Grupo;

public class GrupoFormatter  implements  Formatter<Grupo>{

	@Override
	public String print(Grupo grupo, Locale locale) {
		return grupo.getId().toString();
	}

	@Override
	public Grupo parse(String id, Locale locale) throws ParseException {
		Grupo grupo = new Grupo();
		grupo.setId(Integer.parseInt(id));
		return grupo;
	}


}
