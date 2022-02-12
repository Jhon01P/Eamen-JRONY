/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.insuperior.modelo;

/**
 *
 * @author Administrador
 */
public class Loggin {
       private String user;
    private String password;

    public Loggin() {
    }

    public Loggin(String user, String password) {
        this.user = user;
        this.password = password;
    }

  

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
