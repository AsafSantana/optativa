package br.com.albus.comum.pessoa.fisica;

import br.com.albus.generic.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/albus/pessoaFisica")
public class PessoaFisicaService extends GenericService<PessoaFisicaController, PessoaFisica, PessoaFisicaRepository, Long> {

}
