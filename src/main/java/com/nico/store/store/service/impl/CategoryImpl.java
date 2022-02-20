package com.nico.store.store.service.impl;

import com.nico.store.store.domain.Category;
import com.nico.store.store.repository.ArticleRepository;
import com.nico.store.store.repository.CategoryRepository;
import com.nico.store.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }
}
