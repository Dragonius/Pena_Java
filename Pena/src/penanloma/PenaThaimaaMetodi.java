
package penanloma;
import javax.swing.JOptionPane;

public class PenaThaimaaMetodi {

    private PenaOlio pena;
    int random;

    public void allas(int valinta, PenaOlio penaO) {
        /*+"1. Otan aurinkoa koko loppupäivän altaalla (mahdollisuus palaa)\n"
         +"2. Menen allasbaariin ja juot itsesi humalaan \n"
         +"3. Pelaan altaalla pelejä ja löydät uusia kavereita!";*/
        switch (valinta) {
            case 1:
                penaO.lisääAika(1);
                random = (1 + (int) (Math.random()*2));
            if (random == 1){
                penaO.vähennäEeppisyyttä(10);
                JOptionPane.showMessageDialog(null, "Nukahdit aurinkoon ja paloit");
            }
            else{
                JOptionPane.showMessageDialog(null, "Kehosi on ruskea kuin kreikkalaisella adoniksella");
                penaO.lisääEeppisyyttä(10);
                        }
                break;
            case 2:
                random = (1 + (int) (Math.random()*3));
            if (random == 1){
                penaO.vähennäEeppisyyttä(10);
                penaO.otaRahaa(150);
                JOptionPane.showMessageDialog(null, "Joit täysin yli rajojesi ja sait illasta muistoksi vain 100e laskun.");
            }
            else if(random == 2){
                penaO.otaRahaa(30);
                JOptionPane.showMessageDialog(null, "Löysit baarista seuralaisen, loppuillasta ei kerrottavaa jälkipolville");
                penaO.lisääEeppisyyttä(15);
                        }
            else{
                penaO.lisääEeppisyyttä(10);
                penaO.otaRahaa(50);
                JOptionPane.showMessageDialog(null, "Vietit mukavan illan Brittiseurueen kanssa!");
                
                    
                    }
        

                break;
            case 3:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }

    }

    public void alue(int valinta, PenaOlio penaO) {
        /* +"1. Mieleni tekee olutta \n"
         +"2. Päätät lähteä shoppailemaan \n"
         +"3. Ostan jotain purtavaa \n"
         +"4. Palaan hotellille \n"; */

        switch (valinta) {
            case 1:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:

                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }
    }

    public void vuokra(int valinta, PenaOlio penaO) {

        /*+"1. Vuokraan skootterin! \n"
         +"2. Vuokraan Pyörän! \n"
         +"3. Vuokraan mönkijän! \n"; */
        switch (valinta) {
            case 1:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;

        }
    }

    public void ruoka(int valinta, PenaOlio penaO) {
        /*+"1. McDonald's \n"
         +"2. Hieno ravintola (5* illallinen) \n"
         +"3. Ostan ruokaa katukojusta \n"
         +"4. Käyt syömässä perinteisen thaimaalaisen menun. \n";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");

                break;
            case 4:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }

    }

    public void hieronta(int valinta, PenaOlio penaO) {
        /*+"1. Otan päähieronnan. \n"
         +"2. Otan thaihieronnan. \n"
         +"3. Otan kuumakivihieronnan. \n"
         +"4. Otan jalkahieronnan. \n"
         +"5. Otan akupunktiohoidon. \n";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 5:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }

    }

    public void kuntosali(int valinta, PenaOlio penaO) {
        /*+"1. Päätän mennä spinning tunnille! \n"
         +"2. Päätän nostaa rautaa yksin. \n "
         +"3. Päätän sluibata ja ottaa vain kuvia itsestäsi. \n"
         +"4. Päätän mennä joogaan \n";
        
         OTTAA RAHAN JO VALITTAESSA
         */
        switch (valinta) {
            case 1:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }
    }

    public void yöelämä(int valinta, PenaOlio penaO) {
        /*+"1. Menen hotellini klubille, jossa on paikallinen huippu dj soittamassa. \n "
         +"2. Lähden Bangkokin suurimmalle casinolle! \n"
         +"3. Lähden Strippi klubille! \n"
         +"4. Päädyn rentoon baariin jossa viihdyn loppuillan! \n";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(20);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.otaRahaa(20);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.otaRahaa(100);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:
                penaO.otaRahaa(20);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }
    }

    public void retki(int valinta, PenaOlio penaO) {
        /*+"1. Päätän lähteä kiertelemään museoita. \n"
         +"2. Showtime! Päätät käydä katsomassa calypso cabareen(tunnettu ladyboyshow).\n"
         +"3. Päätän lähteä katsomaan thainyrkkeilyiltaa. \n"
         +"4. Lähden illallisristeilylle Chao Phraya joelle! \n"
         +"5. Lähden veneristeilylle. \n"
         +"6. Lähden norsusafarille. \n ";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }
    }

    public void seuralainen(int valinta, PenaOlio penaO) {
        /*+"1. Valitsen seuralaiseksi paikallisen naisen \n"
         +"2. Valitsen seuralaiseksi Jessican (eurooppalainen, vaalea prinsessa )  \n"
         +"3. Valitsen seuralaiseksi Irinan (amerikkalainen, tumma ja tulinen)\n"
         +"4. Valitsen seuralaiseksi Jonkun muun! \n";
         OTTAA RAHAN JO VALITTAESSA!
         */
        switch (valinta) {
            case 1:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 2:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 3:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;
            case 4:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "");
                break;

        }

    }
}
