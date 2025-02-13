package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    //classe Contact est responsable seulement pour la creation d'une contact pour respecter le principe de Single Reaponsability
    private String nom;
    private String numero;

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        //elimination car n'est respecte pas Single Responsability - lesContacts.add(this);
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

//ici ecriture se repete dans le toString et n'est respecte pas le principe DRY
  public String getInfoContact() {
        return toString();
    }
    //deplacer a la classe Annuaire
 /*public void afficheContacts() {
    for (Contact contact : lesContacts) {
        //"Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero() repete ecriture dans le toString et n'est respecte pas le principe DRY
        System.out.println(contact);
    }
}*/

    //la méthode sauvegardeEnBD(){Logique pour sauvegarder les contacts dans une base de données} est eliminé pour etre géré par la classe Base

   /* la méthode public void envoiEmail(Contact contact, String message) est eliminé pour etre géré ailleurs {
        // Logique pour envoyer un email
    }*/

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }
}

