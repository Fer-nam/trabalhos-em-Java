package application;

import model.entities.AbastractShape;
import model.entities.Circle;
import model.entities.Rectangule;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {


		AbastractShape s1 = new Circle(Color.BLACK, 2.0);
		AbastractShape s2 = new Rectangule(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Cor do circulo: "+ s1.getColor());
		System.out.println("Área do circulo: "+ String.format("%.3f", s1.area()));
		System.out.println("Cor do retangulo: "+ s2.getColor());
		System.out.println("Área do retangulo: "+ String.format("%.3f", s2.area()));
	}

}
