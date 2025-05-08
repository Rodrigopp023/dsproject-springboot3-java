package com.mysite.dsprojectspring3.services;

import com.mysite.dsprojectspring3.entites.Category;
import com.mysite.dsprojectspring3.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
}
