package br.com.welio.demo_springboot.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.Merchant;

@Service
public class MerchantService{
	MerchantRepository merchantRepository;

	public MerchantService(MerchantRepository merchantRepository) {
		this.merchantRepository = merchantRepository;
	}

	public Optional<Merchant> getMerchant(Long id){
		return merchantRepository.findById(id);
	}
}

interface MerchantRepository extends JpaRepository<Merchant, Long>{

}