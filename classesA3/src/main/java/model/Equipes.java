/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    /**
     * @param codigo
     * @return
     */
    @SuppressWarnings("empty-statement")
    public Object[][] getColabDisp(int codigo) {
        /**
         * Operação realizada pela função
         */
        char oper;

        if (codigo == 0) {
            oper = 'C';
        } else {
            oper = 'A';
        }

        // 1: Definir o comando SQL
        String sql = "SELECT c.id AS colab_id, c.nome AS colab_nome, IFNULL(cc.id,0) AS cntrl_id, IFNULL(e.id,0) AS equipe_id FROM Colaboradores AS c LEFT JOIN ControleColaboradores AS cc ON cc.colaboradores_id=c.id LEFT JOIN Equipes AS e ON e.id=cc.equipes_id AND e.data_prazo < CURRENT_DATE() HAVING cntrl_id=0 AND equipe_id=0";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Define os valores pela posição (SEM VALORES)
            // 5: Executa o comando
            ResultSet rs = ps.executeQuery();
            // 6: Conversão de valores
            // if (!rs.last()) { // If false, the result set is empty.
            // System.out.println("Empty query");
            // return new Object[][]{
            // {null, null, null, null}
            // };
            // }

            // call only once
            int cols = rs.getMetaData().getColumnCount();
            int row = 0;
            // better add performance
            Object[] y = new Object[cols];
            Object[] x = new Object[row];
            while (rs.next()) {
                for (int i = 0; i < cols; i++) {
                    y[i] = rs.getObject(i + 1);
                }
                x[row] = y;
                row++;
            }
            Object[] mt = new Object[0];
            mt[0] = x;
            return new Object[][] {
                    mt
            };
        } catch (Exception e) {
            // 7: Validação de erro
            e.printStackTrace();
        }

        return new Object[][] {
                { "teste2", null, null, null }
        };
    }

}
