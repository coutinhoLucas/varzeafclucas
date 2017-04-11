package teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.cc.varzeafc.daos.UsuarioDAO;
import br.com.cc.varzeafc.models.Grupo;
import br.com.cc.varzeafc.models.Usuario;

public class teste {
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();
		
		Grupo grupo = new Grupo();
		List<Grupo> grupos = new ArrayList<>();
		grupo.setId(1);
		grupos.add(grupo);
		
		usuario.setLogin("thiagortz");
		usuario.setSenha(new BCryptPasswordEncoder().encode("123"));
		usuario.setGrupos(grupos);
		
		dao.salva(usuario);
		
		
	}

}
