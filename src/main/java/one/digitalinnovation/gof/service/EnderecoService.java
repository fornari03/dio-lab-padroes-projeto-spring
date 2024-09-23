package one.digitalinnovation.gof.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private ViaCepService viaCepService;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Iterable<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public Endereco buscarPorCep(String cep) {
        return viaCepService.consultarCep(cep);
    }
}
