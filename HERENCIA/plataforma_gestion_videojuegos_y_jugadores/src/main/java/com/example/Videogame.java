package com.example;

public class Videogame {
    protected String title;
    protected String developer;
    protected Double price;

    public Videogame(String developer, Double price, String title) {
        this.developer = developer;
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videogame{");
        sb.append("title=").append(title);
        sb.append(", developer=").append(developer);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
