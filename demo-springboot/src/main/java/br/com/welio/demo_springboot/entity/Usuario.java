package br.com.welio.demo_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    Long id;
    String nome;
    String conta;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
}
