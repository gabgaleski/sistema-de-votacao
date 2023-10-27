package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal.
 */
public class Principal {

  /**
   * Principal.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    int opcao = scanner.nextInt();

    if (opcao == 1) {
      while (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scanner.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
        System.out.println("Cadastrar pessoa candidata?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("Entre com o número correspondente à opção desejada:");
        opcao = scanner.nextInt();
      }
    }

    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    int opcaoEleitor = scanner.nextInt();

    if (opcaoEleitor == 1) {
      while (opcaoEleitor == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.next();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
        System.out.println("Cadastrar pessoa eleitora?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("Entre com o número correspondente à opção desejada:");
        opcaoEleitor = scanner.nextInt();
      }
    }

    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("2 - Finalizar Votação");
    int select = scanner.nextInt();

    while (select != 3) {
      if (select == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scanner.nextInt();
        gerenciamentoVotacao.votar(cpf, numero);
      }
      if (select == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      select = scanner.nextInt();
    }

    gerenciamentoVotacao.mostrarResultado();
    scanner.close();
  }

}
