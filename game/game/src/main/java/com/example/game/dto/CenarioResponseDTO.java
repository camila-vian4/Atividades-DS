package com.example.game.dto;

import com.example.game.enums.HemisferioCenario;
import com.example.game.enums.LootCenario;

public class CenarioResponseDTO {
    private String nomeCenario;
    private HemisferioCenario hemisferio;
    private String clima;
    private LootCenario loot;

    public CenarioResponseDTO() {
    }

    public CenarioResponseDTO(String nomeCenario, HemisferioCenario hemisferio, String clima, LootCenario loot) {
        this.nomeCenario = nomeCenario;
        this.hemisferio = hemisferio;
        this.clima = clima;
        this.loot = loot;
    }

    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public HemisferioCenario getHemisferio() {
        return hemisferio;
    }

    public void setHemisferio(HemisferioCenario hemisferio) {
        this.hemisferio = hemisferio;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LootCenario getLoot() {
        return loot;
    }

    public void setLoot(LootCenario loot) {
        this.loot = loot;
    }
}
