package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(s1==s2);
		
		
		

	}

}
