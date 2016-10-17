package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();	
	
	@BeforeClass
	public static void setup() 
	{
		courses.add(new Course());
		courses.add(new Course());
		courses.add(new Course());
		
		
		semesters.add(new Semester());
		semesters.get(0).StartDate = new Date(2017, 9, 10);
		semesters.get(0).EndDate = new Date(2017, 12, 24);
		
		semesters.add(new Semester());
		semesters.get(1).StartDate = new Date(2018, 2, 4);
		semesters.get(1).EndDate = new Date(2018, 6, 24);
		
		
		sections.add(new Section());
		sections.get(0).CourseID = courses.get(0).CourseID;
		sections.get(0).SemesterID = semesters.get(0).SemesterID;
		
		sections.add(new Section());
		sections.get(1).CourseID = courses.get(0).CourseID;
		sections.get(1).SemesterID = semesters.get(1).SemesterID;
		
		sections.add(new Section());
		sections.get(2).CourseID = courses.get(1).CourseID;
		sections.get(2).SemesterID = semesters.get(0).SemesterID;
		
		sections.add(new Section());
		sections.get(3).CourseID = courses.get(1).CourseID;
		sections.get(3).SemesterID = semesters.get(1).SemesterID;
		
		sections.add(new Section());
		sections.get(4).CourseID = courses.get(2).CourseID;
		sections.get(4).SemesterID = semesters.get(0).SemesterID;
		
		sections.add(new Section());
		sections.get(5).CourseID = courses.get(2).CourseID;
		sections.get(5).SemesterID = semesters.get(1).SemesterID;
		
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			students.add(new Student("Bill", "Samuel", "Meyers", new Date(1990, 5,12), eMajor.PHYSICS, "1234 acorn", "123-456-7890", "BMeyres.udel.edu"));
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() 
	{
		Enrollment t1 = new Enrollment(students.get(0).getStudentID(),sections.get(0).SectionID);
		t1.SetGrade(75);
		enrollments.add(t1);
		Enrollment t2 = new Enrollment(students.get(1).getStudentID(),sections.get(1).SectionID);
		t2.SetGrade(89);
		enrollments.add(t2);
		Enrollment t3 = new Enrollment(students.get(2).getStudentID(),sections.get(2).SectionID);
		t3.SetGrade(100);
		enrollments.add(t3);
		Enrollment t4 = new Enrollment(students.get(3).getStudentID(),sections.get(3).SectionID);
		t4.SetGrade(79);
		enrollments.add(t4);
		Enrollment t5 = new Enrollment(students.get(4).getStudentID(),sections.get(4).SectionID);
		t5.SetGrade(82);
		enrollments.add(t5);
		Enrollment t6 = new Enrollment(students.get(5).getStudentID(),sections.get(5).SectionID);
		t6.SetGrade(65);
		enrollments.add(t6);
		Enrollment t7 = new Enrollment(students.get(6).getStudentID(),sections.get(3).SectionID);
		t7.SetGrade(83);
		enrollments.add(t7);
		Enrollment t8 = new Enrollment(students.get(7).getStudentID(),sections.get(2).SectionID);
		t8.SetGrade(56);
		enrollments.add(t8);
		Enrollment t9 = new Enrollment(students.get(8).getStudentID(),sections.get(4).SectionID);
		t9.SetGrade(77);
		enrollments.add(t9);
		Enrollment t10 = new Enrollment(students.get(9).getStudentID(),sections.get(1).SectionID);
		t10.SetGrade(66);
		enrollments.add(t10);
		double gpa = 0;
		int place = 0;

		for(int i = 0; i < students.size(); i++)
		{
			for(int j = 0; j < enrollments.size(); j++)
			{
				if(enrollments.get(j).StudentID == students.get(i).getStudentID())
				{
					place++;
					gpa += enrollments.get(j).Grade;
				}
			}
			students.get(i).setGPA(gpa);
			System.out.println((gpa*4)/100 + ", " + students.get(i).getGPA());
			assertEquals(students.get(i).getGPA(),(gpa*4)/100,0);
			gpa = 0;
			place = 0;
		}
		
		//first course
		for (int j = 0; j < sections.size(); j++)
		{
			if(sections.get(j).CourseID == courses.get(0).CourseID)
			{
				for (int k = 0; k < enrollments.size(); k++)
				{
					if(enrollments.get(k).SectionID == sections.get(j).SectionID)
					{
						gpa += enrollments.get(k).Grade;
						place++;
					}
				}
			}
		}
		System.out.println(gpa/place);
		assertEquals(gpa/place, 76.6666,0.001);
		gpa = 0;
		place = 0;
		
		//second course
				for (int j = 0; j < sections.size(); j++)
				{
					if(sections.get(j).CourseID == courses.get(1).CourseID)
					{
						for (int k = 0; k < enrollments.size(); k++)
						{
							if(enrollments.get(k).SectionID == sections.get(j).SectionID)
							{
								gpa += enrollments.get(k).Grade;
								place++;
							}
						}
					}
				}
				System.out.println(gpa/place);
				assertEquals(gpa/place, 79.5 ,0.001);
				gpa = 0;
				place = 0;
				//third course
				for (int j = 0; j < sections.size(); j++)
				{
					if(sections.get(j).CourseID == courses.get(2).CourseID)
					{
						for (int k = 0; k < enrollments.size(); k++)
						{
							if(enrollments.get(k).SectionID == sections.get(j).SectionID)
							{
								gpa += enrollments.get(k).Grade;
								place++;
							}
						}
					}
				}
				System.out.println(gpa/place);
				assertEquals(gpa/place, 74.6666,0.001);
				gpa = 0;
				place = 0;
	}
}