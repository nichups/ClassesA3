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
    	int contadorColaboradores, contadorEquipes, contadorGestores, contadorTarefas, limiteColaboradores, limiteEquipes, limiteGestores, limiteTarefas;

        Colaboradores men = new Colaboradores();
        Equipes time7 = new Equipes();
        Gestores sigma = new Gestores();
        Tarefas tarefa1 = new Tarefas();
        
        while(contadorColaboradores	>=	limiteColaboradores) {
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
            contadorColaboradores++;
        }
        
        while(contadorEquipes	>=	limiteEquipes) {
        	String funcao1 = JOptionPane.showInputDialog("Função da equipe");
        	String nFuncionarios1 = JOptionPane.showInputDialog("Numero de funcionarios da equipe");
        	contadorEquipes++;
        }
        while(contadorGestores	>=	limiteGestores) {
        	String numeroDeEquipesDirigindo1 = JOptionPane.showInputDialog("Numero de equipes que o gestor admnistra");
        	contadorGestores++;
    }
        while(contadorTarefas	>=	limiteTarefas) {
        	String prazoDeEntrega1 = JOptionPane.showInputDialog("Prazo da entrega da tarefa");
        	String descricao1 = JOptionPane.showInputDialog("Descrição da entrega");
        	contadorTarefas++;
        }
        
        limiteColaboradores = JOptionPane.showInputDialog("Maximo de colaboradores");
        limiteEquipes = JOptionPane.showInputDialog("Maximo de equipes");
        limiteGestores = JOptionPane.showInputDialog("Maximo de gestores");
        limiteTarefas = JOptionPane.showInputDialog("Maximo de tarefas");
}

