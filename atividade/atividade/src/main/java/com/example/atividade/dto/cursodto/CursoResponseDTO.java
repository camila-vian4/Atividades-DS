package com.example.atividade.dto.cursodto;

import com.example.atividade.enums.Turno;

import java.time.LocalDate;

public class CursoResponseDTO {

    private Long id;
    private String codigo;
    private String curso;
    private Turno turno;
    private String instituicao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(Long id, String codigo, String curso, Turno turno, String instituicao, LocalDate dataInicio, LocalDate dataConclusao) {
        this.id = id;
        this.codigo = codigo;
        this.curso = curso;
        this.turno = turno;
        this.instituicao = instituicao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
