package com.example.revisao.service;

import com.example.revisao.dto.ColaboradorRequestDTO;
import com.example.revisao.dto.cliente.ClienteRequestDTO;
import com.example.revisao.dto.cliente.ClienteResponseDTO;
import com.example.revisao.model.ClienteModel;
import com.example.revisao.model.ColaboradorModel;
import com.example.revisao.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public ColaboradorModel cadastrar(ColaboradorRequestDTO colaboradorDTO){
        if(repository.findByCpf(colaboradorDTO.getCpf()).isPresent()){
            throw new RuntimeException("Colaborador já cadastrado! ❌");
        }

        ColaboradorModel colaborador = new ColaboradorModel();
        colaborador.setNome(colaboradorDTO.getNome());
        colaborador.setCpf(colaboradorDTO.getCpf());
        colaborador.setSexo(colaboradorDTO.getSexo());
        colaborador.setTelefone(colaboradorDTO.getTelefone());
        colaborador.setEmail(colaboradorDTO.getEmail());
        colaborador.setSenha(passwordEncoder.encode(colaboradorDTO.getSenha()));

        return repository.save(colaborador);
    }

    public List<ClienteResponseDTO> listar(){
        return repository
                .findAll()
                .stream()
                .map(c -> new ClienteResponseDTO(c.getId(), c.getNome(), c.getCpf(), c.getSexo(), c.getTelefone(), c.getEmail()))
                .toList();
    }
    public ColaboradorModel atualizar(Long id, ColaboradorRequestDTO colaboradorDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Colaborador não encontrado! 🔍");
        }

        ColaboradorModel novoColaborador = new ColaboradorModel();
        novoColaborador.setId(id);

        novoColaborador.setNome(colaboradorDTO.getNome());
        novoColaborador.setCpf(colaboradorDTO.getCpf());
        novoColaborador.setSexo(colaboradorDTO.getSexo());
        novoColaborador.setTelefone(colaboradorDTO.getTelefone());
        novoColaborador.setEmail(colaboradorDTO.getEmail());
        novoColaborador.setSenha(passwordEncoder.encode(colaboradorDTO.getSenha()));

        return repository.save(novoColaborador);
    }

    public void deletar(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Colaborador não encontrado! 🔍");
        }

        repository.deleteById(id);
    }
}
