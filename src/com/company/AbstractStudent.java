package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStudent {
    public final String FIO;
    private List<Integer> grades = new ArrayList<>();
    private int rating;

    public AbstractStudent(String FIO, int rating) {
        this.FIO = FIO;
        this.rating = rating;
    }

    public AbstractStudent(String FIO) {
        this.FIO = FIO;
    }

    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
