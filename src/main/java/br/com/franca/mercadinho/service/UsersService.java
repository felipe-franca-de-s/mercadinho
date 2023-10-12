package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {

    private UsersRepository usersRepository;


}
