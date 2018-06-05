package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table (name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    String name;


    String type;

    public Game() {

    }
    public Game(String name, String type){
        this.name = name;
        this.type = type;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
