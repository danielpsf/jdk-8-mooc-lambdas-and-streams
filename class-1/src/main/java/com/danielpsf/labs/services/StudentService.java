package com.danielpsf.labs.services;

import java.util.Collection;

import com.danielpsf.labs.model.Student;

public class StudentService {

	public Double getBetterStudentOfTheYear(Collection<Student> students) {
		Double highScore = 0.0;
		
		for (Student student : students) {
			if(student.getGraduationYear() == 2015) {
				if(student.getScore() > highScore) {
					highScore = student.getScore();
				}
			}
		}
		return highScore;
	}
}
