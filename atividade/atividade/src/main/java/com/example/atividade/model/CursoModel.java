package com.example.atividade.model;

import com.example.atividade.enums.Turno;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tab_cursos")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Turno turno;

    @Column(nullable = false)
    private String instituicao;

    @Column(nullable = false)
    private LocalDate dataInicio;

    @Column(nullable = false)
    private LocalDate dataConclusao;

    public CursoModel() {
    }

    public CursoModel(Long id, String codigo, String curso, Turno turno, String instituicao, LocalDate dataInicio, LocalDate dataConclusao) {
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
