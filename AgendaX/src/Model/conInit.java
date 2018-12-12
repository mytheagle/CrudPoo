/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Myth
 */
public class conInit {

    //Dados para a conexão com o banco
    private static String USUARIO = "root";
    private static String SENHA = "admin";
    private static String DATABASE = "agenda";
    private static String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
    private static String STR_CONEXAO = "jdbc:mysql://127.0.0.1:3306/";

    public static Connection getConexao() throws SQLException, ClassNotFoundException {

        Connection conn = null;
        try {
            Class.forName(DRIVER_CONEXAO);
            conn = DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA);

            return conn;

        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(
                    "Driver MySql não foi encontrado " + e.getMessage());

        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar "
                    + "com a base de dados" + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn) {

        try {
            if (conn != null) {
                conn.close();
                System.out.println("Fechada a conexão com o banco de dados");
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt) {

        try {
            if (conn != null) {
                fechaConexao(conn);
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("Statement fechado com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível fechar o statement " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {

        try {
            if (conn != null || stmt != null) {
                fechaConexao(conn, stmt);
            }
            if (rs != null) {
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
        }

    }

    /*public  Agenda atualizarAgenda() {
        Agenda agenda_up = new Agenda();
        try {
            Connection conexao = conInit.getConexao();
            String sql = "select * from cadastro";
            PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Cliente e;
                e = new ClientePF(rs.getInt("cod"),rs.getString("nome"),rs.getString("sobrenome"),rs.getString("tel"),rs.getString("email"),rs.getString("endr"));
                
                agenda_up.setClientePF((ClientePF) e);
   
                //System.out.println(strings.get(i).toString());
                        
                }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conInit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return agenda_up;
        
        }*/

    public static void setUSUARIO(String USUARIO) {
        conInit.USUARIO = USUARIO;
    }

    public static void setSENHA(String SENHA) {
        conInit.SENHA = SENHA;
    }

    public static void setDATABASE(String DATABASE) {
        conInit.DATABASE = DATABASE;
    }

    public static void setDRIVER_CONEXAO(String DRIVER_CONEXAO) {
        conInit.DRIVER_CONEXAO = DRIVER_CONEXAO;
    }

    public static void setSTR_CONEXAO(String STR_CONEXAO) {
        conInit.STR_CONEXAO = STR_CONEXAO;
    }

}
