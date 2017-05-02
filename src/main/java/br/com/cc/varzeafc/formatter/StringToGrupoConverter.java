package br.com.cc.varzeafc.formatter;

import java.util.List;

import org.springframework.core.convert.converter.Converter;

import br.com.cc.varzeafc.models.Grupo;

public class StringToGrupoConverter implements Converter<String, List<Grupo>> {
	
	private List<Grupo> grupos;
	
	public StringToGrupoConverter(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public List<Grupo> convert(String source) {
		if (source == null || source.isEmpty()) {
            return null;
        }
		Grupo grupo = new Grupo();
		grupo.setId(Integer.parseInt(source));
		grupos.add(grupo);
		return grupos;

	}
}