package com.qualde.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualde.dao.StudentDAO;



@Service
public class StudentService {
	
	 public StudentService() {
	System.out.println("-------Service() object created--");
	}

	@Autowired
	private StudentDAO studentDAO;
	
	public void show() {
		
		System.out.println("service->show()");
		studentDAO.calculateMarks();
		
				try {
					studentDAO.getMarks();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
}
