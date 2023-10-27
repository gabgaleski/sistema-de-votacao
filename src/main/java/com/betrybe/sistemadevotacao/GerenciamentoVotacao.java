package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Gerenciamento.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private final ArrayList<String> cpfsComputados = new ArrayList<String>();

  /**
   * Gerenciamento.
   */

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }

  /**
   * Cadastro.
   */

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.size(); i++) {
      if (pessoasEleitoras.get(i).getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /**
   * Votar.
   */

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
        cpfsComputados.add(cpfPessoaEleitora);
        pessoasCandidatas.get(i).receberVoto();
      }
    }
  }

  /**
   * Resultado.
   */

  public void mostrarResultado() {
    int totalVotos = 0;
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      totalVotos += pessoasCandidatas.get(i).getVotos();
    }
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (int i = 0; i < pessoasCandidatas.size(); i++) {
        String name = pessoasCandidatas.get(i).getNome();
        int votos = pessoasCandidatas.get(i).getVotos();
        int result = Math.round((float) votos / totalVotos * 100);
        System.out.println("Nome: " + name + " - " + votos + " votos " + "( " + result + "% )");
      }
      System.out.println("Total de votos: " + totalVotos);
    }
  }

}
