package br.com.franca.mercadinho.dto;

import br.com.franca.mercadinho.domain.Product;
import br.com.franca.mercadinho.domain.Users;
import br.com.franca.mercadinho.domain.enums.Role;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Integer id;

    @NotBlank
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateBirth;

    @Email
    @NotBlank
    private String email;

    @CPF
    @NotBlank
    private String cpf;

    private String address;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String role;

    private LocalDateTime creationDate;

    private Set<Product> products;

    public static Users convertEntity(UserDto userDto) {
        return Users.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .dateBirth(userDto.getDateBirth())
                .email(userDto.getEmail())
                .cpf(userDto.getCpf())
                .address(userDto.getAddress())
                .password(userDto.getPassword())
                .role(Role.convertRoleStringToRole(userDto.getRole()))
                .products(userDto.getProducts())
                .build();
    }
}
