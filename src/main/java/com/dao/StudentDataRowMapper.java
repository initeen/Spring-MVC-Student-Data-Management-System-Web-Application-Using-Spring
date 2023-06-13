package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.StudentData;

public class StudentDataRowMapper implements RowMapper<StudentData> {

	@Override
	public StudentData mapRow(ResultSet rs, int arg1) throws SQLException {
		
		StudentData stud = new StudentData();
		stud.setId(rs.getInt(1));
		stud.setName(rs.getString(2));
		stud.setMarks(rs.getDouble(3));
		return stud;
		
		
	}

}
