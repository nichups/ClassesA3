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
        String nome, email, fone, cpf, funcao, endereco, senha;
        Double salario;
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n5-Testar Conexão\n0-Sair";

        int op, numHoras;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: {
                    nome = JOptionPane.showInputDialog("Nome do colaborador");
                    email = JOptionPane.showInputDialog("Email do colaborador");
                    senha = JOptionPane.showInputDialog("Senha de acesso");
                    fone = JOptionPane.showInputDialog("Telefone do colaborador");
                    cpf = JOptionPane.showInputDialog("CPF do colaborador");
                    funcao = JOptionPane.showInputDialog("Função do colaborador");
                    endereco = JOptionPane.showInputDialog("Endereço do colaborador");
                    salario = Double.valueOf(JOptionPane.showInputDialog("Salário do colaborador"));
                    numHoras = Integer.parseInt(JOptionPane.showInputDialog("Número de Horas do colaborador"));

                    Colaboradores p = new Colaboradores();
                    p.setNome(nome);
                    p.setEmail(email);
                    p.setFone(fone);
                    p.setCpf(cpf);
                    p.setFuncao(funcao);
                    p.setEndereco(endereco);
                    p.setSalario(salario);
                    p.setNumHoras(numHoras);

                    p.inserir(senha);
                    break;
                }

                case 2:
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
