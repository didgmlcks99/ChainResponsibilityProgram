package chain;

public abstract class Solve {
 private String calcName;
 private Solve next;
 private Solution solution;
 
 public Solve(String calcName) {
  this.calcName = calcName;
 }
 
 public Solve setNext(Solve next) {
  this.next = next;
  return next;
 }
 
 public final void solve(Problem problem) {
  if(check(problem)) {
   System.out.println(calcName + " Server Working...");
   this.solution = resolve(problem);
   done(problem, solution);
  }else if(next != null) {
   System.out.println(calcName + " Server passing " + problem.operation + " operator to the next server.");
   next.solve(problem);
  }else {
   fail(problem);
  }
 }
 
 protected abstract boolean check(Problem problem);
 
 protected abstract Solution resolve(Problem problem);
 
 protected void done(Problem problem, Solution solution) {
  System.out.printf("%d %c %d = %d\n", problem.operandOne, solution.sign, problem.operandTwo, solution.result);
  System.out.println(calcName + " Provided");
 }
 
 protected void fail(Problem problem) {
  System.out.println("NO SUCH OPERATION!!!");
 }
}
