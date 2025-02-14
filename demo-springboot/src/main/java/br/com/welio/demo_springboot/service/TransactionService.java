package br.com.welio.demo_springboot.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.entity.Transaction;
import br.com.welio.demo_springboot.repository.TransactionRepository;

@Service
public class TransactionService{
	TransactionRepository transactionRepository;

	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	public Optional<Transaction> getTransaction(Long id){
		return transactionRepository.findById(id);
	}
}
