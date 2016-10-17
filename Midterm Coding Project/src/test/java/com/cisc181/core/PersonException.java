package com.cisc181.core;

public class PersonException extends Exception
{
	private Person person;
	
	public PersonException(Person p)
	{
		this.person = p;
	}
	
	public Person getPerson()
	{
		return person;
	}
}
