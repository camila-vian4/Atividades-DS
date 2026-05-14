package com.example.atividade.service;

import com.example.atividade.dto.alunodto.AlunoRequestDTO;
import com.example.atividade.dto.cursodto.CursoRequestDTO;
import com.example.atividade.dto.cursodto.CursoResponseDTO;
import com.example.atividade.model.AlunoModel;
import com.example.atividade.model.CursoModel;
import com.example.atividade.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public CursoModel cadastrarCurso(CursoRequestDTO cursoDTO) {
        if(repository.findByCodigo(cursoDTO.getCodigo()).isPresent()){
            throw new RuntimeException("Curso já cadastrado! ❌");
        }

        CursoModel curso = new CursoModel();
        curso.setCodigo(cursoDTO.getCodigo());
        curso.setCurso(cursoDTO.getCurso());
        curso.setTurno(cursoDTO.getTurno());
        curso.setInstituicao(cursoDTO.getInstituicao());
        curso.setDataInicio(cursoDTO.getDataInicio());
        curso.setDataConclusao(cursoDTO.getDataConclusao());

        return repository.save(curso);
    }

    public List<CursoResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(c -> new CursoResponseDTO(c.getId(), c.getCodigo(), c.getCurso(), c.getTurno(), c.getInstituicao(), c.getDataInicio(), c.getDataConclusao()))
                .toList();
    }

    public CursoModel atualizarCurso(Long id, CursoRequestDTO cursoDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Curso não encontrado! 🔍");
        }

        CursoModel novoCurso = new CursoModel();
        novoCurso.setId(id);

        novoCurso.setCodigo(cursoDTO.getCodigo());
        novoCurso.setCurso(cursoDTO.getCurso());
        novoCurso.setTurno(cursoDTO.getTurno());
        novoCurso.setInstituicao(cursoDTO.getInstituicao());
        novoCurso.setDataInicio(cursoDTO.getDataInicio());
        novoCurso.setDataConclusao(cursoDTO.getDataConclusao());

        return repository.save(novoCurso);
    }

    public void deletarCurso(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Curso não encontrado! 🔍");
        }
        repository.deleteById(id);
    }
}
