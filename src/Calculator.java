
public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	// constructor
	public Calculator() {
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operation = "+";
		this.results = 0;
	}
	// getters and setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	// perform the operation
	public double performOperation() {
		if(getOperation() == "+") {
			setResults(getOperandOne() + getOperandTwo());
		} else if(getOperation() == "-") {
			setResults(getOperandOne() - getOperandTwo());
		}
		return results;
	}
}
