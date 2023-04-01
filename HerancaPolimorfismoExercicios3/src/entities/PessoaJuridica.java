package entities;

public class PessoaJuridica extends Person{
	
	private int employeeQtd;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String name, Double anualIncome, int employeeQtd) {
		super(name, anualIncome);
		this.employeeQtd = employeeQtd;
	}

	public int getEmployeeQtd() {
		return employeeQtd;
	}

	public void setEmployeeQtd(int employeeQtd) {
		this.employeeQtd = employeeQtd;
	}

	@Override
	public double tax() {
		if( employeeQtd > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}
	
	

}
