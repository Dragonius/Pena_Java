package penanloma;

import javax.swing.JOptionPane;


public class PenaOlio {
    private int rahat;
    private int eeppisyys;
    private int aika;
    
    public PenaOlio(){
        rahat = 1000;
        eeppisyys = 0;
        aika = 0;
    }
    
    

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
    public int otaRahaa(int maksu){
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
    public int otaLaina(){
        int palautus;
        rahat = rahat + 500;
        palautus = rahat;
        return palautus;
    }
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
