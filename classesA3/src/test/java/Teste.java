/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Importação de bibliotecas chaves
 */
import connection.ConnectionFactory;
import controller.ColaboradoresFormulario;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        String nome, email, fone, cpf, funcao, endereco, senha;
        Double salario;
        String menu = "Colaboradores:\n1 - Cadastrar\n2 - Atualizar\n3 - Apagar\n4 - Listar\n\nEquipes:\n11 - Cadastrar\n12 - Atualizar\n13 - Apagar\n14 - Listar\n\nProjetos:\n21 - Cadastrar\n22 - Atualizar\n23 - Apagar\n24 - Listar\n\nTarefas:\n31 - Cadastrar\n32 - Atualizar\n33 - Apagar\n34 - Listar\n\nParâmetros:\n5 - Testar Conexão\n0 - Sair";

        int op, numHoras;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: {
                    new ColaboradoresFormulario('C').setVisible(true);
                    break;
                }
                case 2: {
                    new ColaboradoresFormulario('A').setVisible(true);
                    break;
                }
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
