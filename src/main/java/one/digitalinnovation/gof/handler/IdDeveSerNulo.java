package one.digitalinnovation.gof.handler;

public class IdDeveSerNulo extends IllegalArgumentException {
    public IdDeveSerNulo() {
        super("O ID do cliente deve ser nulo para criar um novo registro.");
    }
}
