package com.novarota.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	  @ExceptionHandler(RecursoNaoEncontradoException.class)
	    public ResponseEntity<String> tratarRecursoNaoEncontrado(RecursoNaoEncontradoException ex) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> tratarErroGeral(Exception ex) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Erro interno do servidor");
	    }

}
