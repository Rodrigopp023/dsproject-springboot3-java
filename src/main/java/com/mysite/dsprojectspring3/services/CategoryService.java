package com.mysite.dsprojectspring3.services;

import com.mysite.dsprojectspring3.dto.CategoryDTO;
import com.mysite.dsprojectspring3.entites.Category;
import com.mysite.dsprojectspring3.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(x ->
                new CategoryDTO(x)).collect(Collectors.toList());
    }
}
