package com.burakkolay.akbankhw2.dao;

import com.burakkolay.akbankhw2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
