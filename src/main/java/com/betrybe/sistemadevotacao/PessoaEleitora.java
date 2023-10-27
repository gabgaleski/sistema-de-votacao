package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa{
  private String cpf;

  public PessoaEleitora(String name, String cpf) {
    super();
    super.setNome(name);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
