package it.eneaminelli;

// ---Hybrid Inheritance---
//Base class: GameEntity -> could represent any object

public abstract class GameEntity {
    protected String name;

    public GameEntity(String name) {
        this.name = name;
    }
}
