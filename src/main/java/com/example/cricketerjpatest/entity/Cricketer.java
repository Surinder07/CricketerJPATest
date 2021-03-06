package com.example.cricketerjpatest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cricketer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String team;
    private String ranking;


    protected Cricketer(){}

    public Cricketer(String firstName, String lastName, String team, String ranking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.ranking = ranking;
    }




}
