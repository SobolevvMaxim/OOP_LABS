package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class UniversityStudent extends AbstractStudent {
    /* Keys: Integer - number of examination, Boolean - passed or not */
    private final Map<Integer, Boolean> examinationsMap = new LinkedHashMap<>(8);

    public UniversityStudent(String FIO, int rating) {
        super(FIO, rating);
    }

    public UniversityStudent(String FIO) {
        super(FIO);
    }

    public void addExamination(int examinationID, boolean passed) {
        examinationsMap.put(examinationID, passed);
    }

    public Map<Integer, Boolean> getExaminationsMap() {
        return examinationsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UniversityStudent that = (UniversityStudent) o;
        return Objects.equals(examinationsMap, that.examinationsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), examinationsMap);
    }

    @Override
    public String toString() {
        return "UniversityStudent{" +
                "FIO='" + FIO + '\'' +
                ", examinationsMap=" + examinationsMap +
                '}';
    }
}
