package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.dto.UsersDto;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UsersService {

    UsersDto create(UsersDto usersDto);

    UsersDto update(Long id, UsersDto usersDto);

    Set<UsersDto> findAll();

    UsersDto findById(Long id);
}
