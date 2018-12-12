/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Myth
 */
public abstract class Cliente {

    int id;
    String nome;
    String sobrenome;
    String Tel;
    String email;
    String endr;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public Cliente(String nome, String sobrenome, String Tel, String email, String endr) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.Tel = Tel;
        this.email = email;
        this.endr = endr;
    }

    public Cliente(int id, String nome, String sobrenome, String Tel, String email, String endr) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.Tel = Tel;
        this.email = email;
        this.endr = endr;
    }

    public String getEndr() {
        return endr;
    }

    public void setEndr(String endr) {
        this.endr = endr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
