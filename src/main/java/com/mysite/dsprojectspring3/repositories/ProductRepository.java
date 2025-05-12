package com.mysite.dsprojectspring3.repositories;

import com.mysite.dsprojectspring3.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
