/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;

public class Equipes {

    /**
     * Número de funcionários da equipe
     */
    private int nFuncionarios;

    /**
     * Função da equipe
     */
    private String funcao;

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;

    }
    
    public void mostrarEquipe() {
        System.out.println("Função da equipe: " + this.funcao);
        System.out.println("Numero de funcionários dentro da equipe: " + this.nFuncionarios);

    }
    
}
