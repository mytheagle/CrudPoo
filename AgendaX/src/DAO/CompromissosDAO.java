/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Myth
 */
public interface CompromissosDAO {

    void adicionar(String data_comp, String hora, String b, int id);

    void ver(String b);

    void atualizar(String b);

    void remover(String b);

}
