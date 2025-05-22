package com.example;

public class Survey {
    private String title;
    private Question[] questions;

    public Survey(String title, Question[] questions)
    {
        this.title = title;
        this.questions = questions;
    }
}
