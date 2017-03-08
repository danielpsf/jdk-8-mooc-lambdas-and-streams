package com.danielpsf.labs.services;

import java.util.List;

import com.danielpsf.labs.model.Student;

public class StudentService {

	public Double getBetterScoreOfTheYear(List<Student> students, int year) {
		Double highScore = 0.0;
		
		highScore = students.stream()
			.filter(s -> s.getGraduationYear() == year)
			.map(s -> s.getScore())
			.max((x, y) -> Double.compare(x, y))
			.get();
		
		return highScore;
	}
}
