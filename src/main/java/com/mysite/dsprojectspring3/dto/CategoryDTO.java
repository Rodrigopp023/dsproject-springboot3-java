package com.mysite.dsprojectspring3.dto;

import com.mysite.dsprojectspring3.entites.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private Long id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
