/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package model;

import com.ragnarok.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Colaboradores {

    /**
     * Código do Colaborador
     */
    public int codigo;

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
    public Double salario;

    /**
     * Horas de trabalho do Colaborador
     */
    public int numHoras;

    /**
     * Senha do Colaboradpr
     */
    public String senha;

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
        System.out.println("A Senha do Colaborador é " + this.senha);
    }

    /**
     * Getter Codigo
     *
     * @return
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Getter Nome
     *
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter Email
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter Fone
     *
     * @return
     */
    public String getFone() {
        return this.fone;
    }

    /**
     * Getter Cpf
     *
     * @return
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * Getter Funcao
     *
     * @return
     */
    public String getFuncao() {
        return this.funcao;
    }

    /**
     * Getter Endereco
     *
     * @return
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Getter Salario
     *
     * @return
     */
    public Double getSalario() {
        return this.salario;
    }

    /**
     * Getter NumHoras
     *
     * @return
     */
    public int getNumHoras() {
        return this.numHoras;
    }

    // -- SETTERS
    /**
     * Setters Nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setters Email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setters Fone
     *
     * @param fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Setters Cpf
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Setters Funcao
     *
     * @param funcao
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * Setters Endereco
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Setters Salario
     *
     * @param salario
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * Setters NumHoras
     *
     * @param numHoras
     */
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    /**
     * Setters Senha
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // -- MÉTODOS
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
        System.out.println("Senha do Colaborador: " + this.senha);
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

    /**
     * Método de inserção de usuário no banco de dados
     */
    public void inserir(String senha) {
        // 1: Definir o comando SQL
        String sql = "INSERT INTO Colaboradores (nome, email, fone, cpf, funcao, endereco, salario, senha, numHoras) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Define os valores pela posição
            ps.setString(1, this.nome);
            ps.setString(2, this.email);
            ps.setString(3, this.fone);
            ps.setString(4, this.cpf);
            ps.setString(5, this.funcao);
            ps.setString(6, this.endereco);
            ps.setDouble(7, this.salario);
            ps.setString(8, senha);
            ps.setInt(9, this.numHoras);
            // 5: Executa o comando
            ps.execute();
            // 6: Finaliza o comando
            ps.close();
            // 6.1: Mostra mensagem caso criado
            if (c != null) {
                JOptionPane.showMessageDialog(null, "Colaborador cadastrado com sucesso");
            }
        } catch (Exception e) {
            // 7: Validação de erro
            JOptionPane.showMessageDialog(null, "Houve um erro ao criar a colaborador");
            e.printStackTrace();
        }
    }
}
