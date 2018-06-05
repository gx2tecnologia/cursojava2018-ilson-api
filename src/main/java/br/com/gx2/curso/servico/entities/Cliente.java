package br.com.gx2.curso.servico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente{

    public Cliente(String nome, Integer cpf, String rg, String telefone, String endereco, String profissao){
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.profissao = profissao;
        this.rg = rg;
        this.telefone = telefone;
        this.votos = 0;
    }

    public Cliente() {
        votos= 0;
    }

    @Id
    @GeneratedValue
    public Integer id;
    public String nome;
    public Integer cpf;
    public String rg;
    public String telefone;
    public String endereco;
    public String profissao;
    public Integer votos;

}