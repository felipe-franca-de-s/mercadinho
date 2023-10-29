package br.com.franca.mercadinho.service;

import br.com.franca.mercadinho.dto.UsersDto;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UsersService {

    Set<UsersDto> findAll();

    UsersDto findById(Integer id);

    UsersDto create(UsersDto usersDto);

    UsersDto updateById(Integer id, UsersDto usersDto);
}
