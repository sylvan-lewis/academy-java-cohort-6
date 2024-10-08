package com.bptn.course._15_java_collections_list_array_list_coding_32;

class Student {

    private String name;
    private int classGrade;

    public Student(String name, int classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return this.name;
    }

    public int getClassGrade() {
        return this.classGrade;
    }

    // overrides the default Object toString method;
    public String toString() {
        return "Student name is: " + name + " and student's class grade is: Grade " + classGrade;
    }

}