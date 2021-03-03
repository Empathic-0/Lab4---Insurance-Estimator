/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;


class Main {


  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the " + "customer's age: ") ;
    InsurancePolicyEstimator insurancePolicyEstimator = new InsurancePolicyEstimator();
   while (!keyboard.hasNextInt()) {
    String input = keyboard.next();
    System.out.println("Value : " + input + " is not a valid number.");
   }
   int age = keyboard.nextInt() ;
   
   boolean isValid = false;
    //Validate the input.
    while (!isValid)  {
      isValid = insurancePolicyEstimator.validateAge(age);
      if (!isValid) {
        age = keyboard.nextInt();
      }
    }
    insurancePolicyEstimator.calculateInsurancePolicy(age);
    keyboard.close();
  }  
}
