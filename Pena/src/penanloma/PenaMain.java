package penanloma;

import javax.swing.JOptionPane;

public class PenaMain {

    public static void main(String[] args) {
        //Muuttujat Ja alkuteksti
        PenaKontrolleri kontrolleri = new PenaKontrolleri();
        String alkuTervehdys = "Hei Pena! Oletko valmis viettämään huikean loman? \n"
                + "Sinulla on kymmenen päivää aikaa viettää mahdollisimman mahtava loma. \n"
                + "Saat käyttörahaa alkuun 1000€, mutta voit ottaa kerran loman aikana\n "
                + "500€ pikavipin. Muista, että kaikella tekemälläsi voi olla hyviä ja huonoja seuraamuksia!";
        String alkuvalinta = "Nyt saat päättää, haluatko viettää lomasi rauhallisesti Suomessa vai \n"
                + "haluatko oikein repäistä ja lähteä Thaimaan lämpöön.\n  \n"
                + "1. Haluan jäädä Suomeen. \n"
                + "2. Vietän loman Thaimaassa! \n"
                + "9. Perutaan koko loma.";
        //INPUT
        JOptionPane.showMessageDialog(null, alkuTervehdys);
        JOptionPane.showInputDialog(alkuvalinta);
        //TEMPUT
        
        //OUTPUT
        //Loppu tulostus, Statikkaa? kuinka paljon rahaa ja kuinka eepisyys oli?
    }

}
