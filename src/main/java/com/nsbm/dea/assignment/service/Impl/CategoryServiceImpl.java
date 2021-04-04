package com.nsbm.dea.assignment.service.Impl;


import com.nsbm.dea.assignment.model.Category;
import com.nsbm.dea.assignment.persitence.CategoryRepository;
import com.nsbm.dea.assignment.service.CategoryService;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {

		this.categoryRepository = categoryRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Category> findAllCategories() {

		return categoryRepository.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public Category findCategoryById(Long id) throws NotFoundException {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Category not found  with ID %d", id)));
	}

	@Override
	public void createCategory(Category category) {

		categoryRepository.save(category);
	}

	@Override
	public void updateCategory(Category category) {

		categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) throws NotFoundException {
		final Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Category not found  with ID %d", id)));

		categoryRepository.deleteById(category.getcNumber());
	}

}
