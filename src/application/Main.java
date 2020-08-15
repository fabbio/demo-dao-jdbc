package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Main {

	public static void main(String[] args) {
		
		Department dp = new Department(12,"Fonoaudiologia");
		
		System.out.println(dp);
		
		Seller seller = new Seller(1,"Jean","Jean@gmail.com",new Date(), 10000.0, dp);
		System.out.println(seller);

	}

}
