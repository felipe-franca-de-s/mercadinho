package br.com.franca.mercadinho.service.impl;

import br.com.franca.mercadinho.dto.ProductDto;
import br.com.franca.mercadinho.repository.ProductRepository;
import br.com.franca.mercadinho.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Set<ProductDto> findAll() {
        return null;
    }

    @Override
    public ProductDto findById(Integer id) {
        return null;
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductDto updateById(Integer id, ProductDto productDto) {
        return null;
    }

}
