package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicSalaryCaculatorTest {

	private BasicSalaryCaculator basicSalaryCalculator;

	  @BeforeEach
	  void init() 
	  { basicSalaryCalculator = new BasicSalaryCaculator();
	  }
	 
@Test
void testBasicSalaryWithValidSalary()
 {
	double basicSalary = 4000;
	basicSalaryCalculator.setBasicSalary(basicSalary);
	
	double expectedSocialInsurance=basicSalary * 0.25;
	assertEquals(expectedSocialInsurance,basicSalaryCalculator.getSocialInsurance());
	
	double expectedAdditionalBonus=basicSalary * 0.1;
	assertEquals(expectedAdditionalBonus,basicSalaryCalculator.getAdditionalBonus());
	
	
	double expectedGross= basicSalary + expectedAdditionalBonus + expectedSocialInsurance ;
	assertEquals(expectedGross,basicSalaryCalculator.getGrossSalary());
  }
	
}
