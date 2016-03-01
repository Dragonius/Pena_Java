package penanloma;

import javax.swing.JOptionPane;

public class PenaThaimaaMetodi {

    private PenaOlio pena;

    public void allas(int valinta, PenaOlio penaO) {
        int random;
        

        /*+"1. Otan aurinkoa koko loppupäivän altaalla (mahdollisuus palaa)\n"
         +"2. Menen allasbaariin ja juot itsesi humalaan \n"
         +"3. Pelaan altaalla pelejä ja löydät uusia kavereita!";*/
        switch (valinta) {
            case 1:
                penaO.lisääAika(1);

                random = (1 + (int) (Math.random() * 3));

                if (random == 1) {
                    penaO.vähennäEeppisyyttä(10);
                    JOptionPane.showMessageDialog(null, "Nukahdit aurinkoon ja paloit");
                } else {
                    JOptionPane.showMessageDialog(null, "Kehosi on ruskea kuin kreikkalaisella adoniksella");
                    penaO.lisääEeppisyyttä(10);
                    
                }
            break;
                
            case 2:
                random = (1 + (int) (Math.random() * 3));
                if (random == 1) {
                    penaO.vähennäEeppisyyttä(10);
                    penaO.otaRahaa(150);
                    JOptionPane.showMessageDialog(null, "Joit täysin yli rajojesi ja sait illasta muistoksi vain 100e laskun.");
                } else if (random == 2) {
                    penaO.otaRahaa(30);
                    JOptionPane.showMessageDialog(null, "Löysit baarista seuralaisen, loppuillasta ei kerrottavaa jälkipolville");
                    penaO.lisääEeppisyyttä(15);
                } else {
                    penaO.lisääEeppisyyttä(10);
                    penaO.otaRahaa(50);
                    JOptionPane.showMessageDialog(null, "Vietit mukavan illan Brittiseurueen kanssa!");
                    
                }
                 break;
              
            case 3:
                penaO.lisääEeppisyyttä(5);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Pelasit koko päivän altaalla pelejä uusien ystävien kanssa");
                break;
                default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
                   

        }

    }

    public void alue(int valinta, PenaOlio penaO) {
        int random;
        /* +"1. Mieleni tekee olutta \n"
         +"2. Päätät lähteä shoppailemaan \n"
         +"3. Ostan jotain purtavaa \n"
         +"4. Palaan hotellille \n"; */

        switch (valinta) {
            case 1:
                penaO.otaRahaa(5);
                penaO.lisääEeppisyyttä(10);
                JOptionPane.showMessageDialog(null, "Kylmä huurteinen parantaa aina mieltä!");
                break;
            case 2:penaO.lisääAika(1);
            random = (1 + (int) (Math.random() * 3));
            if (random == 1){
                JOptionPane.showMessageDialog(null, "Katukauppias huijasi sinulta 20e");
                penaO.otaRahaa(20);
                penaO.vähennäEeppisyyttä(5);
            }else{
                JOptionPane.showMessageDialog(null, "Löysit pari hyvää 'aitoa' Niken paitaa");
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
            }
              
                break;
            case 3:
                penaO.otaRahaa(5);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "Ostit maukkaan kana kebabin katukojusta");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Tutustuit alueeseen ja päätit palata hotellille");
                penaO.lisääEeppisyyttä(1);
                break;
            default: JOptionPane.showMessageDialog(null, "väärä valinta!");
        }
    }

    public void vuokra(int valinta, PenaOlio penaO) {
      
        /*+"1. Vuokraan skootterin! \n"
         +"2. Vuokraan Pyörän! \n"
         +"3. Vuokraan mönkijän! \n"; */
        switch (valinta) {
            case 1:
                penaO.lisääAika(1);
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "Vuokrasit skootterin ja tutustuit alueeseen koko päivän");

                break;
            case 2:
                penaO.lisääAika(1);
                penaO.otaRahaa(5);
                penaO.lisääEeppisyyttä(2);
                JOptionPane.showMessageDialog(null, "Vietit mukavan päivän pyöräillessä ranteteitä pitkin, Tulipa kuuma!");

                break;
            case 3:
              penaO.otaRahaa(50);
              penaO.vähennäEeppisyyttä(5);
              JOptionPane.showMessageDialog(null, "Olit vuokraamassa mönkijää mutta jouduit huijauksen kohteeksi!");
              break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");


        }
    }

    public void ruoka(int valinta, PenaOlio penaO) {
        int random;
        /*+"1. McDonald's \n"
         +"2. Hieno ravintola (5* illallinen) \n"
         +"3. Ostan ruokaa katukojusta \n"
         +"4. Käyt syömässä perinteisen thaimaalaisen menun. \n";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(10);
                penaO.vähennäEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "Kävit mäkkärissä syömässä pikaruokaa, totesit valinnan huonoksi jo tilatessassi");

                break;
            case 2:
                penaO.otaRahaa(50);
                penaO.lisääEeppisyyttä(5);
                JOptionPane.showMessageDialog(null, "Kävit nauttimasssa elämäsi parhaan kolmen ruokalajin meriruoka menun");

                break;
            case 3:
                random = (1 + (int) (Math.random() * 3));
                if (random == 1){
                    JOptionPane.showMessageDialog(null, "Ostit kadulta ruokaa ja sait ruokamyrkytyksen!");
                    penaO.otaRahaa(5);
                    penaO.vähennäEeppisyyttä(2);
                }else{
                    JOptionPane.showMessageDialog(null, "Olipa maukas nuudelikeitto! nam!");
                    penaO.otaRahaa(5);
                    penaO.lisääEeppisyyttä(1);
                }

                break;
            case 4:
                penaO.otaRahaa(15);
                penaO.lisääEeppisyyttä(1);
                JOptionPane.showMessageDialog(null, "Menit TripAdvisorin suosittelemaan thaimaalaiseen ravintolaan syömään rapuja!");
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
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit valita päähieronnan, tuntuipa mukavalta");
                break;
            case 2:
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit valita thaihieronnan, tunnet hyvää oloa koko kehossasi");
                break;
            case 3:
                penaO.otaRahaa(10);
                penaO.vähennäEeppisyyttä(3);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit valita kuumakivihieronnan, hieroja oli ammattitaidoton ja poltti nahkasi selästä");
                break;
            case 4:
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit valita jalkahieronnan, kylläpä kelpaa taas kävellä");
                break;
            case 5:
                penaO.otaRahaa(10);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit valita akupunktiohoidon, päästiinpä ainakin hetkeksi vuosia vaivanneesta selkäkivusta");
                break;
            default: JOptionPane.showMessageDialog(null, "väärä valinta!");
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
                JOptionPane.showMessageDialog(null, "Päätit mennä suositulle spinnig tunnille, olipa rankkaa!");
                break;
            case 2:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit mennä salille yksin rimpuilemaan ja reväytit olkapääsi! Tekeepä kipeää...");
                break;
            case 3:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Eilinen ilta painoi vielä päälle ja päätit ottaa vain kuvia salilla...");
                break;
            case 4:
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Vietit rentouttavat pari tuntia joogatessa!");
                break;
                default: JOptionPane.showMessageDialog(null, "Väärä valinta");
        }
    }

    public void yöelämä(int valinta, PenaOlio penaO) {
        int random;
    
        /*+"1. Menen hotellini klubille, jossa on paikallinen huippu dj soittamassa. \n "
         +"2. Lähden Bangkokin suurimmalle casinolle! \n"
         +"3. Lähden Strippi klubille! \n"
         +"4. Päädyn rentoon baariin jossa viihdyn loppuillan! \n";*/
        switch (valinta) {
            case 1:
                penaO.otaRahaa(50);
                penaO.lisääEeppisyyttä(5);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Huhhuh mikä ilta...Huippu dj ja mikä meno!!");
                break;
            case 2:
                penaO.otaRahaa(150);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Epic night! Muistikuvat vähissä ja rahaa paloi!");
                break;
            case 3:
                penaO.otaRahaa(100);
                penaO.lisääAika(1);
                random = (1 + (int) (Math.random() * 3));
                if (random == 1){
                JOptionPane.showMessageDialog(null,"Jouduit huijatuksi strippiklubilla, ");
                penaO.vähennäEeppisyyttä(5);
                }else{
                JOptionPane.showMessageDialog(null, "Vietit huikean illan strippiklubilla monen naisen seurassa. Nice! ");
                penaO.lisääEeppisyyttä(5);
                           
                }
                 break;
                 
            case 4:
                penaO.otaRahaa(20);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Vietit illan rennosti baarissa britti ystäviesi seurassa.");
                break;
            default:  JOptionPane.showMessageDialog(null, "Väärä valinta!");

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
                JOptionPane.showMessageDialog(null, "Kiertelit mitä erikoisempia museoita, mikä päivä!");
                break;
            case 2:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Melkoinen show! En ollut uskoa silmiäni showta katsoessa. 9+!");
                break;
            case 3:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Mikä thainyrkkeily ilta, nyrkit heilu ja posket tummu!");
                break;
            case 4:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Vietit mitä mainioimman risteilyn syöden lomasi parhaan menun!");
                break;
                
            case 5:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Vietit upean päivän joki risteilyllä syöden, juoden ja leväten. nyt jaksaa taas bailata!");
                break;
                
            case 6:
                penaO.otaRahaa(1);
                penaO.lisääEeppisyyttä(1);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Vietit elämyksellisen päivän syöttäen norsuja sekä ratsastaen niillä, norsu rodeota unohtamatta! ");
                break;
            default: JOptionPane.showMessageDialog(null," Väärä valinta!");

        }
    }

    public void seuralainen(int valinta, PenaOlio penaO) {
        int random;
    
        /*+"1. Valitsen seuralaiseksi paikallisen naisen \n"
         +"2. Valitsen seuralaiseksi Jessican (eurooppalainen, vaalea prinsessa )  \n"
         +"3. Valitsen seuralaiseksi Irinan (amerikkalainen, tumma ja tulinen)\n"
         +"4. Valitsen seuralaiseksi Jonkun muun! \n";
         OTTAA RAHAN JO VALITTAESSA!
         */
        switch (valinta) {
            case 1:
                penaO.lisääEeppisyyttä(10);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit hakea itsellesi loman ajaksi seuralaisen! NICE! \n"
                +"Päädyit valitsemaan itsellesi paikallisen naisen.");
                break;
            case 2:
                penaO.lisääEeppisyyttä(10);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit hakea itsellesi loman ajaksi saeuralaisen! NICE! \n "
                +"Päädyit vaaleaan ruotsalais syntyiseen kaunottareen nimeltä Jessica.");
                break;
            case 3:
                penaO.lisääEeppisyyttä(10);
                penaO.lisääAika(1);
                JOptionPane.showMessageDialog(null, "Päätit hakea itsellesi loman ajaksi saeuralaisen! NICE! \n"
                +"Päädyit tummaan ja tuliseen amerikkalaistaustaiseen Irinaan.");
                break;
            case 4:                       
                penaO.lisääAika(1);
                random = (1 + (int) (Math.random() * 3));
                if (random == 1){
                JOptionPane.showMessageDialog(null, "Valitsit sokkona seuralaisen ja tämän seurauksena sait seuralaiseksi ladyboyn. HUPS!! Mikä emämoka Pena! ");
                penaO.vähennäEeppisyyttä(10);
                }else {
                   JOptionPane.showMessageDialog(null,"Päätit hakea itsellesi loman ajaksi saeuralaisen! NICE! \n"
                +"Päädyit valitsemaan seuralaisen sokkona! Sait seuralaiseksi kauniin naisen.");
                penaO.lisääEeppisyyttä(15);   
                }
                break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
                

        }
    }
    }

