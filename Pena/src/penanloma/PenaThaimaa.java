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
                +"1. Suuntaan altaalle! \n"
                +"2. Tutustun alueeseen! \n"
                +"3. Vuokraan kulkuvälineen! \n "
                +"4. Lähden syömään! \n"
                +"5. Lähden hierontaan! \n "
                +"6. Lähden kuntosalille! \n "
                +"7. "
                +"10. Otan lainan (+ 500€). \n ";
                // muutin yllä olevan 4:n 3:ksi -jari
        String allas = "Saavut altaalle...";
        String alue = "Lähdet kävelemään Khaosan roadia pitkin ja nopealla silmäyksellä löydät paljon kaikkea kiinnostavaa:\n"
                +"1. Mieleni tekee olutta"
                +"2. Päätän lähteä shoppailemaan"
                +"3. Ostan jotain purtavaa "
                +"4. Palaan hotellille";
        String Vuokra = "Päätät vuokrata kulkuvälineen:\n"
                +"1. Vuokraat skootterin! "
                +"2. Vuokraat Pyörän!"
                +"3. Vuokraat mönkijän! ";
        String ruoka = "Päätät lähteä syömään, missä käyt syömässä? \n"
                +"1. McDonald's \n"
                +"2. Hieno ravintola (5* illallinen) \n"
                +"3. Ostan ruokaa katukojusta \n"
                +"4. Käyt syömässä perinteisen thaimaalaisen menun. \n";
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
        //Olet Nyt hotelilla ja alat tehdä MITÄ? -jari
        switch (valinta){
            case 1: JOptionPane.showMessageDialog(null, valinnat);
            break;
            case 2: JOptionPane.showMessageDialog(null, valinnat);
            break;
            case 3: JOptionPane.showMessageDialog(null, valinnat);
            break;
            case 4: JOptionPane.showMessageDialog(null, valinnat);
            break;
            case 5: JOptionPane.showMessageDialog(null, valinnat);
            break;
        }
        
        
    }
   
}
