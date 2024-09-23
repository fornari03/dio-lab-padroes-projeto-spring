package one.digitalinnovation.gof.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IdDeveSerNuloException.class)
    public ResponseEntity<MensagemErro> handleIdDeveSerNulo(IdDeveSerNuloException ex, WebRequest request) {
        MensagemErro mensagemErro = new MensagemErro(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagemErro);
    }

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    public ResponseEntity<MensagemErro> handleClienteNaoEncontrado(ClienteNaoEncontradoException ex, WebRequest request) {
        MensagemErro mensagemErro = new MensagemErro(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagemErro);
    }
}

class MensagemErro {
    private int status;
    private String message;

    public MensagemErro(int status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters e setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

