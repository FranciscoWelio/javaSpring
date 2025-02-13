package br.com.welio.demo_springboot.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.Transaction;

@RestController
@RequestMapping("/transaction")
class TransactionController{
	TransactionService transactionService;

	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	@GetMapping("/{id}")
	public Transaction getDemo(@PathVariable("id") Long id) {
		return transactionService.getTransaction(id).orElse(null);
	}
	
}

@Service
class TransactionService{
	TransactionRepository transactionRepository;

	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	public Optional<Transaction> getTransaction(Long id){
		return transactionRepository.findById(id);
	}
}

interface TransactionRepository extends JpaRepository<Transaction, Long>{

}