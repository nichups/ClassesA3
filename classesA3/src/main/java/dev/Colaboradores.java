/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dev;

/**
 * Importação de classes para criação de arrays associativos pela nomeação de
 * chaves
 */
import java.util.HashMap;
import java.util.Map;

public class Colaboradores {

    /**
     * Nome do Colaborador
     */
    public String nome;

    /**
     * Email do Colaborador
     */
    public String email;

    /**
     * Telefone do Colaborador
     */
    public String fone;

    /**
     * CPF do Colaboradpr
     */
    public String cpf;

    /**
     * Função do Colaboradpr
     */
    public String funcao;

    /**
     * Endereço do Colaboradpr
     */
    public String endereco;

    /**
     * Salario do Colaboradpr
     */
    public String salario;

    /**
     * Número de horas do Colaborador
     */
    public String numHoras; // 0000-00-00 00:00:00

    // GETTERS
    /**
     * Getter de atributos do colaborador
     *
     */
    public void getColaborador() {
        // coloca os dados no array
        System.out.println("O Nome do Colaborador é " + this.nome);
        System.out.println("O Email do Colaborador é " + this.email);
        System.out.println("O Telefone do Colaborador é " + this.fone);
        System.out.println("O CPF do Colaborador é " + this.cpf);
        System.out.println("O Função do Colaborador é " + this.funcao);
        System.out.println("O Endereço do Colaborador é " + this.endereco);
        System.out.println("O Salário do Colaborador é " + this.salario);
        System.out.println("O Número de Horas do Colaborador é " + this.numHoras);
    }

    // SETTERS
    /**
     * Setter do nome do colaborador
     *
     * @param nome
     * @param email
     * @param fone
     * @param cpf
     * @param funcao
     * @param endereco
     * @param salario
     * @param numHoras
     */
    public void setColaborador(String nome, String email, String fone, String cpf, String funcao, String endereco, String salario, String numHoras) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.cpf = cpf;
        this.funcao = funcao;
        this.endereco = endereco;
        this.salario = salario;
        this.numHoras = numHoras;
    }

    // MÉTODOS
    /**
     * Método para mostrar colaborador
     */
    public void mostrarColaborador() {
        System.out.println("Nome do Colaborador: " + this.nome);
        System.out.println("Email do Colaborador: " + this.email);
        System.out.println("Telefone do Colaborador: " + this.fone);
        System.out.println("CPF do Colaborador: " + this.cpf);
        System.out.println("Função do Colaborador: " + this.funcao);
        System.out.println("Endereço do Colaborador: " + this.endereco);
        System.out.println("Salário do Colaborador: " + this.salario);
        System.out.println("Número de Horas do Colaborador: " + "numHoras");
    }

    /**
     * Validação de acesso pela função do Colaborador
     *
     * @param funcao - Função com acesso permitido
     * @return boolean
     */
    public boolean temAcesso(String[] funcao) {
        for (int i = 0; i < funcao.length; i++) {
            if (funcao[i] == this.funcao) { 
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    void setColaborador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
