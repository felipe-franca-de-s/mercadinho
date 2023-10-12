package br.com.franca.mercadinho.dto;

import br.com.franca.mercadinho.domain.Product;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {

    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private Double price;

    public static Product convertEntity(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .build();
    }
}
