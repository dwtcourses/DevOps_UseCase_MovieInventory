package test.java.com.psl.jdbc;

import static org.junit.Assert.*;



import main.java.com.psl.jdbc.dataAccess;

import org.junit.Test;



public class dataAccessTest {

	@Test
	public void testcheckDate() {
		dataAccess da=new dataAccess();
		assertEquals(true, da.checkDate("2016-04-07"));
	}
	
	@Test
	public void testcheckDate1() {
		dataAccess da=new dataAccess();
		assertEquals(false, da.checkDate("2016/04/07"));
	}
	
	/*@Test
	public void testcheckDate3() {
		dataAccess da=new dataAccess();
		assertEquals(false, da.checkDate("2016-04-07"));
	}*/
	
/*	@Test
	public void testcheckDate4() {
		dataAccess da=new dataAccess();
		assertEquals(true, da.checkDate("2016/04/07"));
	}*/
	/*
	@Test
	public void testcheckDuplicateCode() throws ClassNotFoundException {
		dataAccess da=new dataAccess();
		assertEquals(true, da.checkDuplicateCode("s2"));
	}*/
	
	/*@Test
	public void testcheckDuplicateCode1() throws ClassNotFoundException {
		dataAccess da=new dataAccess();
		assertEquals(true, da.checkDuplicateCode("s1"));
	}*/
	
	/*@Test
	public void testcheckDuplicateCode3() throws ClassNotFoundException {
		dataAccess da=new dataAccess();
		assertEquals(false, da.checkDuplicateCode("s2"));
	}*/
	
	/*@Test
	public void testcheckDuplicateCode4() throws ClassNotFoundException {
		dataAccess da=new dataAccess();
		assertEquals(false, da.checkDuplicateCode("s1"));
	}*/
}
