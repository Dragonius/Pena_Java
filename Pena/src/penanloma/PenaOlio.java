package penanloma;

import javax.swing.JOptionPane;

//private int Penaolio
//luodaan private int oliot joita muutetaan vain metodeiden kautta.
public class PenaOlio {
    private int rahat;
    private int eeppisyys;
    private int aika;
    private int laina;
    
    // luo pena olio ja määritä rahat, aika, eeppisyys ja onko laina otettu muuttujat.
    public PenaOlio(){
        rahat = 1000;
        eeppisyys = 0;
        aika = 0;
        laina = 0;
    }
    
    
//get ja set asetuksia
    public int getRahat() {
        return rahat;
    }

    public void setRahat(int rahat) {
        this.rahat = rahat;
    }

    public int getEeppisyys() {
        return eeppisyys;
    }

    public void setEeppisyys(int eeppisyys) {
        this.eeppisyys = eeppisyys;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }
    // Rahan toiminta olio
    public int otaRahaa(int maksu){
//tarkista onko rahaa ja jos on niin vähennä maksuna
//Mikälli ei ole rahaa. palauta teksti että rahasi loppuivat
        int palautus;
        if (maksu <= rahat) {
            rahat = rahat - maksu;
            palautus = rahat;
        }else {
            JOptionPane.showMessageDialog(null, "Rahasi loppuivat!");
            palautus = 0;
        }
        return palautus;
    }
//lisää rahaa X summa mikä tulee metodin kautta
    public int lisääRahaa(int summa){
        int palautus;
        rahat = rahat + summa;
        palautus = rahat;
        return palautus;
    }
//Tarkista onko laina annettu ja anna laina mikälli lainaa ei ole otettu vielä
    public int otaLaina(){
        int palautus;
        if (laina==0) {
        rahat = rahat + 500;
        laina = 1;
        palautus = rahat;  
        }
        else {
            JOptionPane.showMessageDialog(null, "Olet jo ottanut lainasi!");
            palautus = 0;
        }
        return palautus;
    }
//Lisää päiviä aikaan.
    public int lisääAika(int päivä){
        int palautus;
        aika = aika + päivä;
        palautus = aika;
        return palautus;
               
    }
    public int lisääEeppisyyttä(int eeppisyysleveli){
        int palautus;
        eeppisyys = eeppisyys + eeppisyysleveli;
        palautus = eeppisyys;
        return palautus;
    }
    public int vähennäEeppisyyttä(int eeppisyysleveli){
        int palautus;
        eeppisyys = eeppisyys - eeppisyysleveli;
        palautus = eeppisyys;
        return palautus;
    }
    
}
