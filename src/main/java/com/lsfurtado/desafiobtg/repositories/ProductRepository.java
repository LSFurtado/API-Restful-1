package com.lsfurtado.desafiobtg.repositories;
//test
import org.springframework.data.jpa.repository.JpaRepository;

import com.lsfurtado.desafiobtg.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
