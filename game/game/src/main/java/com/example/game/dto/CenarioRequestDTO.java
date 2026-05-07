package com.example.game.dto;

import com.example.game.enums.HemisferioCenario;
import com.example.game.enums.LootCenario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 4, message = "A cidade deve ter no mínimo 04 caracteres.")
    @Size(max = 20, message = "A cidade deve ter no máximo 20 caracteres.")
    private String nomeCidade;

    @NotNull(message = "O hemisfério é obrigatório.")
    private HemisferioCenario hemisferio;

    @NotNull(message = "O clima é obrigatório.")
    private String clima;

    @NotNull(message = "O loot é obrigatório.")
    private LootCenario loot;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(String nomeCidade, HemisferioCenario hemisferio, String clima, LootCenario loot) {
        this.nomeCidade = nomeCidade;
        this.hemisferio = hemisferio;
        this.clima = clima;
        this.loot = loot;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 4, message = "A cidade deve ter no mínimo 04 caracteres.") @Size(max = 20, message = "A cidade deve ter no máximo 20 caracteres.") String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(@NotBlank(message = "O nome é obrigatório.") @Size(min = 4, message = "A cidade deve ter no mínimo 04 caracteres.") @Size(max = 20, message = "A cidade deve ter no máximo 20 caracteres.") String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public @NotNull(message = "O hemisfério é obrigatório.") HemisferioCenario getHemisferio() {
        return hemisferio;
    }

    public void setHemisferio(@NotNull(message = "O hemisfério é obrigatório.") HemisferioCenario hemisferio) {
        this.hemisferio = hemisferio;
    }

    public @NotNull(message = "O clima é obrigatório.") String getClima() {
        return clima;
    }

    public void setClima(@NotNull(message = "O clima é obrigatório.") String clima) {
        this.clima = clima;
    }

    public @NotNull(message = "O loot é obrigatório.") LootCenario getLoot() {
        return loot;
    }

    public void setLoot(@NotNull(message = "O loot é obrigatório.") LootCenario loot) {
        this.loot = loot;
    }
}
