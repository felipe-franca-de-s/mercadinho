package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.dto.ProductDto;

import java.util.Set;

public interface ProductService {

    Set<ProductDto> findAll();

    ProductDto findById(Integer id);

    ProductDto create(ProductDto productDto);

    ProductDto updateById(Integer id, ProductDto productDto);
}
