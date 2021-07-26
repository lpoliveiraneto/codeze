package br.com.desafioze.zecode.api.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Problem {

    private LocalDateTime data;
    private String message;
    private String exception;
}
