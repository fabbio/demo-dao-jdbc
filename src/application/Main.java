package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDAO();
		
		Seller seller = sellerdao.findById(7);
		
		System.out.println(seller);
	}

}
