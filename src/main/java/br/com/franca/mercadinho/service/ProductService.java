package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;


}