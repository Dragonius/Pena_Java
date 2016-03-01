package penanloma;

import javax.swing.JOptionPane;

public class PenaMain {
    /*
    Pitäiskö ajankäyttöä muuttaa niin ettei kaikki aktiviteetit jotka vie aikaa vie aina päivää vaan 
    vaikka tunnin tarkkuudella ja jotenkin (en ajatellu niin pitkälle) lisätään yöt yms siihen.
    
    Loma loppuu vaan siihen, että ohjelma sulkeutuu. ei saatesanoja eikä "tulosta"
    eeppisyyden jne osalta.
    */

    public static void main(String[] args) {
        //Muuttujat Ja alkuteksti
        int valinta;
        String lukuStr;
        PenaOlio penaO = new PenaOlio();
        PenaKontrolleri kontrolleri = new PenaKontrolleri();
        String alkuTervehdys = "Hei Pena! Oletko valmis viettämään huikean loman? \n"
                + "Sinulla on kymmenen päivää aikaa viettää mahdollisimman mahtava loma. \n"
                + "Saat käyttörahaa alkuun 1000€, mutta voit ottaa kerran loman aikana\n "
                + "500€ pikavipin. Muista, että kaikella tekemälläsi voi olla hyviä ja huonoja seuraamuksia!";
        String alkuvalinta = "Nyt saat päättää, haluatko viettää lomasi rauhallisesti Suomessa vai \n"
                + "haluatko oikein repäistä ja lähteä Thaimaan lämpöön.\n  \n"
                + "1. Haluan jäädä Suomeen. \n"
                + "2. Vietän loman Thaimaassa! \n"
                + "3. Perutaan koko loma.";
        /*String lopetustilasto = "Aikaa kului " + penaO.getAika() +"\n"
                + "ja Rahaa jäi " + penaO.getRahat() +"\n";*/
        //INPUT
        //Alku tervehdys josta kutsutaan tarvittava olio.
        JOptionPane.showMessageDialog(null, alkuTervehdys);
        lukuStr = JOptionPane.showInputDialog(alkuvalinta);
        
        /* Tarkista onko Annettu String Null, jos on
        niin tulosta Rhat sekä eepisyys, Pitää vielä muuttaa metodiksi -jari 
        */
        while(lukuStr == null ){
            
        /*JOptionPane.showMessageDialog(null, "Rahaa jäi "+ penaO.getRahat() + "\n"
        + "Eeppisyys oli tosiaan: "  + penaO.getEeppisyys() + "\n" 
        + "Aikaa tosiaankin jäi vielä " + penaO.getAika() + "\n");
        System.exit(0);*/
/*      
        lukuStr = JOptionPane.showInputDialog(alkuvalinta);
        */
        }
        valinta = Integer.parseInt(lukuStr); 
        
        //TEMPUT
        //Valinta mikä päättää minkä olio käynistetään kontrollerin kautta.
        switch(valinta){
            case 1: kontrolleri.suomi(penaO);
            kontrolleri.loppu(penaO);
            break;
            case 2: kontrolleri.thaimaa(penaO);
            kontrolleri.loppu(penaO);
            break;
            default: JOptionPane.showMessageDialog(null, "Loma peruttu, Maanantaina duuniin!");

            
        }
        

        
        //OUTPUT
        //Lopputulostus, Statikkaa? kuinka paljon rahaa ja kuinka eepisyys oli?
 /*       JOptionPane.showMessageDialog(null, "Rahaa jäi "+ penaO.getRahat() + "\n"
        + "Eepisyys oli tosiaan: "  + penaO.getEeppisyys() + "\n" 
        + "Aikaa tosiaankin jäi vielä " + penaO.getAika() + "\n");
*/
        
        }
}