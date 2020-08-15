package model.dao;

import java.sql.Connection;

import db.DB;
import db.DbException;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDAO () {
	
		return new SellerDaoJDBC(DB.getConnection());
	}

}
