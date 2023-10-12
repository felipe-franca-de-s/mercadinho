package br.com.franca.mercadinho.repository;

import br.com.franca.mercadinho.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
