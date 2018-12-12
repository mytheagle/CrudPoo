/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AgendaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Myth
 */
public class Agenda implements AgendaDAO {

    ArrayList<Cliente> agendaA;

    public Agenda() {
        this.agendaA = new ArrayList();
    }

    public boolean setClientePF(ClientePF c) {

        return this.agendaA.add(c);
    }

    public boolean setClientePJ(ClientePJ c) {

        return this.agendaA.add(c);
    }

    public Cliente getCliente(int i) {
        return this.agendaA.get(i);
    }

    public int size() {
        return this.agendaA.size();
    }

    @Override
    public Cliente porNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean adicionar(Cliente c) {
        try {
            String sql = "insert into cadastro(nome,sobrenome,tel,email,endr) values(?,?,?,?,?) ";
            PreparedStatement stm = conInit.getConexao().prepareStatement(sql);
            stm.setString(1, c.getNome());
            stm.setString(2, c.getSobrenome());
            stm.setString(3, c.getTel());
            stm.setString(4, c.getEmail());
            stm.setString(5, c.getEndr());
            stm.execute();
            stm.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean atualizar(Cliente c) {
        try {
            String sql = "update cadastro set nome=?"
                    + ", sobrenome=?"
                    + ", tel=?"
                    + ", email=?"
                    + ", endr=? "
                    + "  where cod=?";
            PreparedStatement stm = conInit.getConexao().prepareStatement(sql);
            stm.setString(1, c.getNome());
            stm.setString(2, c.getSobrenome());
            stm.setString(3, c.getTel());
            stm.setString(4, c.getEmail());
            stm.setString(5, c.getEndr());
            stm.setInt(6, c.getId());
            stm.execute();
            stm.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean apagar(Cliente c) {
        try {

            String sql = "delete from cadastro where cod=? ";
            PreparedStatement stm = conInit.getConexao().prepareStatement(sql);
            stm.setInt(1, c.getId());
            stm.executeUpdate();
            stm.close();
        } catch (SQLException | ClassNotFoundException ex) {

        }

        return true;
    }

    public static Agenda atualizarAgenda() {
        Agenda agenda_up = new Agenda();
        try {
            Connection conexao = conInit.getConexao();
            String sql = "select * from cadastro";
            PreparedStatement stm = conexao.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Cliente e;
                e = new ClientePF(rs.getInt("cod"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("tel"), rs.getString("email"), rs.getString("endr"));

                agenda_up.setClientePF((ClientePF) e);

                //System.out.println(strings.get(i).toString());
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conInit.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agenda_up;

    }

}
