package interpreter;

import java.util.Map;


public class Minus implements Expression{
	Expression leftOperand;
	Expression rightOperand;
	
	public Minus(Expression left,Expression right){
		this.leftOperand = left;
		this.rightOperand = right;
	}
	
	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}
}
