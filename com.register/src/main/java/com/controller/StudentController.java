package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.StudentPojo;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/registerStudent", method = RequestMethod.POST)
	public String save(StudentPojo ud) {
		
		System.out.println("im in save method of FirstController");
		System.out.println("the values are:-" + " "+ud.getFname()+""+ud.getLname()+""+ud.getMbile());
       return "reg";
}
}

