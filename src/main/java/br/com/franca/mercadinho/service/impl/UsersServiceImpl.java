package br.com.franca.mercadinho.service.impl;

import br.com.franca.mercadinho.domain.Users;
import br.com.franca.mercadinho.dto.UsersDto;
import br.com.franca.mercadinho.repository.UsersRepository;
import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    @Override
    public Set<UsersDto> findAll() {
        List<Users> usersListRaw = usersRepository.findAll();
        return new LinkedHashSet<>(usersListRaw.stream().map(UsersDto::convertDto).toList());
    }

    @Override
    public UsersDto findById(Integer id) {
        return UsersDto.convertDto(this.findEntityById(id));
    }

    @Override
    public UsersDto create(UsersDto usersDto) {
        Users users = UsersDto.convertEntity(usersDto);
        usersRepository.save(users);
        return usersDto;
    }

    @Override
    public UsersDto updateById(Integer id, UsersDto usersDto) {
        Users users = findEntityById(id);
        usersDto.setId(users.getId());
        return usersDto;
    }

    private Users findEntityById(Integer id) {
        this.existsById(id);
        return usersRepository.findById(id).orElseThrow();
    }

    private void existsById(Integer id) {
        if (!usersRepository.existsById(id)) {
            throw new RuntimeException(String.format(
                    "Not found [%s] by id '%d'.", this.getClass().getSimpleName(), id));
        }
    }
}
