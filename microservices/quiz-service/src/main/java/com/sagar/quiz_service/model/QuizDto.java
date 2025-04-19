package com.sagar.quiz_service.model;

public class QuizDto {
    private String category;
    private int numQ;
    private String title;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumQ() {
        return numQ;
    }

    public void setNumQ(int numQ) {
        this.numQ = numQ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public QuizDto() {
    }

    public QuizDto(String category, int numQ, String title) {
        this.category = category;
        this.numQ = numQ;
        this.title = title;
    }

    @Override
    public String toString() {
        return "QuizDto{" +
                "category='" + category + '\'' +
                ", numQ=" + numQ +
                ", title='" + title + '\'' +
                '}';
    }
}

