package com.example;
import java.util.List;

public class Player {
    private String name;
    private int age;
    private List<Videogame> videogamesList;

    public Player(int age, String name, List<Videogame> videogamesList) {
        this.age = age;
        this.name = name;
        this.videogamesList = videogamesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Videogame> getVideogamesList() {
        return videogamesList;
    }

    public void setVideogamesList(List<Videogame> videogamesList) {
        this.videogamesList = videogamesList;
    }

    public void addBoughtVideogame(Videogame newBougVideogame)
    {
        this.videogamesList.add(newBougVideogame);
    }
}
