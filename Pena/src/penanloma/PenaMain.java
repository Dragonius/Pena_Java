package penanloma;

import javax.swing.JOptionPane;

public class PenaMain {
    
    public static void main(String[] args) {
        //Muuttujat Ja alkuteksti
        int valinta;
        String lukuStr="na";
        PenaOlio penaO = new PenaOlio();
        PenaKontrolleri kontrolleri = new PenaKontrolleri();   
        while (true) {
            
        String alkuTervehdys = "Hei Pena! Oletko valmis viettämään huikean loman? \n"
                + "Sinulla on kymmenen päivää aikaa viettää mahdollisimman mahtava loma. \n"
                + "Saat käyttörahaa alkuun 1000€, mutta voit ottaa kerran loman aikana\n "
                + "500€ pikavipin. Muista, että kaikella tekemälläsi voi olla hyviä ja huonoja seuraamuksia!";
        String alkuvalinta = "Nyt saat päättää, haluatko viettää lomasi rauhallisesti Suomessa vai \n"
                + "haluatko oikein repäistä ja lähteä Thaimaan lämpöön.\n  \n"
                + "1. Haluan jäädä Suomeen. \n"
                + "2. Vietän loman Thaimaassa! \n"
                + "3. Perutaan koko loma.";
        
        //INPUT
        //Alku tervehdys josta kutsutaan tarvittava olio.
        JOptionPane.showMessageDialog(null, alkuTervehdys);
        lukuStr = JOptionPane.showInputDialog(alkuvalinta);
        /* Tarkista onko Annettu parametri muu kuin nulla ja jos on niin aja
        Parseint, muuten mene suoraan else kohtaan 
        */
        if (lukuStr != null){
        
        valinta = Integer.parseInt(lukuStr); 
        
       
        //Valinta mikä päättää minkä olio käynistetään kontrollerin kautta.
        switch(valinta){
            case 1: kontrolleri.suomi(penaO);
            kontrolleri.loppu(penaO);
            break;
            case 2: kontrolleri.thaimaa(penaO);
            kontrolleri.loppu(penaO);
            break;
            case 3: JOptionPane.showMessageDialog(null, "Loma peruttu, Maanantaina duuniin!");
            System.exit(0);
            break;
            default: System.exit(0);
        }
        
    
        
        //OUTPUT
        }
        /* Jos lukuStr on Null niin tule tänne ja keskeytä ohjelma sekä 
        tulosta statiikka
        */
        else {
        kontrolleri.loppu(penaO);
        System.exit(0);
        }
    }
    }
}