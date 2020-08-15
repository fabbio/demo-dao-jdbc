package model.dao;

import java.util.List;

import model.entites.Department;

public interface departmentDao {
	
	void insert(Department dp);
	void update(Department dp);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();

}
