package exo1;

import java.util.ArrayList;
import java.util.List;

public class Annuaire implements ContactService{

    private static List<Contact> lesContacts = new ArrayList<>();

    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            //"Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero() repete ecriture dans le toString et n'est respecte pas le principe DRY
            System.out.println(contact);
        }
    }
}
