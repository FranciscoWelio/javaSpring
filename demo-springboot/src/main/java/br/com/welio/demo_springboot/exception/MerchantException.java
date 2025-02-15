package br.com.welio.demo_springboot.exception;

public class MerchantException extends RuntimeException{
    public MerchantException(String text){
        super(text);
    }
}
