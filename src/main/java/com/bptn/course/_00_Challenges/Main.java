package com.bptn.course._00_Challenges;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)
    	
    	Student student1 = new Student(123, "testUsername2", "password", "Jeff", "Hardy", "j.hardy@example.com", "1234567890", "100 Kingston Rd", "Male", new Date(), new Date(), 101, "Curriculum A");
        Student student2 = new Student(124, "testUsername1", "drowssap", "Shiloh", "Jolie", "s.jolie@example.com", "0987654321", "44 Markham Rd", "Female", new Date(), new Date(), 102, "Curriculum B");
        
        // Create instance of university called "university" and populate it with the students.
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        
        
        // Get delete, search update university
        System.out.println("\nUniversity ------ \n" + university.getStudents());
        System.out.println("\nGetting student------\n" + university.getStudent(123));
       
        //university.deleteStudent(123);
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUpdated University ------ \n" + university.getStudents());

    }
}
