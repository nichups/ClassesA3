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

        men.setColaborador(nome1, email1, );
        men.mostrarColaborador();

    }
}
