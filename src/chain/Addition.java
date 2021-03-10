package chain;

public class Addition extends Solve{
 private Solution solution;
 
 public Addition(String calcName) {
  super(calcName);
 }
 
 protected boolean check(Problem problem) {
  if(problem.operation.equals("add")) {
   return true;
  }else {
   return false;
  }
 }
 
 protected Solution resolve(Problem problem) {
  solution = new Solution();
  
  this.solution.sign = '+';
  this.solution.result = problem.operandOne + problem.operandTwo;
  
  return solution;
 }
}
