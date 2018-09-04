package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.BankAccount;
import com.capgemini.day3.EmployeeDetails;

class EmployeeDetailsTest {
	EmployeeDetails account1;
	
	@BeforeEach
	void setUp() {
		account1 = new EmployeeDetails(1234, "John Doe", 25000, 5000);
	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(414800,account1.calculateNetSalary(300000,1000),0.02);
	}
	@AfterEach
	void tearDown() {
		account1 = null;
	}

}
