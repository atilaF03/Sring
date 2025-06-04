package br.com.example.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.modelo.Veiculo;
import br.com.example.api.repositorio.Repositorio;

@RestController
public class controle {

    @Autowired
    private Repositorio acao;

    @GetMapping("/boasvindas")
    public String mensagem() {
        return "seja bem vindo a loja ";
    }

    @PostMapping("/Veiculo")
    public Veiculo veiculo(@RequestBody Veiculo v) {
        return v;

    }

    @PostMapping("/api")
    public Veiculo cadastrar(@RequestBody Veiculo obj) {
        return acao.save(obj);
    }

    @GetMapping("/api")
    public List<Veiculo> selecionar() {
        return acao.findAll();
    }

    @GetMapping("/api/{codigo}")
    public Veiculo selecionarPeloCodigo(@PathVariable int codigo) {
        return acao.findByCodigo(codigo);
    }

    @PutMapping("/api")
    public Veiculo editar(@RequestBody Veiculo obj) {
        return acao.save(obj);
    }

    @DeleteMapping("/api/{codigo}")
    public void remover(@PathVariable int codigo) {
        Veiculo obj = selecionarPeloCodigo(codigo);
        acao.delete(obj);
    }

}
