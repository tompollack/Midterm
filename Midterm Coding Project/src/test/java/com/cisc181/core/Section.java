package com.cisc181.core;

import java.util.UUID;

public class Section 
{
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	UUID RoomID;
	public Section()
	{
		CourseID = UUID.randomUUID();
		SemesterID=UUID.randomUUID();
		SectionID=UUID.randomUUID();
		RoomID=UUID.randomUUID();
	}
}
