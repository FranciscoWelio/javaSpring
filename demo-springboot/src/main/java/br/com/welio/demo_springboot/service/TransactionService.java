package br.com.welio.demo_springboot.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.Transaction;

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

interface TransactionRepository extends JpaRepository<Transaction, Long>{

}