package edu.esprit.integration.demo.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;



public class CalculatorService {
	
	public CalculatorService(){
		
	}
	public float Addition(float x,float y){
		return x+y;
	}
	public float Soustraire(float x,float y){
		return x-y;
	}
	public float Multiplication(float x,float y){
		return x*y;
	}
	public float Division(float x,float y){
		return x/y;
	}

}
