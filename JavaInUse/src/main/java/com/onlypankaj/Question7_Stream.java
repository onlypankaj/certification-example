package com.onlypankaj;

import java.util.List;

public class Question7_Stream {
    public static void main(String[] args) {
        var students = List.of(new Student("Student-1", 50), new Student("Student-2", 45), new Student("Student-3", 40),
                new Student("Student-4", 30), new Student("Student-5", 65));
        // line l1
        if(students.stream().anyMatch(i->i.marks<0)) {
            System.out.println("Some student has scored below 40 and has failed.");
        }
    }
}

class Student {
    public String name;
    public int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
