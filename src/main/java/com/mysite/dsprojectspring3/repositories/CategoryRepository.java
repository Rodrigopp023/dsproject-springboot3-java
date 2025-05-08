package com.mysite.dsprojectspring3.repositories;

import com.mysite.dsprojectspring3.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
