package com.tecsup.lab09.app;

import com.tecsup.lab09.crud.bean.Employee;
import com.tecsup.lab09.dao.EmployeeDAO;
import com.tecsup.lab09.dao.EmployeeDAOImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int id = -1;
		
		id = dao.create("Ricardo", "Berrospi", (double) 1500);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);
		
	}

}
