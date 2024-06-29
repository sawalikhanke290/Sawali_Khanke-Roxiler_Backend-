package com.Roxiler.Roxiler_Task_1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Roxiler.Roxiler_Task_1.entity.Product;

@Repository
public interface ProRepo extends JpaRepository<Product, Integer>{
	
	List<Product> findTheProuctByPrice(double price);

    @Query(value = "SELECT product FROM Product product WHERE product.title LIKE %:search% OR product.description LIKE %:search%")
	List<Product> findTheProductByTitleOrDescription(String search);
}
