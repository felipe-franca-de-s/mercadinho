package br.com.franca.mercadinho.repository;

import br.com.franca.mercadinho.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
