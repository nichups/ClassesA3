/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;

/**
 * Importação de bibliotecas chaves
 */
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Colaboradores men = new Colaboradores();
        String nome1 = JOptionPane.showInputDialog("Nome do colaborador");
        String email1 = JOptionPane.showInputDialog("Email do colaborador");
        String fone1 = JOptionPane.showInputDialog("Telefone do colaborador");
        String cpf1 = JOptionPane.showInputDialog("CPF do colaborador");
        String funcao1 = JOptionPane.showInputDialog("Função do colaborador");
        String endereco1 = JOptionPane.showInputDialog("Endereço do colaborador");
        String salario1 = JOptionPane.showInputDialog("Salário do colaborador");
        String numHoras1 = JOptionPane.showInputDialog("Número de Horas do colaborador");

        men.setColaborador(nome1, email1, fone1, cpf1, funcao1, endereco1, salario1, numHoras1);
        men.mostrarColaborador();

    }
}
