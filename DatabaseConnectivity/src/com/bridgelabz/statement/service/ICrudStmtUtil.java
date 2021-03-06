/******************************************************************************
 *  Purpose: Interface of crud statement utility.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.statement.service;

import java.sql.SQLException;

import com.bridgelabz.statement.model.Student;

public interface ICrudStmtUtil {
	public int createTable() throws SQLException;

	public void showRecords() throws SQLException;

	public int insertValues(Student student) throws SQLException;

	int updateValues(int id,Student student) throws SQLException;
	
	int deleteValue(int id) throws SQLException;


}
