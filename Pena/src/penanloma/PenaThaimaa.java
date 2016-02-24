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
                +"7. Lähden yöelämään! \n "
                +"8. Lähden retkelle! \n "
                +"9. Päätän lähteä hakemaan seuralaista loman ajaksi.(maksullinne nainen 200€) \n"
                +"10. Otan lainan (+ 500€). \n "
                +"11. Näytä rahatilanne.";
        
                // muutin yllä olevan 4:n 3:ksi -jari
        String allas = "Saavut altaalle...";
        
        String alue = "Lähdet kävelemään Khaosan roadia pitkin ja nopealla silmäyksellä löydät paljon kaikkea kiinnostavaa:\n"
                +"1. Mieleni tekee olutta"
                +"2. Päätän lähteä shoppailemaan"
                +"3. Ostan jotain purtavaa "
                +"4. Palaan hotellille";
        
        String Vuokra = "Päätät vuokrata kulkuvälineen:\n"
                +"1. Vuokraan skootterin! "
                +"2. Vuokraan Pyörän!"
                +"3. Vuokraan mönkijän! ";
        
        String ruoka = "Päätät lähteä syömään, missä haluat käydä syömässä? \n"
                +"1. McDonald's \n"
                +"2. Hieno ravintola (5* illallinen) \n"
                +"3. Ostan ruokaa katukojusta \n"
                +"4. Käyt syömässä perinteisen thaimaalaisen menun. \n";
        
        String hieronta = "Päätit ottaa hieronnan: \n"
                +"1. Otat päähieronnan. \n"
                +"2. Otat thaihieronnan. \n"
                +"3. Otat kuumakivihieronnan. \n"
                +"4. Otat jalkahieronnan. \n"
                +"5. Otat akupunktiohoidon. \n";
        
        String kuntosali = "päätit lähteä kuntoilemaan! \n"
                +"1. Päätät mennä spinning tunnille! \n"
                +"2. Päätät nostaa rautaa yksin. \n "
                +"3. Päätät sluibata ja ottaa vain kuvia itsestäsi. \n"
                +"4. Päätät mennä joogaan \n";
        
        String yöelämä = "Päätit lähteä katsastamaan Bangkokin yöelämää! \n"
                +"1. Päädyt hotellisi klubille, jossa on paikallinen huippu dj soittamassa. \n "
                +"2. Lähdet Bangkokin suurimmalle casinolle! \n"
                +"3. Lähdet Strippi klubille! \n"
                +"4. Päädyt rentoon baariin jossa viihdyt loppuillan! \n";
        
        String retki = "Päätit lähteä retkelle ja pois Bagkokin melusta! \n"
                +"1. Päätän lähteä kiertelemään museoita. \n"
                +"2. Showtime! Päätät käydä katsomassa calypso cabareen (tunnettu ladyboyshow)."
                +"3. Päätän lähteä katsomaan thainyrkkeilyiltaa. \n"
                +"4. Lähdet illallisristeilylle Chao Phraya joelle! \n"
                +"5. Lähdet veneristeilylle. \n"
                +"6. Lähdet norsusafarille. \n ";
        
        String seuralainen = "Päätit lähteä hakemaan itsellesi seuralaista, Pena vaimosi eipidä tästä!! \n"
                +"1. Valitset seuralaiseksi aasialaisen naisen \n"
                +"2. Valitset seuralaiseksi eurooppalaisen naisen \n"
                +"3. Valitset seuralaiseksi Venäläisein naisen \n"
                +"4. Omatunto kolkuttaa, en haluakkaan! \n";
        
                
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
