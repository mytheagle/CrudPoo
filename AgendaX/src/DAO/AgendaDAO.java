/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;

/**
 *
 * @author Myth
 */
public interface AgendaDAO {

    Cliente porNome(String nome);

    /*Cliente porCPF(String cpf);*/
    boolean adicionar(Cliente c);

    boolean atualizar(Cliente c);

    boolean apagar(Cliente c);

}
