package br.com.franca.mercadinho.controller;

import br.com.franca.mercadinho.dto.UsersDto;
import br.com.franca.mercadinho.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
@Slf4j
public class UsersController {

    private UsersService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok(service.findAll());
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(service.findById(id));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<UsersDto> save(@RequestBody UsersDto usersDto) {
        try {
            return ResponseEntity.status(201).body(service.create(usersDto));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
//            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.badRequest().body(new UsersDto());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById (@PathVariable Integer id, @RequestBody UsersDto usersDto) {
        try {
            return ResponseEntity.status(201).body(service.updateById(id, usersDto));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
