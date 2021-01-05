package com.tpRest.productREST.Repository;

import com.tpRest.productREST.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
