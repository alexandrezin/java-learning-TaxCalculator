package pessoas;

public class PessoaJuridica extends Pessoa {
	private int numberOfEmployees;

	public PessoaJuridica(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Double totalFee() {
		Double tax=0.0;
		if (this.numberOfEmployees < 11) {
			tax = this.annualIncome * 0.16;
		}
		else {
			tax = this.annualIncome * 0.14;
		}
		return tax;
	}
}
