package com.niit.onlineshoppingbackend.dao;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Supplier;

public interface SupplierDao {
	
	public List<Supplier> list();
	
	public Supplier get(int id);
	
	public void saveOrUpdate(Supplier category);
	
	public void delete(String id);
}
