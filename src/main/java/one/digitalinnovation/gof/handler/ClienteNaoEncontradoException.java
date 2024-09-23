package one.digitalinnovation.gof.handler;

import java.util.NoSuchElementException;

public class ClienteNaoEncontradoException extends NoSuchElementException {
    public ClienteNaoEncontradoException() {
        super("Cliente com o ID pesquisado não encontrado");
    }
}
