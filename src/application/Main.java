package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDAO();
		
		System.out.println("\n============= TEST 01 ==== FINDBYID ===================");
		Seller seller = sellerdao.findById(7);
		System.out.println(seller);
		
		System.out.println("\n============= TEST 02 ==== SELLER FINDBYDEPARTMENT ===================");
		Department dep = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(dep);
		
		for(Seller sl : list) {
			System.out.println(sl);
		}
	}

}
