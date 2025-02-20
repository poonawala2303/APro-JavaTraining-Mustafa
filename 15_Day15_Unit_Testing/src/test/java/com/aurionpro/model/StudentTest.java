package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {

	
	Student student;
	StudentMarksService studentMarksService;
	
	@BeforeEach
	void init()
	{
		studentMarksService = Mockito.mock(StudentMarksService.class);
		student = new Student(studentMarksService);
	}
	
	@Test
	void testGetAverageMarks() 
	{
		Mockito.when(studentMarksService.getTotalMarks()).thenReturn(450);
		Mockito.when(studentMarksService.getTotalSubjects()).thenReturn(5);
		
		assertEquals(90.00, student.getAverageMarks());
	}

}
