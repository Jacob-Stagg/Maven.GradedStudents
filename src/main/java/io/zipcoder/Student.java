package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;
    Integer examsTaken;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = "Jacob";
        this.lastName = "Stagg";
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getExamScores() {
        String examSheet = "";
        Integer counter = 0;

        for (int i = 0; i < examScores.size(); i++) {
            counter++;

            examSheet += "Exam" + counter + "-> " + examScores.get(i) + "\n";
        }

        return examSheet;
    }

    public String addExamScore(Double examScore) {
        examScores.add(examScore);

        return "Exam 1 -> " + examScores.get(0);
    }

    public String setExamScore(Integer examNumber, Double newScore) {
        examScores.set(examNumber, newScore);

        return "Exam 1 -> " + examScores.get(examNumber);
    }

    public Double getAverageExamScore() {
        Double averageScore = 0.0;

        for (int i = 0; i < examScores.size(); i++) {
            averageScore += examScores.get(i);
        }

        return averageScore / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName +
                "\n> " + "Average Score: " + getAverageExamScore() +
                "\n> " + "Exam Scores:" + "\n" + getExamScores();
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getTestScores() {
        return examScores;
    }

    public Integer getNumberOfExamsTaken() {
        return examsTaken;
    }
}
