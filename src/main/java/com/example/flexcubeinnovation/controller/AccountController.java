package com.example.flexcubeinnovation.controller;

import com.example.flexcubeinnovation.dto.AccountDto;
import com.example.flexcubeinnovation.service.AccountService;

import ch.qos.logback.core.model.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin("*")
public class AccountController {

	@Autowired
	private AccountService service;

	
	@GetMapping("/welcome")
	public String getHome(Model model) {
		return "redirect : index.html";
	}
	@PostMapping
	public ResponseEntity<AccountDto> create(@RequestBody AccountDto dto) {
		return new ResponseEntity<>(service.createAccount(dto), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> get(@PathVariable int id) {
		return ResponseEntity.ok(service.getAccountById(id));
	}

	@GetMapping
	public ResponseEntity<List<AccountDto>> getAll() {
		return ResponseEntity.ok(service.getAllAccounts());
	}

	@PutMapping("/{id}")
	public ResponseEntity<AccountDto> update(@PathVariable int id, @RequestBody AccountDto dto) {
		return ResponseEntity.ok(service.updateAccount(id, dto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		service.deleteAccount(id);
		return ResponseEntity.ok("Account deleted successfully");
	}
}
