/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;

/**
 * Importação de classes para criação de arrays associativos pela nomeação de
 * chaves
 */
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Map<String, String> info = new HashMap();

        String nome1 = JOptionPane.showInputDialog("Nome do colaborador");

        info.put("name", nome1);

        Colaboradores men = new Colaboradores();
        men.setColaborador(info);
        
        men.mostrarColaborador();

    }
}
