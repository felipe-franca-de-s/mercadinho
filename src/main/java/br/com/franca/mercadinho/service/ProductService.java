package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.dto.ProductDto;

import java.util.Set;

public interface ProductService {

    ProductDto create(ProductDto productDto);

    ProductDto update(Long id, ProductDto productDto);

    Set<ProductDto> findAll();

    ProductDto findById(Long id);
}
