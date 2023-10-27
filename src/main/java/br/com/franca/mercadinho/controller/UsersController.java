package br.com.franca.mercadinho.controller;

import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private UsersService usersService;
}
