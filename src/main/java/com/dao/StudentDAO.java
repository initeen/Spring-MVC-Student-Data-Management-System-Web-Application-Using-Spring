package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.StudentData;

public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveStudent(StudentData stud) {
        String sql="insert into studentdata values('"+stud.getId()+"','"+stud.getName()+"','"+stud.getMarks()+"')";
		
		return jdbcTemplate.update(sql);
	}
	
	public StudentData getStudentById(int id) {
		String sql="select * from studentdata where id="+id;
		
		StudentData student=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<StudentData>(StudentData.class));
		
		return student;
	}

	
	public int updateStudent(StudentData stud) {
	
		String sql="update studentdata set name='"+stud.getName()+"',marks='"+stud.getMarks()+"'where id="+stud.getId()+"";
		
		return jdbcTemplate.update(sql);
	}
	
	public int deleteStudent(StudentData stud) {
		
		System.out.println(stud);
		String sql="delete from studentdata where id="+stud.getId();
		
		return jdbcTemplate.update(sql);
		
	}
	
	public  List<StudentData> getAllStudentData(){
		return jdbcTemplate.query("Select * from studentdata",new StudentDataRowMapper());
	}
	



	
}
