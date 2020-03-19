package pessoas;

public class PessoaFisica extends Pessoa {
	private Double healthExpenses;

	public PessoaFisica(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	public Double totalFee() {
		Double tax=0.0;
		if (this.annualIncome < 20000.00) {
			tax = (this.annualIncome * 0.15) - (this.healthExpenses * 0.5);
		}
		else {
			tax = (this.annualIncome * 0.25) - (this.healthExpenses * 0.5);
		}
		return tax;
	}
	
}
