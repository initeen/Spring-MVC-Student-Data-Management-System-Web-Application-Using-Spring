package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.StudentData;
import com.dao.StudentDAO;

@Controller
public class StudentDataController {

	
	@Autowired
	private StudentDAO dao;
	
	@RequestMapping("/open")
	public String openForm(Model model) {
		StudentData stud = new StudentData();
		model.addAttribute("stud", stud);
		return "registration";
	}
	
	@RequestMapping("/save")
	public String registrationStudent(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("marks")double marks) {
		StudentData stud = new StudentData();
		System.out.println();
		stud.setId(id);
		stud.setName(name);
		stud.setMarks(marks);
		dao.saveStudent(stud);
		
		return "redirect:/read1";
	}
	@RequestMapping("/read1")
	public String readData(Model model) {
		List<StudentData> list = dao.getAllStudentData();
		model.addAttribute("list", list);
		return "read";
	}
	
	@RequestMapping("/update")
	public String updateStudent(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("marks")double marks) {
		
		StudentData stud = new StudentData();
		stud.setId(id);
		stud.setName(name);
		stud.setMarks(marks);
		dao.updateStudent(stud);
		return "redirect:/read1";
	}
	
	@RequestMapping("/updatform")
	public String updateForm(@RequestParam("id")int id,Model model) {
		
		StudentData stud = dao.getStudentById(id);
		model.addAttribute("stud", stud);
		return "updateform2";
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(StudentData stud,@RequestParam("id") int id) {
		
		StudentData stud1  = dao.getStudentById(id);
		System.out.println(stud1);
		dao.deleteStudent(stud1);
		return "redirect:/read1";
	}
	
	
}
