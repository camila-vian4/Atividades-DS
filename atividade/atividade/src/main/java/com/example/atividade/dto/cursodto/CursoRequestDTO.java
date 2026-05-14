package com.example.atividade.dto.cursodto;

import com.example.atividade.enums.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class CursoRequestDTO {

    private Long id;


    @NotBlank(message = "O código do curso é obrigatório.")
    private String codigo;

    @NotBlank(message = "O nome do curso é obrigatório.")
    private String curso;

    @NotNull(message = "O turno é obrigatório.")
    private Turno turno;

    @NotBlank(message = "Informar a instituição de ensino é obrigatório.")
    private String instituicao;

    @NotNull(message = "A data de início é obrigatória.")
    private LocalDate dataInicio;

    @NotNull(message = "A data de início é obrigatória.")
    private LocalDate dataConclusao;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(Long id, String codigo, String curso, Turno turno, String instituicao, LocalDate dataInicio, LocalDate dataConclusao) {
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

    public @NotBlank(message = "O código do curso é obrigatório.") String getCodigo() {
        return codigo;
    }

    public void setCodigo(@NotBlank(message = "O código do curso é obrigatório.") String codigo) {
        this.codigo = codigo;
    }

    public @NotBlank(message = "O nome do curso é obrigatório.") String getCurso() {
        return curso;
    }

    public void setCurso(@NotBlank(message = "O nome do curso é obrigatório.") String curso) {
        this.curso = curso;
    }

    public @NotNull(message = "O turno é obrigatório.") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "O turno é obrigatório.") Turno turno) {
        this.turno = turno;
    }

    public @NotBlank(message = "Informar a instituição de ensino é obrigatório.") String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(@NotBlank(message = "Informar a instituição de ensino é obrigatório.") String instituicao) {
        this.instituicao = instituicao;
    }

    public @NotNull(message = "A data de início é obrigatória.") LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(@NotNull(message = "A data de início é obrigatória.") LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public @NotNull(message = "A data de início é obrigatória.") LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(@NotNull(message = "A data de início é obrigatória.") LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
