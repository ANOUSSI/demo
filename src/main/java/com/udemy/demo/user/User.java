package com.udemy.demo.user;

import javax.validation.constraints.Size;

public class User {
    @Size(min = 5,max = 80,message = "la taille est superieir a 5 et inferieur a 71")
    private String nom;
    @Size( min = 5,max = 45, message = "la taille est superiur a 5")
    private String prenom;
    private  String email;
    private  String password;
public User(){

}
    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
