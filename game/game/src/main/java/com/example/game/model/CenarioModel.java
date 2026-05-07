package com.example.game.model;

import com.example.game.enums.HemisferioCenario;
import com.example.game.enums.LootCenario;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_cenario")
public class CenarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nomeCidade;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private HemisferioCenario hemisferio;

    @Column(nullable = false)
    private String clima;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LootCenario loot;

    public CenarioModel() {
    }

    public CenarioModel(Long id, String nomeCidade, HemisferioCenario hemisferio, String clima, LootCenario loot) {
        this.id = id;
        this.nomeCidade = nomeCidade;
        this.hemisferio = hemisferio;
        this.clima = clima;
        this.loot = loot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
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
