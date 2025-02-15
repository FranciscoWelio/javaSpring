package br.com.welio.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.entity.Transaction;
import br.com.welio.demo_springboot.service.TransactionService;
@RestController
@RequestMapping("/transaction")
class TransactionController{
	TransactionService transactionService;

	@PostMapping("/create-user")
	
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		
		return transactionService.createTransaction(transaction);
	}

	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	@GetMapping("/{id}")
	public Transaction getDemo(@PathVariable("id") Long id) {
		return transactionService.getTransaction(id).orElse(null);
	}
	
}
