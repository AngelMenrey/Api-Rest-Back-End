package com.apirest.crud.api_rest_crud.Repository;
import com.apirest.crud.api_rest_crud.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}