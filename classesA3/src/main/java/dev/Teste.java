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
        int contColabs, contEquipes, contGestores, contTarefas, maxColabs, maxEquipes, maxGestores, maxTarefas;
        String nome1, email1, fone1, cpf1, funcao1, endereco1, salario1, numHoras1,
                nFuncs1, numEquipesDirigindo1, prazoDeEntrega1, descricao1;

        Colaboradores Colab1 = new Colaboradores();
        Equipes Equipe1 = new Equipes();
        Gestores Gestor1 = new Gestores();
        Tarefas Tarefa1 = new Tarefas();

        contColabs = 0;
        contEquipes = 0;
        contGestores = 0;
        contTarefas = 0;

        maxColabs = Integer.parseInt(JOptionPane.showInputDialog("Maximo de colaboradores"));
        maxEquipes = Integer.parseInt(JOptionPane.showInputDialog("Maximo de equipes"));
        maxGestores = Integer.parseInt(JOptionPane.showInputDialog("Maximo de gestores"));
        maxTarefas = Integer.parseInt(JOptionPane.showInputDialog("Maximo de tarefas"));

        while (contColabs < maxColabs) {
            nome1 = JOptionPane.showInputDialog("Nome do colaborador");
            email1 = JOptionPane.showInputDialog("Email do colaborador");
            fone1 = JOptionPane.showInputDialog("Telefone do colaborador");
            cpf1 = JOptionPane.showInputDialog("CPF do colaborador");
            funcao1 = JOptionPane.showInputDialog("Função do colaborador");
            endereco1 = JOptionPane.showInputDialog("Endereço do colaborador");
            salario1 = JOptionPane.showInputDialog("Salário do colaborador");
            numHoras1 = JOptionPane.showInputDialog("Número de Horas do colaborador");

            Colab1.setColaborador(nome1, email1, fone1, cpf1, funcao1, endereco1, salario1, numHoras1);
            Colab1.mostrarColaborador();
            contColabs++;
        }

        while (contEquipes < maxEquipes) {
            funcao1 = JOptionPane.showInputDialog("Função da equipe");
            nFuncs1 = JOptionPane.showInputDialog("Numero de funcionarios da equipe");
            // Salvar na classe pelo set e mostrar pelo get

            contEquipes++;
        }
        while (contGestores < maxGestores) {
            numEquipesDirigindo1 = JOptionPane.showInputDialog("Numero de equipes que o gestor admnistra");
            // Salvar na classe pelo set e mostrar pelo get

            contGestores++;
        }
        while (contTarefas < maxTarefas) {
            prazoDeEntrega1 = JOptionPane.showInputDialog("Prazo da entrega da tarefa");
            descricao1 = JOptionPane.showInputDialog("Descrição da entrega");
            // Salvar na classe pelo set e mostrar pelo get

            contTarefas++;
        }

    }
}
