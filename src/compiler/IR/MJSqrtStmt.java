package compiler.IR;

public class MJSqrtStmt extends MJExpression {

	private MJExpression argument;

	public MJSqrtStmt(MJExpression argument) {
		this.argument = argument;
	}

	public MJExpression getArgument() {
		return argument;
	}

	public void setArgument(MJExpression _argument) {
		this.argument = _argument;
		
	}

}
