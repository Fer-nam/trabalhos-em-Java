package entities;

public class PessoFisica extends Person {
	
	private Double healthTaxes;
	
	public PessoFisica() {
		super();
	}

	public PessoFisica(String name, Double anualIncome, Double healthTaxes) {
		super(name, anualIncome);
		this.healthTaxes = healthTaxes;
	}

	public Double getHealthTaxes() {
		return healthTaxes;
	}

	public void setHealthTaxes(Double healthTaxes) {
		this.healthTaxes = healthTaxes;
	}
	
	@Override
	public double tax() {
		if(getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthTaxes*0.5;
		} else {
			 return getAnualIncome() * 0.25 - healthTaxes*0.5;
			
		}
	}
}
