package br.com.desafioze.zecode.api.handler;

import br.com.desafioze.zecode.domain.exception.PartnerNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PartnerNotFoundException.class)
    public ResponseEntity<Object> handlerPartnerNotFoundException(PartnerNotFoundException exception, WebRequest request){
        Problem problem = new Problem(LocalDateTime.now(), exception.getMessage(), exception.toString());
        HttpStatus status = HttpStatus.NOT_FOUND;

        return handleExceptionInternal(exception, problem, new HttpHeaders(), status, request);
    }
}
