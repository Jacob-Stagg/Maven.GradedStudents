package io.zipcoder;

public class Classroom {
    private Student[] students;
    private Integer maxNumberOfStudents;

    public Classroom(Integer maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = new Student[maxNumberOfStudents];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        String examScore = "";

        for (Student student : students) {
            examScore += student;
        }

        Double averageExamScore = Double.parseDouble(examScore);

        return averageExamScore / students.length;
    }

    public String addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] = student;
        }

        return "";
    }


}
