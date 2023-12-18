package com.lsfurtado.desafiobtg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsfurtado.desafiobtg.entities.Usuario;
import com.lsfurtado.desafiobtg.services.UserService;

@RestController
@RequestMapping("/desafio/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<Usuario>> listAll() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());

	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Usuario>> findById(@Validated @PathVariable Integer id) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));

	}
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestBody Usuario savedUsuario) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(userService.save(savedUsuario));
	}
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteId(@Validated @PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.delete(id));
	}
}
