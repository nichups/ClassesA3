/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.ragnarok.ConnectionFactory;

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
    public String[][] getColabDisp() {
        int cols, rowCount, iCount, row, i;
        String sql;
        String[][] res;

        ConnectionFactory factory;
        PreparedStatement psCount, ps;
        ResultSet rsCount, rs;

        // 1: Definir o comando SQL
        sql = "SELECT r.colab_id, r.colab_nome FROM (SELECT c.id AS colab_id, c.nome AS colab_nome, IFNULL(cc.id,0) AS cntrl_id, IFNULL(e.id,0) AS equipe_id FROM Colaboradores AS c LEFT JOIN ControleColaboradores AS cc ON cc.colaboradores_id=c.id LEFT JOIN Equipes AS e ON e.id=cc.equipes_id AND e.data_prazo < CURRENT_DATE() HAVING cntrl_id=0 AND equipe_id=0) AS r;";
        // 2: Abrir uma conexão
        factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {

            // Processos de tratamento da informação vinda do banco
            psCount = c.prepareStatement(sql);
            rsCount = psCount.executeQuery();

            // Cálculo de tamanho da matriz
            cols = rsCount.getMetaData().getColumnCount();
            rowCount = 0;
            iCount = 0;
            while (rsCount.next()) {
                for (iCount = 0; iCount < cols;) {
                    iCount++;
                }
                rowCount++;
            }

            // Processos de tratamento da informação vinda do banco
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

            // Formulação do array baseado no cálculo
            row = 0;
            i = 0;
            res = new String[rowCount][iCount];
            while (rs.next()) {
                for (i = 0; i < cols; i++) {
                    res[row][i] = rs.getString(i + 1);
                    System.out.println(rs.getString(i + 1));
                }
                row++;
            }
            return res;
        } catch (Exception e) {
            // 7: Validação de erro
            e.printStackTrace();
        }

        return new String[][] {
                { null, null, null, null }
        };
    }

}
