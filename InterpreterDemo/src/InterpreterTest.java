
public class InterpreterTest {

	public static Expression getMarriedExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
	
	
	public static void main(String[] args) {
		Expression isMarried = getMarriedExpression();
		
		System.out.println("Is she married? " + isMarried.interpet("Married Julie"));

	}

}
