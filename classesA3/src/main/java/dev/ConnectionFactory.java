/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;

/**
 * Importação de bibliotecas de conexão
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
}
