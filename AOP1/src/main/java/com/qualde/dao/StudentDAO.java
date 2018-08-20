package com.qualde.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	public StudentDAO() {
		System.out.println("..............StudentDao object created");
	}
	
	
	public void calculateMarks() {
		System.out.println("calling.... calculateMarks()...");
	}
	
	public int getMarks() throws Throwable {
		System.out.println("calling.... calculateMarks()...");
		throw new Exception();
		//return 50;
	}

}
