package com.mayank.batch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TestResultRowMapper implements RowMapper<TestResult> {

	public TestResult mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		TestResult result = new TestResult();
		result.setName(resultSet.getString("name"));
		result.setAddress(resultSet.getString("address"));
		return result;
	}

}
