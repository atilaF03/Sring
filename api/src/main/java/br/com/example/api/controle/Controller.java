package br.com.example.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.modelo.Pessoa;
import br.com.example.api.repositorio.Repositorio;

@RestController
public class Controller {
  @Autowired
private Repositorio acao;

@PostMapping("/api")
public Pessoa cadastrar(@RequestBody Pessoa obj){
  return acao.save(obj); // retorna o obj;

}



  // define a rota raiz que retorna uma mensagem simples
  @GetMapping("/")
  public String mensagem() {
    return "Olá, mundo!";
  }

  @GetMapping("/boasvindas")
  public String mensagem2() {
    return "boas vindas ao mundo Java!";
  }

  @GetMapping("/boasvindas/{nome}")
  public String mensagem3(@PathVariable String nome) {
    return "boas vindas ao mundo Java!" + nome;
  }

@PostMapping("/pessoa")
public Pessoa pessoa (@RequestBody Pessoa p) {
  return p;
}

}
