package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.domain.Users;
import br.com.franca.mercadinho.mock.UsersMock;
import br.com.franca.mercadinho.repository.UsersRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@ActiveProfiles("test")
class UsersServiceTest {

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    void setUp() {
        usersRepository.deleteAll();
    }

    @Test
    void create() {
        Users users = usersRepository.save(UsersMock.createMock());

        Assertions.assertNotNull(users);
        Assertions.assertEquals("User", users.getName());
        Assertions.assertEquals("29645157862", users.getCpf());
    }

    @Test
    void findAll() {
        usersRepository.save(UsersMock.createMock());
        List<Users> usersSet = usersRepository.findAll();
        Assertions.assertEquals(1, usersSet.size());
    }

    @Test
    void findByIdNotFound() {
        Optional<Users> users = usersRepository.findById(1);
        Assertions.assertEquals(Optional.empty(), users);
    }

    @Test
    void updateById() {
        usersRepository.save(UsersMock.createMock());
        Users usersUpdated = UsersMock.createMock();
        usersUpdated.setId(1);
        usersUpdated.setName("User2");
        usersRepository.save(usersUpdated);

        Assertions.assertEquals("User2", usersUpdated.getName());
    }
}