package br.com.welio.demo_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.welio.demo_springboot.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}