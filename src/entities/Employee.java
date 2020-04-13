package entities;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void incleaseSalary(double percentage) {
		this.grossSalary = this.grossSalary * (1.00 + (percentage / 100));
	}

	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary()) + ".";
	}
	
}
