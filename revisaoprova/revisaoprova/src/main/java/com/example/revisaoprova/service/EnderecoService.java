package com.example.revisaoprova.service;

import com.example.revisaoprova.dto.endereco.EnderecoRequestDTO;
import com.example.revisaoprova.dto.endereco.EnderecoResponseDTO;
import com.example.revisaoprova.model.EnderecoModel;
import com.example.revisaoprova.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public EnderecoModel cadastrar(EnderecoRequestDTO enderecoDTO){
        if (repository.findByCep(enderecoDTO.getCep()).isPresent()){
            throw new RuntimeException("Endereço já cadastrado! ❌");
        }

        EnderecoModel endereco = new EnderecoModel();
        endereco.setCep(enderecoDTO.getCep());
        endereco.setLogradouro(enderecoDTO.getLogradouro());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setUf(enderecoDTO.getUf());

        return repository.save(endereco);
    }

    public List<EnderecoResponseDTO> listar(){
        return repository
                .findAll()
                .stream()
                .map(e -> new EnderecoResponseDTO(e.getId(), e.getCep(), e.getLogradouro(), e.getNumero(), e.getCidade(), e.getUf()))
                .toList();
    }

    public EnderecoModel atualizar(Long id, EnderecoRequestDTO enderecoDTO) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Endereço não encontrado! 🔍");
        }
        EnderecoModel novoEndereco = new EnderecoModel();
        novoEndereco.setCep(enderecoDTO.getCep());
        novoEndereco.setLogradouro(enderecoDTO.getLogradouro());
        novoEndereco.setNumero(enderecoDTO.getNumero());
        novoEndereco.setCidade(enderecoDTO.getCidade());
        novoEndereco.setUf(enderecoDTO.getUf());

        return repository.save(novoEndereco);
    }

    public void deletar(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Endereço não encontrado! 🔍");
        }

        repository.deleteById(id);
    }
}
