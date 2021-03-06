/******************************************************************************
 *  Purpose: Interface of crud using prepared statement utility.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.preparedstatement.crud.service;

import java.sql.SQLException;

import com.bridgelabz.preparedstatement.crud.model.Student;

public interface ICrudPreparedStmtUtil {
	public int createTable() throws SQLException;

	public void showRecords() throws SQLException;

	public int insertValues(Student student) throws SQLException;

	public int updateValues(int id, Student student) throws SQLException;

	public int deleteValue(int id) throws SQLException;
	
	public void closeCon() throws SQLException;
}
