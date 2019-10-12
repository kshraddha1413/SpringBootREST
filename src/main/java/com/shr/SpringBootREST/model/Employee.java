package com.shr.SpringBootREST.model;

public class Employee {

	String name;
	double salray;

	public Employee() {

	}

	public Employee(String name, double salray) {
		super();
		this.name = name;
		this.salray = salray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalray() {
		return salray;
	}

	public void setSalray(double salray) {
		this.salray = salray;
	}

}
