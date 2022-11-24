/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.ragnarok.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Tarefas {

    /**
     * Atributo de codigo da tarefa
     */
    private int codigo;

    /**
     * Atributo de nome da tarefa
     */
    private String nome;

    /**
     * Atributo de tipo da tarefa
     */
    private String tipo;

    /**
     * Atributo de prazo de Entrega da tarefa
     */
    private String prazoDeEntrega; // 0000-00-00 00:00:00

    /**
     * Atributo de codigo do projeto da tarefa
     */
    private int codigoProjeto;

    /**
     * Atributo de descricao da tarefa
     */
    private String descricao;

    /**
     * Atributo de colaborador responsável da tarefa
     */
    private int colabResponsavel;

    /**
     * Atributo de colaborador criador da tarefa
     */
    private int codigoCriador;

    // GETTERS
    /**
     * Getter Codigo
     *
     * @return int
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Getter Nome
     *
     * @return String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter Tipo
     *
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * Getter PrazoDeEntrega
     *
     * @return String
     */
    public String getPrazoDeEntrega() {
        return this.prazoDeEntrega;
    }

    /**
     * Getter Codigo do projeto
     *
     * @return int
     */
    public int getCodigoProjeto() {
        return this.codigoProjeto;
    }

    /**
     * Getter Descricao
     *
     * @return String
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Getter ColabResponsavel
     *
     * @return int
     */
    public int getColabResponsavel() {
        return this.colabResponsavel;
    }

    /**
     * Getter Codigo do criador
     *
     * @return int
     */
    public int getCodigoCriador() {
        return this.codigoCriador;
    }

    // SETTERS
    /**
     * Setter Codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Setter Nome
     *
     * @param codigo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setter Tipo
     *
     * @param codigo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Setter PrazoDeEntrega
     *
     * @param codigo
     */
    public void setPrazoDeEntrega(String prazoDeEntrega) {
        this.prazoDeEntrega = prazoDeEntrega;
    }

    /**
     * Setter Codigo do projeto
     *
     * @param codigoProjeto
     */
    public void setCodigoProjeto(int codigoProjeto) {
        this.codigoProjeto = codigoProjeto;
    }

    /**
     * Setter Descricao
     *
     * @param codigo
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Setter Codigo do criador
     *
     * @param codigoCriador
     */
    public void setCodigoCriador(int codigoCriador) {
        this.codigoCriador = codigoCriador;
    }

    /**
     * Setter ColabResponsavel
     *
     * @param colabResponsavel
     */
    public void setColabResponsavel(int colabResponsavel) {
        this.colabResponsavel = colabResponsavel;
    }

    /**
     * Método de inserção de tarefas no banco de dados
     */
    public void inserir() {
        // 1: Definir o comando SQL
        String sql = "INSERT INTO Tarefas (nome, tipo, prazo_de_entrega, projetos_id, descricao, criador, colaborador_responsavel) VALUES (?, ?, ?, ?, ?, ?, ?)";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Define os valores pela posição
            ps.setString(1, this.nome);
            ps.setString(2, this.tipo);
            ps.setString(3, this.prazoDeEntrega);
            ps.setInt(4, this.codigoProjeto);
            ps.setString(5, this.descricao);
            ps.setInt(6, this.codigoCriador);
            ps.setInt(7, this.colabResponsavel);
            // 5: Executa o comando
            ps.execute();
            // 6: Finaliza o comando
            ps.close();
            // 6.1: Mostra mensagem caso criado
            if (c != null) {
                JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso");
            }
        } catch (Exception e) {
            // 7: Validação de erro
            JOptionPane.showMessageDialog(null, "Houve um erro ao criar a tarefa");
            e.printStackTrace();
        }
    }

}
