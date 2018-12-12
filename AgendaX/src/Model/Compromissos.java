/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.CompromissosDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Myth
 */
public class Compromissos implements CompromissosDAO {

    ArrayList<String> compromissos;

    public Compromissos(ArrayList<String> compromissos) {
        this.compromissos = compromissos;
    }

    public ArrayList<String> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(ArrayList<String> compromissos) {
        this.compromissos = compromissos;
    }

    @Override
    public void adicionar(String data_Comp, String hora, String b, int id) {
        try {
            String sql = "insert into queue(data,hora,descr,cli_id) values(?,?,?,?)";
            PreparedStatement stm = conInit.getConexao().prepareStatement(sql);
            stm.setString(1, data_Comp);
            stm.setString(2, hora);
            stm.setString(3, b);
            stm.setInt(4, id);
            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Compromissos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compromissos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void ver(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
