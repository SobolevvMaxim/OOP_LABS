package com.company;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        List<AbstractStudent> students = new ArrayList<>();
        students.add(new UniversityStudent("Sobolev M.D."));
        students.add(new UniversityStudent("Sobolev M.D.", 9));
        students.add(new Pupil("Sobolev M.D.", 10));
        printQuantity(students);
        System.out.println(students);
    }

    private static void printQuantity(List<AbstractStudent> students) {
        int pupils = students.stream().reduce(0, (counter, studentToIdentify) -> {
            if (studentToIdentify instanceof Pupil)
                return counter + 1;
            return counter;
        }, (counter, student) -> counter);
        System.out.println("Pupils: " + pupils + "\nStudents: " + (students.size() - pupils));
    }
}