/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 * Importação de bibliotecas chaves
 */
import connection.ConnectionFactory;
import controller.ColaboradoresFormulario;
import model.Colaboradores;
import javax.swing.JOptionPane;
import model.Equipes;

public class Teste {

    public static void main(String[] args) {
        String nome, email, fone, cpf, funcao, endereco, senha;
        Double salario;
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n5-Testar Conexão\n0-Sair";

        int op, numHoras;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: {
                new ColaboradoresFormulario().setVisible(true);
                }

                case 2:
                    Equipes test = new Equipes();
                    test.getColabDisp(0);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    ConnectionFactory connect = new ConnectionFactory();
                    connect.testConnection();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 0);
    }

}
