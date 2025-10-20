package com.example.meu_primeiro_springboot.Service;

import com.example.meu_primeiro_springboot.model.Usuario;
import com.example.meu_primeiro_springboot.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDatailsService implements UserDetailsService {

   private final UsuarioRepository usuarioRepository;

   public UsuarioDatailsService(UsuarioRepository usuarioRepository) {
       this.usuarioRepository = usuarioRepository;
   }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findByusername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        return User.builder()
                .username(usuario.getUsername())
                .password(usuario.getPassword())
                .roles("USER")
                .build();
    }
}
