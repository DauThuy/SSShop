package com.nico.store.store.service;

import com.nico.store.store.domain.Article;
import com.nico.store.store.domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllCategories();
}
