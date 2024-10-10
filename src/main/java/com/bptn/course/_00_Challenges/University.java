package com.bptn.course._00_Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class University {

	// property - get inspired by the UML diagram
	private List<Student> students = new ArrayList<>();

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);// student object added to list
	}
	// get the first student in the university that has the studentId. (ideally,
			// this would be unique, so you can stop searching after finding the fist match)
	// student caught by studentId
	public Student getStudent(long studentId) {
		for (Student s : students) {
			if (s.getStudentId() == studentId) {
				return s;
			}
		}
		return null;
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		return students.stream()
                .filter(s -> s.getUserName().startsWith(userNamePrefix))
                .collect(Collectors.toList());
	}

	public boolean deleteStudent(long studentId) {
        return students.removeIf(s -> s.getStudentId() == studentId);
    }
	public void editStudent(long studentId, Student newStudent) {
	    for (int i = 0; i < students.size(); i++) {
	        if (students.get(i).getStudentId() == studentId) {
	            students.set(i, newStudent);  // Replace old student with new one
	            break;
	        }
	    }
	}	   
	public List<Student> getStudents() {
        return students;
    }
    @Override
    public String toString() {
        return students.toString();
	}

}

