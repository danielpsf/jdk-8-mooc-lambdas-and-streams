package com.danielpsf.labs.services

import com.danielpsf.labs.model.Student

import spock.lang.Specification
import spock.lang.Unroll

class StudentServiceSpec extends Specification {

	def "should get the highest score in the year"() {
		given:
		StudentService service = new StudentService();
		
		expect:
		service.getBetterScoreOfTheYear(students, year) == result
		
		where:
		students                                                                                                | year | result
		[new Student("Daniel", 9.8, 2015), new Student("Juliana", 9.9, 2015), new Student("Luke", 10.0, 2013)]  | 2015 | 9.9
		[new Student("Fries", 10.0, 2015), new Student("Petty", 9.9, 2015), new Student("Bread", 9.8, 2013)]    | 2013 | 9.8
		
	}
	
}