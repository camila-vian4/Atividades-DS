package com.example.game.service;

import com.example.game.dto.JogadorRequestDTO;
import com.example.game.dto.JogadorResponseDTO;
import com.example.game.model.JogadorModel;
import com.example.game.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository repository;

    public List<JogadorResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(j -> new JogadorResponseDTO(j.getNickname(), j.getIdade(), j.getEmail()))
                .toList();
    }

    public JogadorModel cadastrarJogador(JogadorRequestDTO jogadorDTO) {
        if (repository.findByEmail(jogadorDTO.getEmail()).isPresent()) {
            throw new RuntimeException("Jogador já cadastrado! ❌");
        }

        JogadorModel jogador = new JogadorModel();
        jogador.setNickname(jogadorDTO.getNickname());
        jogador.setIdade(jogadorDTO.getIdade());
        jogador.setEmail(jogadorDTO.getEmail());
        jogador.setSenha(jogadorDTO.getSenha());

        return repository.save(jogador);
    }

    public JogadorModel atualizarJogador(Long id, JogadorRequestDTO jogadorDTO){

        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Jogador não encontrado! 🔍");
        }

        JogadorModel novoJogador = new JogadorModel();
        novoJogador.setId(id);

        novoJogador.setNickname(jogadorDTO.getNickname());
        novoJogador.setIdade(jogadorDTO.getIdade());
        novoJogador.setEmail(jogadorDTO.getEmail());
        novoJogador.setSenha(jogadorDTO.getSenha());

        return repository.save(novoJogador);
    }

    public void deletarJogador(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Jogador não encontrado! 🔍");
        }
        repository.deleteById(id);
    }
}
