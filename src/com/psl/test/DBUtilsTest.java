package com.psl.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.Test;

import com.psl.jdbc.DBUtils;
import com.psl.jdbc.dataAccess;

public class DBUtilsTest {

	@Test
	public void testGetPreparedStatement() throws ClassNotFoundException, SQLException {
		
		DBUtils db = new DBUtils();
		db.getPreparedStatement("select m.movieCode,m.movieName,m.showDate,m.lang from Movie m","root1");
		System.out.println("implemented");
	}
	

	@Test
	public void testGetPreparedStatement1() throws ClassNotFoundException, SQLException {
		
		DBUtils db = new DBUtils();
		db.getPreparedStatement("select m.movieCode,m.movieName,m.showDate,m.lang from Movie m","root");
		System.out.println("not implemented");
	}
	

}
