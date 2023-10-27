package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    votos += 1;
  }

  public PessoaCandidata(String nome, int numero) {
    super();
    this.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }
}
