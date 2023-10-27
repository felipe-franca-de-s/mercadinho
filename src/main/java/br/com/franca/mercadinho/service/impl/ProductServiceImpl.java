package br.com.franca.mercadinho.service.impl;

import br.com.franca.mercadinho.repository.ProductRepository;
import br.com.franca.mercadinho.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;


}
