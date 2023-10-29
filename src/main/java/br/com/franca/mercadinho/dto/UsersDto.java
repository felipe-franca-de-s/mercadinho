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
public class UsersDto {

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

    public static Users convertEntity(UsersDto usersDto) {
        return Users.builder()
                .id(usersDto.getId())
                .name(usersDto.getName())
                .dateBirth(usersDto.getDateBirth())
                .email(usersDto.getEmail())
                .cpf(usersDto.getCpf())
                .address(usersDto.getAddress())
                .password(usersDto.getPassword())
                .role(Role.convertRoleStringToRole(usersDto.getRole()))
                .products(usersDto.getProducts())
                .build();
    }
}
