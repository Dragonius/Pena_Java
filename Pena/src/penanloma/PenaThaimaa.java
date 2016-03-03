package penanloma;

import javax.swing.JOptionPane;

public class PenaThaimaa {

    int random;
    private PenaOlio pena;
    private PenaThaimaaMetodi thaimaaMetodit;

    public void thaimaaAlku(PenaOlio penaO) {
        PenaThaimaaMetodi metodit = new PenaThaimaaMetodi();
        PenaKontrolleri kontrolleri = new PenaKontrolleri();
        
        String thaimaaMenu = "Matka Thaimaahan alkakoon! \n"
                + "Uuvuttavan 14h lennon jälkeen saavut Bangkokin lentokentälle nyt saat valita mitä tehdään\n"
                + "1. Otan taksin hotellille\n"
                + "2. Kävelen hotellille (Aurinkoa matkalla)\n"
                + "3. Liftaan hotellille\n";

        String allas = "Saavut altaalle...\n"
                + "1. Otan aurinkoa koko loppupäivän altaalla (mahdollisuus palaa)\n"
                + "2. Menet allasbaariin ja juot itsesi humalaan \n"
                + "3. Pelaan altaalla pelejä ja löydät uusia kavereita!";

        String alue = "Lähdet kävelemään Khaosan roadia pitkin ja nopealla silmäyksellä löydät paljon kaikkea kiinnostavaa:\n"
                + "1. Mieleni tekee olutta \n"
                + "2. Päätät lähteä shoppailemaan \n"
                + "3. Ostan jotain purtavaa \n"
                + "4. Palaan hotellille \n";

        String vuokra = "Päätät vuokrata kulkuvälineen:\n"
                + "1. Vuokraan skootterin! \n"
                + "2. Vuokraan Pyörän! \n"
                + "3. Vuokraan mönkijän! \n";

        String ruoka = "Päätät lähteä syömään, missä haluat käydä syömässä? \n"
                + "1. McDonald's \n"
                + "2. Hieno ravintola (5* illallinen) \n"
                + "3. Ostan ruokaa katukojusta \n"
                + "4. Käyt syömässä perinteisen thaimaalaisen menun. \n";

        String hieronta = "Päätit ottaa hieronnan: \n"
                + "1. Otan päähieronnan. \n"
                + "2. Otan thaihieronnan. \n"
                + "3. Otan kuumakivihieronnan. \n"
                + "4. Otan jalkahieronnan. \n"
                + "5. Otan akupunktiohoidon. \n";

        String kuntosali = "päätit lähteä kuntoilemaan! \n"
                + "1. Päätän mennä spinning tunnille! \n"
                + "2. Päätän nostaa rautaa yksin. \n "
                + "3. Päätän sluibata ja ottaa vain kuvia itsestäsi. \n"
                + "4. Päätän mennä joogaan \n";

        String yöelämä = "Päätit lähteä katsastamaan Bangkokin yöelämää! \n"
                + "1. Menen hotellini klubille, jossa on paikallinen huippu dj soittamassa. \n "
                + "2. Lähden Bangkokin suurimmalle casinolle! \n"
                + "3. Lähden Strippi klubille! \n"
                + "4. Päädyn rentoon baariin jossa viihdyn loppuillan! \n";

        String retki = "Päätit lähteä retkelle! \n"
                + "1. Päätän lähteä kiertelemään museoita. \n"
                + "2. Showtime! Päätät käydä katsomassa calypso cabareen(tunnettu ladyboyshow).\n"
                + "3. Päätän lähteä katsomaan thainyrkkeilyiltaa. \n"
                + "4. Lähden illallisristeilylle Chao Phraya joelle! \n"
                + "5. Lähden veneristeilylle. \n"
                + "6. Lähden norsusafarille. \n ";

        String seuralainen = "Huikeaa Pena! Päätit lähteä hakemaan itsellesi seuralaista, Peto on irti!! \n"
                + "1. Valitsen seuralaiseksi paikallisen naisen \n"
                + "2. Valitsen seuralaiseksi Jessican (eurooppalainen, vaalea prinsessa )  \n"
                + "3. Valitsen seuralaiseksi Irinan (amerikkalainen, tumma ja tulinen)\n"
                + "4. Valitsen seuralaiseksi Jonkun muun! \n";

        int valinta;
        String lukuStr;
        int aktiviteettivalinta;

        lukuStr = JOptionPane.showInputDialog(thaimaaMenu);
        valinta = Integer.parseInt(lukuStr);


        do {

            lukuStr = JOptionPane.showInputDialog("Olet hotellilla, Hotellin katolla on uima-allas ja ulkona paistaa aurinko mitä haluat tehdä seuraavaksi?\n"
                    + "Lomasi on kestänyt " + penaO.getAika() + " päivää \n"
                    + "1. Suuntaan altaalle! \n"
                    + "2. Tutustun alueeseen! \n"
                    + "3. Vuokraan kulkuvälineen! \n"
                    + "4. Lähden syömään! \n"
                    + "5. Lähden hierontaan! \n"
                    + "6. Lähden kuntosalille! \n"
                    + "7. Lähden yöelämään! \n"
                    + "8. Lähden retkelle! \n"
                    + "9. Päätän lähteä hakemaan seuralaista loman ajaksi. (maksullinen nainen 200€) \n"
                    + "10. Otan lainan (+ 500€). \n"
                    + "11. Näytä rahatilanne. \n"
                    + "12. Lopeta loma.");

            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {

                case 1:
                    lukuStr=JOptionPane.showInputDialog(null, allas);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.allas(aktiviteettivalinta, penaO);
                    break;

                case 2:
                    lukuStr=JOptionPane.showInputDialog(null, alue);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.alue(aktiviteettivalinta, penaO);
                    break;

                case 3:
                   lukuStr=JOptionPane.showInputDialog(null, vuokra);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.vuokra(aktiviteettivalinta, penaO);
                    break;

                case 4:
                    lukuStr=JOptionPane.showInputDialog(null, ruoka);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.ruoka(aktiviteettivalinta, penaO);
                    break;

                case 5:
                    lukuStr=JOptionPane.showInputDialog(null, hieronta);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.hieronta(aktiviteettivalinta, penaO);
                    break;

                case 6:
                    lukuStr=JOptionPane.showInputDialog(null, kuntosali);
                    penaO.otaRahaa(10);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.kuntosali(aktiviteettivalinta, penaO);
                    break;

                case 7:
                    lukuStr=JOptionPane.showInputDialog(null, yöelämä);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.yöelämä(aktiviteettivalinta, penaO);
                    break;

                case 8:
                    lukuStr=JOptionPane.showInputDialog(null, retki);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    metodit.retki(aktiviteettivalinta, penaO);
                    break;

                case 9:
                    lukuStr=JOptionPane.showInputDialog(null, seuralainen);
                    aktiviteettivalinta = Integer.parseInt(lukuStr);
                    penaO.otaRahaa(200);
                    metodit.seuralainen(aktiviteettivalinta, penaO);
                    break;

                case 10:
                    penaO.otaLaina();
                    break;

                case 11:
                    JOptionPane.showMessageDialog(null, "Rahatilanne:" + penaO.getRahat());
                    break;
                case 12: JOptionPane.showMessageDialog(null, "Loma peruttu, Maanantaina duuniin!");
                    penaO.setRahat(0);  
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Väärä valinta!");
            }
        } // niin kauan kuin penan aika on vähemmän kuin 10 ja raha on enemän kuin 0
        while (penaO.getAika() <= 10 && penaO.getRahat() > 0);

    }
}
