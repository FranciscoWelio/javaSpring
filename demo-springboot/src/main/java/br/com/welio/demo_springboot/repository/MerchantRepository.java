package br.com.welio.demo_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.welio.demo_springboot.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long>{

}