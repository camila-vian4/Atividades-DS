package com.example.revisao.service;

import com.example.revisao.dto.cliente.ClienteRequestDTO;
import com.example.revisao.dto.cliente.ClienteResponseDTO;
import com.example.revisao.model.ClienteModel;
import com.example.revisao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public ClienteModel cadastrar(ClienteRequestDTO clienteDTO){
        if(repository.findByCpf(clienteDTO.getCpf()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado! ❌");
        }

        ClienteModel cliente = new ClienteModel();
        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setSexo(clienteDTO.getSexo());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setSenha(passwordEncoder.encode(clienteDTO.getSenha()));

        return repository.save(cliente);
    }

    public List<ClienteResponseDTO> listar(){
        return repository
                .findAll()
                .stream()
                .map(c -> new ClienteResponseDTO(c.getId(), c.getNome(), c.getCpf(), c.getSexo(), c.getTelefone(), c.getEmail()))
                .toList();
    }

    public ClienteModel atualizar(Long id, ClienteRequestDTO clienteDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Cliente não encontrado! 🔍");
        }

        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setId(id);

        novoCliente.setNome(clienteDTO.getNome());
        novoCliente.setCpf(clienteDTO.getCpf());
        novoCliente.setSexo(clienteDTO.getSexo());
        novoCliente.setTelefone(clienteDTO.getTelefone());
        novoCliente.setEmail(clienteDTO.getEmail());
        novoCliente.setSenha(passwordEncoder.encode(clienteDTO.getSenha()));

        return repository.save(novoCliente);
    }

    public void deletar(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Cliente não encontrado! 🔍");
        }

        repository.deleteById(id);
    }
}
