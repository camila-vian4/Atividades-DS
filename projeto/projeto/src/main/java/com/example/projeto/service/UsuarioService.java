package com.example.projeto.service;

import com.example.projeto.dto.UsuarioRequestDTO;
import com.example.projeto.dto.UsuarioResponseDTO;
import com.example.projeto.model.UsuarioModel;
import com.example.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<UsuarioResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    public UsuarioModel salvarUsuario(UsuarioRequestDTO usuarioDTO){
        if (repository.findByEmail(usuarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Usuário já cadastrado!");
        }

        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setNome(usuarioDTO.getNome());
        novoUsuario.setEmail(usuarioDTO.getEmail());
        novoUsuario.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));

        return repository.save(novoUsuario);

    }
}
