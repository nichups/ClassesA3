/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragnarok;

/**
 * Importação de bibliotecas de conexão
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * Classe de conexão local ao banco de dados
 */
public class ConnectionFactory {

    private String user = "root";
    private String pass = "Tiger";
    private String host = "localhost";
    private String port = "3306";
    private String bd = "usjt_ragnarok";

    private String url = "";

    public ConnectionFactory() {
        this.url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.bd;
    }

    /**
     * Método que estabelece conexão com o banco de dados
     *
     * @return null|Connection error=null
     */
    public Connection obtemConexao() {
        Connection dbConnection = null;

        try {
            Properties info = new Properties();
            info.put("user", this.user);
            info.put("password", this.pass);

            dbConnection = DriverManager.getConnection(this.url, info);
            return dbConnection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Método de teste de conexão
     */
    public void testConnection() {
        Connection dbConnection = null;

        try {
            dbConnection = this.obtemConexao();

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database " + this.bd);
            }
        } catch (Exception ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }

    }

    public void deletar(int id, String table) {
        // 1: Definir o comando SQL
        String sql = "DELETE FROM `" + table + "` WHERE `id`=?";
        System.out.println("id: " + id + " / table: " + table + " / sql: " + sql);
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Define os valores pela posição
            ps.setInt(1, id);
            // 5: Executa o comando
            ps.execute();
            // 6: Finaliza o comando
            ps.close();
            // 6.1: Mostra mensagem caso criado
            if (c != null) {
                JOptionPane.showMessageDialog(null, "Campo deletado com sucesso");
            }
        } catch (Exception e) {
            // 7: Validação de erro
            JOptionPane.showMessageDialog(null, "Houve um erro ao deletar o campo");
            e.printStackTrace();
        }
    }
}
