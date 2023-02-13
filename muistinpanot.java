package DEMOT.D2A;

import java.util.ArrayList;


/**
 * Muodosta uusi muistiviko
 *
 * @param nimi muistivihkon nimi
 * @param omistaja muistivihkon omistajan nimi
 * @param muistinpanot Lista, joka sisältää muistipanot
 */
public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    
    /**
     * Luokka mallintaa muistivihko, johon asiakas voi kirjata omat muistinpanot 
     * sekä asettaa muistinpanojen omistajan nimi
     * 
     * @param nimi muistivihkon nimi
     * @param omistaja muistivihkon omistajan nimi
     * @param muistinpanot on ArrayList, johon tallennetaan kaikki muistinpanot                
     */
    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }
/**
 * Haetaan muistivihon nimi. 
 * @return palauttaa String - muistinpanon nimi 
 */

    public String getNimi() {
        return nimi;
    }


    /**
     * Asetetaan muistivihon nimi
     * @param nimi on muistivihon nimi, String
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * 
     * @return  palauttaa muistivihon omistajaa, String 
     */
    public String getOmistaja() {
        return omistaja;
    }

    /**
     * Asetetaan muistivihon omistajaa
     * @param omistaja on String
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    /**
     * Asetetaan muistikirjan kirjaus
     * @param viesti on String, jonka tallennetaan ArrayList olioon
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    /**
     * Haetaan mnuistinpanojen määrää
     * @return muistinpanojen kappalemäärä
     */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    /**
     * Tulostetaan kaikki muistinpanot.
     * Muistinpanot haetaan listasta ja tulostetaan yksi muistinpanorivi kerralla
      */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}

