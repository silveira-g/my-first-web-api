package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save (Usuario usuario) {
        if (usuario.getId()==null)
        System.out.println("SAVE - Recebendoo usuario na camada de repositorio");
        else
        System.out.println("UPDATE - recebendo o usuario na camada de repositorio");
    }
    public void deletebyId(Integer id){
        System.out.println(String.format("DELELTE/id - Recebendo o id %d para excluir um usuario"));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - retornando os usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("guilherme", "senha"));
        usuarios.add(new Usuario("jefferson", "abcd"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println("FIND/id - Recebendo o id: %d para ler o banco");
        return new Usuario("guilherme", "senha");
    }
    public Usuario findByUsername(String username){
        System.out.println("FIND/username - Recebendo o username para ler o banco");
        return new Usuario("guilherme", "senha");
    }
}
