package one.digitalinnovation.gof.handler;

public class IdDeveSerNuloException extends IllegalArgumentException {
    public IdDeveSerNuloException() {
        super("O ID do cliente deve ser nulo para criar um novo registro.");
    }
}
