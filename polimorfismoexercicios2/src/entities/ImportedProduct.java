package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+" $ "
				+ String.format("%.2f",getPrice())
				+"(Taxas da alfândega: R$"
				+ customFee+ ")";
	}
	
	public double totalPrice() {
		return customFee + getPrice();
	}
}
