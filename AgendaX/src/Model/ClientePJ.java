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
public class ClientePJ extends Cliente {

    String cnpj;

    public ClientePJ(int id, String nome) {
        super(id, nome);

    }

    public ClientePJ(String nome, String sobrenome, String Tel, String email, String endr) {
        super(nome, sobrenome, Tel, email, endr);
    }

    public ClientePJ(String nome, String sobrenome, String Tel, String email, String endr, String cnpj) {
        super(nome, sobrenome, Tel, email, endr);
        this.cnpj = cnpj;
    }

    public ClientePJ(int id, String nome, String sobrenome, String Tel, String email, String endr, String cnpj) {
        super(id, nome, sobrenome, Tel, email, endr);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cnpj);
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
        final ClientePJ other = (ClientePJ) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

}
