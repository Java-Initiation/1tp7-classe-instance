package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        AdressePostale adresse1 = new AdressePostale();

        personne1.setNom("test");
        personne1.setPrenom("test");
        personne1.setAdressePostale(adresse1);

    }

}
