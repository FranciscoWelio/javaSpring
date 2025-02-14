package br.com.welio.demo_springboot.exception;

public class UsuariosException extends RuntimeException{
    
    public UsuariosException(String text){
        super(text);
    }
}
