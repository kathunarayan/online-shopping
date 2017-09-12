package com.niit.onlineshoppingbackend.dao;

import java.util.List;

import com.niit.onlineshoppingbackend.dto.Category;

public interface CategoryDao {
List<Category> list();
Category get(int id);
}
