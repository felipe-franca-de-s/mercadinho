package br.com.franca.mercadinho.controller;

import br.com.franca.mercadinho.dto.UsersDto;
import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
public class UsersController {

    private UsersService usersService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok(usersService.findAll());
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(usersService.findById(id));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody UsersDto usersDto) {
        try {
            return ResponseEntity.status(201).body(usersService.create(usersDto));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById (@PathVariable Integer id, @RequestBody UsersDto usersDto) {
        try {
            return ResponseEntity.status(201).body(usersService.updateById(id, usersDto));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
