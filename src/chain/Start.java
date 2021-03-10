package chain;

import java.util.Scanner;

public class Start {
 private int count = 1;
 private Problem problem;
 
 public void start() {
  Solve addition = new Addition("Addition");
  Solve subtraction = new Subtraction("Subtraction");
  Solve multiplication = new Multiplication("Multiplication");
  Solve division = new Division("Division");
  
  addition.setNext(subtraction).setNext(multiplication).setNext(division);
  
  System.out.println("Calculation: " + count);
  
  addition.solve(inputProblem());
  
  System.out.println("================================");
  
  count++;
 }
 
 private Problem inputProblem() {
  @SuppressWarnings("resource")
  Scanner scan = new Scanner(System.in);
  
  problem = new Problem();
  
  System.out.print("Enter Operation Name: ");
  problem.operation = scan.next();
  
  if(problem.operation.equals("term")) {
   System.out.println("Thank you for using this Program.");
   System.out.println("System Terminated.");
   System.exit(0); 
  }
  
  System.out.print("Enter the First Operand: ");
  problem.operandOne = scan.nextInt();
  
  System.out.print("Enter the Second Operand: ");
  problem.operandTwo = scan.nextInt();
  
  return problem;
 }
}
