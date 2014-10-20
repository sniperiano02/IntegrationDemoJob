package edu.esprit.integration.demo.test;

import static org.junit.Assert.*;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.esprit.integration.demo.services.CalculatorService;

public class CalculatorTest {

	 static CalculatorService calcService;
	@BeforeClass
	public static void setUp() throws Exception{
		
		calcService = new CalculatorService();
		
				
	}
	
	
	
	@Test
	public void testAddition() {
	
		float expected = 7;
	    float actual = calcService.Addition(3, 4);
	    assertEquals( expected, actual,0.00001);
	}
	@Test
	public void testSous() {
	
		float expected = 1;
	    float actual = calcService.Soustraire(4, 3);
	    assertEquals( expected, actual,0.00001);
	}
	@Test
	public void testMultip() {
	
		float expected = 12;
	    float actual = calcService.Multiplication(4, 3);
	    assertEquals( expected, actual,0.00001);
	}
	@Test
	public void testDiv() {
	
		float expected = 4;
	    float actual = calcService.Division(12, 3);
	    assertEquals( expected, actual,0.00001);
	}

}
