/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author Myth
 */
public class ClientePF extends Cliente {

    String cpf;

    public ClientePF(int id, String nome) {
        super(id, nome);

    }

    public ClientePF(String nome, String sobrenome, String Tel, String email, String endr) {
        super(nome, sobrenome, Tel, email, endr);
    }

    public ClientePF(int id, String nome, String sobrenome, String Tel, String email, String endr) {
        super(id, nome, sobrenome, Tel, email, endr);
    }

    public ClientePF(String nome, String sobrenome, String Tel, String email, String endr, String cpf) {
        super(nome, sobrenome, Tel, email, endr);
        this.cpf = cpf;
    }

    public ClientePF(int id, String nome, String sobrenome, String Tel, String email, String endr, String cpf) {
        super(id, nome, sobrenome, Tel, email, endr);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClientePF other = (ClientePF) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

}
