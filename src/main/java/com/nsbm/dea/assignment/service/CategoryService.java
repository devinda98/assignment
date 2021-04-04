package com.nsbm.dea.assignment.service;


import com.nsbm.dea.assignment.model.Category;
import javassist.NotFoundException;

import java.util.List;


public interface CategoryService {

	public List<Category> findAllCategories();

	public Category findCategoryById(Long id) throws NotFoundException;

	public void createCategory(Category category);

	public void updateCategory(Category category);

	public void deleteCategory(Long id) throws NotFoundException;

}
