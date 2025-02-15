package br.com.welio.demo_springboot.exception;

public class TransactionException extends RuntimeException{
    public TransactionException(String text){
        super(text);
    }
}
