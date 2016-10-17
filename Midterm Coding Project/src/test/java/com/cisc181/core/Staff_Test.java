package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	static ArrayList<Staff> allStaff= new ArrayList<Staff>();

	@BeforeClass
	public static void setup() 
	{
		try {
			allStaff.add(new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 3000, new Date(), eTitle.MR));
		} catch (PersonException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			allStaff.add(new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 100000, new Date(), eTitle.MR));
		} catch (PersonException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			allStaff.add(new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 350000, new Date(), eTitle.MR));
		} catch (PersonException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			allStaff.add(new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 30000, new Date(), eTitle.MR));
		} catch (PersonException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			allStaff.add(new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 150000, new Date(), eTitle.MR));
		} catch (PersonException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
		double total = 0;
		for(int i = 0; i < allStaff.size(); i++)
		{
			total += allStaff.get(i).getSalary();
		}
		assertEquals(total/5,126600.0,0);
		try {
			Staff Bill = new Staff("Bill", "Jameson", "Wolfe", new Date(), "8564 Main St", "123-4560-789", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 150000, new Date(), eTitle.MR);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			//expect failure trace
			e.printStackTrace();
		}
		try {
			Staff Bob = new Staff("Bob", "Jameson", "Wolfe", new Date(1066, 10, 14), "8564 Main St", "123-456-7890", "JWolfe@udel.edu", "5:00pm-7:00am", 6, 150000, new Date(), eTitle.MR);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			//expect failure trace
			e.printStackTrace();
		}
	}	

}
