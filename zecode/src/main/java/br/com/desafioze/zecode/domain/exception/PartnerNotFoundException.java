package br.com.desafioze.zecode.domain.exception;

public class PartnerNotFoundException extends RuntimeException {
    public PartnerNotFoundException(String exception) {
        super(exception);
    }
}
