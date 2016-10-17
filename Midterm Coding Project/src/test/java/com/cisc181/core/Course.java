package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course 
{
	UUID CourseID;
	Date StartDate;
	Date EndDate;
	eMajor Major;
	public Course()
	{
		CourseID = UUID.randomUUID();
	}
}
