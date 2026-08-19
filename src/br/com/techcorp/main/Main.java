package br.com.techcorp.main;

import br.com.techcorp.model.*;

public class Main {
    public static void main(String[] args) {
        ControleDeAcesso sistema = new ControleDeAcesso();

        Funcionario f1 = new Funcionario("T-001", "Alice", "a");
        Funcionario f2 = new Funcionario("T-001", "Alice Duplicada", "a");

        sistema.registrarPassagem(f1);
        sistema.registrarPassagem(f2);

        sistema.concederAcessoSala(f1);
        sistema.concederAcessoSala(f2);
    }
}