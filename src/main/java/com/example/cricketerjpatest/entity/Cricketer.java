package com.example.cricketerjpatest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    @Override
    public String toString() {
        return "Cricketer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", team='" + team + '\'' +
                ", ranking='" + ranking + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeam() {
        return team;
    }

    public String getRanking() {
        return ranking;
    }
}
