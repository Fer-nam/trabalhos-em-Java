package model.servicos;



import java.time.Duration;

import model.entidades.AluguelCarro;
import model.entidades.Fatura;

public class RentalServices {
	
	private Double pricerPerHour;
	private Double pricePerDay;
	
	private BrazilTaxServices taxService;

	public RentalServices(Double pricerPerHour, Double pricePerDay, BrazilTaxServices taxService) {
		
		this.pricerPerHour = pricerPerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processinvoce(AluguelCarro aluguelCarro) {
		
		 double Minutes = Duration.between(AluguelCarro.getStart(), AluguelCarro.getFinish()).toMinutes();
		
		aluguelCarro.setFatura(new Fatura(50.0,10.0));
	}
	
	

}
