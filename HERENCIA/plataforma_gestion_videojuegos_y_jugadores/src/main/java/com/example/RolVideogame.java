package com.example;

public class RolVideogame extends Videogame{
    private int estimatedDuration;

    public RolVideogame(int estimatedDuration, String developer, Double price, String title) {
        super(developer, price, title);
        this.estimatedDuration = estimatedDuration;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videogame{");
        sb.append("title=").append(this.title);
        sb.append(", developer=").append(this.developer);
        sb.append(", price=").append(this.price);
        sb.append(", estimatedDuration=").append(this.estimatedDuration);
        sb.append('}');
        return sb.toString();
    }
}
