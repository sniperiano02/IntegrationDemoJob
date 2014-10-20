package edu.esprit.integration.demo.managed.beans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;





import edu.esprit.integration.demo.services.CalculatorService;

@ManagedBean( name = "calculBean" )
@SessionScoped
public class CalculatorManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6206658800994370722L;

	
	private CalculatorService calculatorservice;
	
	private float x;
	private float y;
	private String somme;
	private String choix;
	
	
	
	


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}
	
	public void doCalcul(){
		calculatorservice = new CalculatorService();
		switch (choix) {
		case "+":
			somme=""+calculatorservice.Addition(x, y);
			break;
		case "*":
			somme=""+calculatorservice.Multiplication(x, y);
			break;
		case "-":
			somme=""+calculatorservice.Soustraire(x, y);
			break;
		case "/":
			somme=""+calculatorservice.Division(x, y);
			break;
		default:
			break;
		}
		
	
		
		
		
	}


	public String getSomme() {
		return somme;
	}


	public void setSomme(String somme) {
		this.somme = somme;
	}


	public String getChoix() {
		return choix;
	}


	public void setChoix(String choix) {
		this.choix = choix;
	}


	public CalculatorService getCalculatorservice() {
		return calculatorservice;
	}


	public void setCalculatorservice(CalculatorService calculatorservice) {
		this.calculatorservice = calculatorservice;
	}
	
}
