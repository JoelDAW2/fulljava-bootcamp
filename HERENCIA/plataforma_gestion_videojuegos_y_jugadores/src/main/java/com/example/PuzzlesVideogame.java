package com.example;

public class PuzzlesVideogame extends Videogame{
    private int lvlsQuantity;

    public PuzzlesVideogame(int lvlsQuantity, String developer, Double price, String title) {
        super(developer, price, title);
        this.lvlsQuantity = lvlsQuantity;
    }

    public int getLvlsQuantity() {
        return lvlsQuantity;
    }

    public void setLvlsQuantity(int lvlsQuantity) {
        this.lvlsQuantity = lvlsQuantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videogame{");
        sb.append("title=").append(this.title);
        sb.append(", developer=").append(this.developer);
        sb.append(", price=").append(this.price);
        sb.append(", lvlsQuantity=").append(this.lvlsQuantity);
        sb.append('}');
        return sb.toString();
    }
}
