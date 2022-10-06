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
     * @return
     */
    public Map<String, String> getColaborador() {
        // Cria um Array via import da HashMap, onde chaves e valores são do tipo String
        Map<String, String> info = new HashMap();

        // coloca os dados no array
        info.put("name", this.nome);
        info.put("email", this.email);
        info.put("fone", this.fone);
        info.put("cpf", this.cpf);
        info.put("funcao", this.funcao);
        info.put("endereco", this.endereco);
        info.put("salario", this.salario);
        info.put("numHoras", this.numHoras);

        return info;
    }

    // SETTERS
    /**
     * Setter do nome do colaborador
     *
     * @param info
     */
    public void setColaborador(Map<String, String> info) {
        this.nome = info.get("nome");
        this.email = info.get("email");
        this.fone = info.get("fone");
        this.cpf = info.get("cpf");
        this.funcao = info.get("funcao");
        this.endereco = info.get("endereco");
        this.salario = info.get("salario");
        this.numHoras = info.get("numHoras");
    }

    // MÉTODOS
    /**
     * Método para mostrar colaborador
     */
    public void mostrarColaborador() {
        // Chama a função getter de colaboradores para mostra-lo
        Map<String, String> info = this.getColaborador();

        System.out.println("Nome do Colaborador: " + info.get("name"));
        System.out.println("Email do Colaborador: " + info.get("email"));
        System.out.println("Telefone do Colaborador: " + info.get("fone"));
        System.out.println("CPF do Colaborador: " + info.get("cpf"));
        System.out.println("Função do Colaborador: " + info.get("funcao"));
        System.out.println("Endereço do Colaborador: " + info.get("endereco"));
        System.out.println("Salário do Colaborador: " + info.get("salario"));
        System.out.println("Número de Horas do Colaborador: " + info.get("numHoras"));
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

}
