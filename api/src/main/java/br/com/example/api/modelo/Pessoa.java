package br.com.example.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
private String nome;
private int idade;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int codigo;

public Pessoa(String nome, int idade, int codigo) {
    this.nome = nome;
    this.idade = idade;
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}



}