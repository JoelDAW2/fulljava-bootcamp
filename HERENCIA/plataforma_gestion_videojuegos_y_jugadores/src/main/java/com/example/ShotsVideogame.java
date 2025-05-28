package com.example;

public class ShotsVideogame extends Videogame{
    private boolean multiplayer;

    public ShotsVideogame(boolean multiplayer, String developer, Double price, String title) {
        super(developer, price, title);
        this.multiplayer = multiplayer;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videogame{");
        sb.append("title=").append(this.title);
        sb.append(", developer=").append(this.developer);
        sb.append(", price=").append(this.price);
        sb.append(", multiplayer=").append(this.multiplayer);
        sb.append('}');
        return sb.toString();
    }
}
