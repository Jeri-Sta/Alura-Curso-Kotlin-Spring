package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Pedro",
            email = "pedro@email.com"
        )
        usuarios = listOf(usuario)
    }

    fun buscaPorId(id: Long): Usuario {
        return usuarios.single { u -> u.id == id }
    }

}
