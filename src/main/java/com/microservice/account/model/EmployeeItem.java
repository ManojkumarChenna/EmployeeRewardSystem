package com.microservice.account.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@ManyToOne
	private Employee employee;
	
	@ManyToOne
	private Item item;
	
	private LocalDate dateofPurchase;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public LocalDate getDateofPurchase() {
		return dateofPurchase;
	}

	public void setDateofPurchase(LocalDate dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	@Override
	public String toString() {
		return "EmployeeItem [id=" + id + ", employee=" + employee + ", item=" + item + ", dateofPurchase="
				+ dateofPurchase + "]";
	}

	

}
