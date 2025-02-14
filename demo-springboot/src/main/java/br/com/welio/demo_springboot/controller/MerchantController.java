package br.com.welio.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.Merchant;
import br.com.welio.demo_springboot.service.MerchantService;

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
