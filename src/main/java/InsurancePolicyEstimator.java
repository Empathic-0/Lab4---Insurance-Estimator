/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class InsurancePolicyEstimator {

  //this function takes the age as input and checks whether or not the age is a correct value, returns boolean
  public boolean validateAge(int age){
     if (age < 1 || age > 90) {
       System.out.println("That number is invalid.") ;
       System.out.print("Enter the " + "customer's age: ") ;
       return false;
     }
     return true;
  }
  //this function takes valid age as input (int) and prints out the insurance policy cost, returns nothing 
  public void calculateInsurancePolicy(int age){
        int result = ((5 * age) + 300 ) ;
        System.out.print("The insurance policy will cost: " + result);
  }
  public InsurancePolicyEstimator() {

  }
} 