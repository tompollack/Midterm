package com.cisc181.core;

import java.util.UUID;

public class Enrollment 
{
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment()
	{
		EnrollmentID = UUID.randomUUID();
	}
	public Enrollment(UUID StudentID, UUID SectionID)
	{
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	public void SetGrade(double grade)
	{
		Grade = grade;
	}
}
