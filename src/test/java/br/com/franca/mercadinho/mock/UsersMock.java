package br.com.franca.mercadinho.mock;

import br.com.franca.mercadinho.domain.Users;

import java.time.LocalDate;

public class UsersMock {

    public static Users createMock() {
        return Users.builder()
                .name("User")
                .cpf("29645157862")
                .dateBirth(LocalDate.parse("2000-10-10"))
                .email("test@test.com")
                .address("Alvaro Street, 123")
                .build();
    }
}
