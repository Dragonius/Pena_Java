package penanloma;

import javax.swing.JOptionPane;

//private int Penaolio
public class PenaOlio {
    private int rahat;
    private int eeppisyys;
    private int aika;
    private int laina;
    
    // luo pena olio ja määritä rahat sekä aika että eeppisyys
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
    public void otaRahaa(int maksu){
        JOptionPane.showMessageDialog(null, maksu);
//        int palautus;
//        if (maksu <= rahat) {
//            rahat = rahat - maksu;
//            palautus = rahat;
//        }else {
//            JOptionPane.showMessageDialog(null, "Rahasi loppuivat!");
//            palautus = 0;
//        }
//        return palautus;
    }
    public int lisääRahaa(int summa){
        int palautus;
        rahat = rahat + summa;
        palautus = rahat;
        return palautus;
    }
    //puutuu että onko laina otettu vai ei.
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
