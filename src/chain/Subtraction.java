package chain;

public class Subtraction extends Solve {
 private Solution solution;
 
 public Subtraction(String calcName) {
  super(calcName);
 }

 protected boolean check(Problem problem) {
  if(problem.operation.equals("sub")) {
   return true;
  }else {
   return false;
  }
 }
 
 protected Solution resolve(Problem problem) {
  solution = new Solution();
  
  this.solution.sign = '-';
  this.solution.result = problem.operandOne - problem.operandTwo;
  
  return solution;
 }
}
