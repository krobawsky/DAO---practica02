package com.tecsup.lab09;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tecsup.lab09.crud.bean.Employee;
import com.tecsup.lab09.dao.EmployeeDAO;
import com.tecsup.lab09.dao.EmployeeDAOImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int id = -1;
		
		id = dao.create("Ricardo", "Berrospi", (double) 1500);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);
		
		model.addAttribute("serverTime", emp );
		
		return "home";
	}
	
}
