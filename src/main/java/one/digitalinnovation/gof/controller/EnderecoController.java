package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.EnderecoService;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public Iterable<Endereco> buscarTodos() {
        return enderecoService.buscarTodos();
    }

    @GetMapping("/{cep}")
    public Endereco buscarPorId(String cep) {
        return enderecoService.buscarPorCep(cep);
    }
}
