/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexander
 */
public class InsurancePolicyEstimatorTest {
    
    public InsurancePolicyEstimatorTest() {
    }

    @Test
    public void testValidateAge() {
        System.out.println("validateAge");
        int age = 10;
        InsurancePolicyEstimator instance = new InsurancePolicyEstimator();
        boolean expResult = true;
        boolean result = instance.validateAge(age);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculateInsurancePolicy() {
        System.out.println("calculateInsurancePolicy");
        int age = 10;
        InsurancePolicyEstimator instance = new InsurancePolicyEstimator();
        instance.calculateInsurancePolicy(age);
        fail("The test case is a prototype.");
    }

    
}
