package com.example;

public class Question {
    private String question;
    private String[] possibleAnswers = {};
    private int answer;

    public Question(String question, String[] possibleAnswers, int answer)
    {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.answer = answer;
    }

    // Getters
    public String getQuestion()
    {
        return this.question;
    }

    public String[] getPossbleAnswers()
    {
        return this.possibleAnswers;
    }

    public int getAnswer()
    {
        return this.answer;
    }

    // Setters
    public void setQuestion(String question)
    {
        this.question = question;
    }

    public void setPossibleAnswers(String[] possibleAnswers)
    {
        this.possibleAnswers = possibleAnswers;
    }

    public void setAnswer(int answer)
    {
        this.answer = answer;
    }
}
