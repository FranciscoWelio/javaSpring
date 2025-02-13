package br.com.welio.demo_springboot.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.Merchant;

@RestController
@RequestMapping("/merchant")
class MerchantController{
	MerchantService merchantService;

	public MerchantController(MerchantService merchantService) {
		this.merchantService = merchantService;
	}

	@GetMapping("/{id}")
	public Merchant getDemo(@PathVariable("id") Long id) {
		return merchantService.getMerchant(id).orElse(null);
	}
	
}

@Service
class MerchantService{
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