package penanloma;

import javax.swing.JOptionPane;
public class PenaThaimaa {
    
    private PenaOlio pena; 
    
    public void thaimaaAlku(){
        PenaOlio pena = new PenaOlio();
        String thaimaaMenu = "Matka Thaimaahan alkakoon! \n"
        +"Uuvuttavan 14h lennon jälkeen saavut Bangkokin lentokentälle nyt saat valita mitä tehdään\n"
        +"1. Otan taksin hotellille\n"
        +"2. Kävelen hotellille (Aurinkoa matkalla)\n"
        +"3. Liftaan hotellille\n";
        
        String valinnat = "Olet hotellilla, Hotellin katolla on uima-allas ja ulkona paistaa aurinko mitä haluat tehdä seuraavaksi?\n"
                +"1. Suuntaan altaalle! "
                +"2. Tutustun alueeseen!"
                +"4. Vuokraan kulkuvälineen";
        String allas = "Saavut altaalle...";
        String alue = "Lähdet kävelemään Khaosan roadia pitkin ja nopealla silmäyksellä löydät paljon kaikkea kiinnostavaa:\n"
                +"Mieleni tekee olutta"
                +"Palaan hotellille";
        String Vuokra = ""
        int valinta;
        String lukuStr;
        
        lukuStr = JOptionPane.showInputDialog(thaimaaMenu);
        valinta = Integer.parseInt(lukuStr);
        
        // PENA HOTELLILLA TULOSTE KAIKISSA MUISTA MUUTTAA!!
            switch (valinta){

                case 1: JOptionPane.showMessageDialog(null, "Olet hotellilla");
                    pena.otaRahaa(10);
                    break;
                case 2: JOptionPane.showMessageDialog(null, "Olet hotellilla");
                    pena.lisääEeppisyyttä(1);
                    break;
                case 3: JOptionPane.showMessageDialog(null, "Olet hotellilla");
                    pena.lisääEeppisyyttä(2);
                    break;
        }
        
        
    }
   
}
