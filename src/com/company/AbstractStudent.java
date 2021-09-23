package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractStudent {
    public final String FIO;
    private final List<Integer> grades = new ArrayList<>();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractStudent that = (AbstractStudent) o;
        return rating == that.rating && FIO.equals(that.FIO) && Objects.equals(grades, that.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, grades, rating);
    }

    @Override
    public String toString() {
        return "AbstractStudent{" +
                "FIO='" + FIO + '\'' +
                ", grades=" + grades +
                ", rating=" + rating +
                '}';
    }
}
