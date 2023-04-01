package com.kien.knightroot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ThemeParkRide {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;

    private int thrillFator;

    private int vomitFactor;

    public ThemeParkRide(String name, String description, int thrillFator, int vomitFactor) {
        this.name = name;
        this.description = description;
        this.thrillFator = thrillFator;
        this.vomitFactor = vomitFactor;
    }
    
}
