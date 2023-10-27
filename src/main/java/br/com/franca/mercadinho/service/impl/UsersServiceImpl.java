package br.com.franca.mercadinho.service.impl;

import br.com.franca.mercadinho.repository.UsersRepository;
import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;


}
