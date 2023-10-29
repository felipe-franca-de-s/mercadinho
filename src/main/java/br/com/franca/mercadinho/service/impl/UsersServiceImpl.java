package br.com.franca.mercadinho.service.impl;

import br.com.franca.mercadinho.domain.Users;
import br.com.franca.mercadinho.dto.UsersDto;
import br.com.franca.mercadinho.repository.UsersRepository;
import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    @Override
    public UsersDto create(UsersDto usersDto) {
        Users users = UsersDto.convertEntity(usersDto);
        usersRepository.save(users);
        return usersDto;
    }

    @Override
    public UsersDto update(Long id, UsersDto usersDto) {
        return null;
    }

    @Override
    public Set<UsersDto> findAll() {
        return null;
    }

    @Override
    public UsersDto findById(Long id) {
        return null;
    }
}
