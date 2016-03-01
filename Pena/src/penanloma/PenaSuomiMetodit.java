package penanloma;
import javax.swing.JOptionPane;


public class PenaSuomiMetodit {
    private PenaOlio pena;
    private int naisystävä = 0;
    
    public void baari(int valinta, PenaOlio penaO){
        int random;

   //             + "1. Karaoke-baari \n"
//                + "2. Perus pubi \n"
//                + "3. Yökerho \n";

        switch (valinta){
            case 1: penaO.otaRahaa(48);
            penaO.lisääEeppisyyttä(6 + (int) (Math.random()*4));
            penaO.lisääAika(1);
            JOptionPane.showMessageDialog(null, "Oikein mukava karaokeilta vietetty!");
            break;
            case 2: penaO.otaRahaa(40);
            penaO.lisääEeppisyyttä(3 + (int) (Math.random()*7));
            penaO.lisääAika(1);
            JOptionPane.showMessageDialog(null,"Vietit kivan iltaman kavereiden kanssa!");
            break;
            case 3: penaO.otaRahaa(80);
            penaO.lisääEeppisyyttä(7);
            random = (1 + (int) (Math.random()*2));
            if (random == 1){
                penaO.lisääEeppisyyttä(10);
                JOptionPane.showMessageDialog(null, "Sait yökerhosta naisen kotiisi yöksi. NICE!");
                naisystävä = 1;
                
            } else{
                JOptionPane.showMessageDialog(null, "Hyvät jyskeet oli yökerhossa!");
            }
            penaO.lisääAika(1);
            break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
  
    }

}
    public void keilaus(int valinta, PenaOlio penaO){
        int random;
 //       "Kaverisi ehdottavat viidenkympin vedonlyöntiä keilaillasta. Suostutko?\n"
   //             + "1. Suostun\n"
     //           + "2. En suostu";
     switch (valinta){
         case 1: penaO.otaRahaa(65);
         random = (1 + (int) + (Math.random()*9));
         if (random >=1 && random <5){
             penaO.lisääRahaa(100);
             penaO.lisääEeppisyyttä(12);
             JOptionPane.showMessageDialog(null, "Voitit keilakisan! Onneksi olkoon!");
             
         }else{
             penaO.lisääEeppisyyttä(2);
             JOptionPane.showMessageDialog(null, "Hävisit keilakisan. Voi harmi!");
         }
         penaO.lisääAika(1);
         break;
         case 2: penaO.otaRahaa(15);
         penaO.lisääEeppisyyttä(6);
         JOptionPane.showMessageDialog(null, "Vietit mukavan keilaillan.");
         penaO.lisääAika(1);
         break;
         default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
     }
     
    }
    public void koti(int valinta, PenaOlio penaO){
//               + "1. Netflix and chill\n"
  //              + "2. Pelaan videopelejä\n"
    //            + "3. Siivoan ja tiskaan \n"
      //          + "4. Luen kirjaa \n";
      switch (valinta){
          case 1: if (naisystävä == 1){
              penaO.lisääEeppisyyttä(10);
              JOptionPane.showMessageDialog(null, "Kutsuit naisen, jonka nappasit baarista aikaisemmin, kanssasi katsomaan Netflixiä.");
          }else{
              penaO.lisääEeppisyyttä(5);
              JOptionPane.showMessageDialog(null, "Rauhallinen Netflix-ilta yksin.");
          }
          penaO.lisääAika(1);
          break;
          case 2: penaO.lisääEeppisyyttä(6);
          penaO.lisääAika(1);
          JOptionPane.showMessageDialog(null, "Kivan peli-illan vietit.");
          break;
          case 3: penaO.lisääEeppisyyttä(1);
          penaO.lisääAika(1);
          JOptionPane.showMessageDialog(null, "Siivosit ja tiskasit? Olipa tylsää.");
          break;
          case 4: penaO.lisääEeppisyyttä(3);
          penaO.lisääAika(1);
          JOptionPane.showMessageDialog(null, "Luit hyvää kirjaa koko päivän.");
          default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
                  
      }
      
    }
    public void ruoka(int valinta, PenaOlio penaO){
        int random;
        //        "Missä käyt syömässä?\n"
//                + "1. Pizzeria \n"
//                + "2. Hieno ravintola \n"
//                + "3. McDonald's \n"
//                + "4. Nakkigrilli \n";

        switch (valinta){
            case 1: penaO.otaRahaa(15);
            random = (1 + (int) (Math.random()*9));
            if (random == 3){
                penaO.vähennäEeppisyyttä(7);
                JOptionPane.showMessageDialog(null, "Sait ruokamyrkytyksen :(");
                
            }else{
                penaO.lisääEeppisyyttä(7);
                JOptionPane.showMessageDialog(null,"Nam nam! Hyvää pizzaa!");
            }
            penaO.lisääAika(1);
            break;
            case 2: if (naisystävä ==1){
                penaO.otaRahaa(180);
                penaO.lisääEeppisyyttä(16);
                JOptionPane.showMessageDialog(null, "Veit aikaisemmin baarista nappaamasi neidon syömään hienoa ruokaa. Mahtavat treffit!");
            }else{
                penaO.otaRahaa(90);
                penaO.lisääEeppisyyttä(8);
                JOptionPane.showMessageDialog(null, "Kävit yksin syömässä mahtavaa fine dining-ruokaa!");
                
            }
            penaO.lisääAika(1);
            break;
            case 3: penaO.otaRahaa(10);
            random = (1 +(int) (Math.random()*3));
            if (random == 2){
                penaO.vähennäEeppisyyttä(10);
                JOptionPane.showMessageDialog(null, "Söit kymmenen euron juustoa. Nyt on todella huono olo :s");
                
            }else{
                penaO.lisääEeppisyyttä(9);
                JOptionPane.showMessageDialog(null, "Söit kymmenen euron juustoa eikä tunnu missään! Kova jätkä!");
            }
            penaO.lisääAika(1);
            break;
            case 4: penaO.otaRahaa(8);
            random = (1 +(int) (Math.random()*3));
            if (random == 2){
                penaO.vähennäEeppisyyttä(5);
                JOptionPane.showMessageDialog(null, "Sait ruokamyrkytyksen. Oivoi!");
            }else {
                penaO.lisääEeppisyyttä(3);
                JOptionPane.showMessageDialog(null, "Söit nakkikiskalla. Ihan kohtuullista safkaa.");
            }
            penaO.lisääAika(1);
            break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
            }
                
            }
    public void urheilu(int valinta, PenaOlio penaO){
        int random;
//        "Miten haluat urheilla? \n"
//                + "1. Käyn lenkillä \n"
//                + "2. Menen salille \n"
//                + "3. Menen pelaamaan jalkapalloa kavereiden kanssa";
        switch (valinta){
            case 1: random = (1 + (int) (Math.random()*9));
            if (random ==4){
                penaO.vähennäEeppisyyttä(4);
                JOptionPane.showMessageDialog(null, "Revyäytit nilkkasi lenkillä. Aijai!");
            }else{
                penaO.lisääEeppisyyttä(5);
                JOptionPane.showMessageDialog(null, "Virkistävä lenkki!");
            }
            penaO.lisääAika(1);
                break;
            case 2: random = (1 + (int) (Math.random()*9));
            if (random ==4){
                penaO.vähennäEeppisyyttä(4);
                JOptionPane.showMessageDialog(null, "Revyäytit nilkkasi salilla. Aijai!");
            }else{
                penaO.lisääEeppisyyttä(6);
                JOptionPane.showMessageDialog(null, "Salilla käyminen piristi!");
            }
                break;
            case 3: random = (1 + (int) (Math.random()*5));
            if (random == 6){
                penaO.lisääEeppisyyttä(4);
                JOptionPane.showMessageDialog(null, "Satutit jalkasi pelatessa, mutta hauskaa oli!");
            }else{
                penaO.lisääEeppisyyttä(8);
                JOptionPane.showMessageDialog(null, "Hauskaa oli kavereiden kanssa pelaillessa!");
                
            }
             penaO.lisääAika(1);
             break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
        }
    }
        public void viro(int valinta, PenaOlio penaO){
        int random;
/*
1. Ekana Tax Freehen ostamaan viinat, hytissä alottelua, sitten tanssimaan baariin ja iskemään naisia!
2. Suoraan baariin juomaan loppuillaksi!
3. Tax Freen kautta loppuillaksi hyttiin murjottamaan.
4. Nukun vain hytissä.
5. Kasinolla pitää käydä!
*/
        switch (valinta){
            case 1: penaO.otaRahaa(180);
                random = (1 + (int) (Math.random()*9));
            if (random ==9){
                penaO.lisääEeppisyyttä(30);
                JOptionPane.showMessageDialog(null, "Hyvin aloitettu ilta jatkui parkettilattialla,"
                + "josta veit hyttiisi seuralaisen ja jatkoit aamulla hymyilen terminaaliin. ");
            }
            else if (random ==1){
                penaO.lisääEeppisyyttä(13);
                JOptionPane.showMessageDialog(null, "Hyvin aloitettu ilta jatkui laiva selliin, jonkun "
                + "aloitettua tappelun kanssasi ");
            }else{
                penaO.lisääEeppisyyttä(15);
                JOptionPane.showMessageDialog(null, "Perusristeily, ei mitään erikoista tapahtunut");
            }
            penaO.lisääAika(1);
            break;
            case 2: penaO.otaRahaa(300);
            random = (1 + (int) (Math.random()*5));
            if (random ==5){
                penaO.lisääEeppisyyttä(13);
                JOptionPane.showMessageDialog(null, "Loppuillasta tiesi vei putkaan! Mitäs läksit!");
            }else{
                penaO.lisääEeppisyyttä(20);
                JOptionPane.showMessageDialog(null, "Hyvä meno oli! Melkosessa humalassa tuli oltua.");
            }
            penaO.lisääAika(1);
            break;
            case 3: penaO.otaRahaa(85);
            random = (1 + (int) (Math.random()*9));
            if (random ==3){
                penaO.vähennäEeppisyyttä(19);
                JOptionPane.showMessageDialog(null, "Ai ai ai. Onnistut tuhoamaan koko lastin kaatumalla laatikoiden päälle.");
            }else{
                penaO.lisääEeppisyyttä(15);
                JOptionPane.showMessageDialog(null, "Näillä juomilla pärjää jo jonkin aikaa!");
            }
            penaO.lisääAika(1);
                break;
            case 4:
            penaO.lisääEeppisyyttä(11);
            JOptionPane.showMessageDialog(null, "Nukuit hytissä ja sait kerrankin nukuttua pitkään.");
            penaO.lisääAika(1);
            break;
            case 5: penaO.otaRahaa(93);
            random = (1 + (int) (Math.random()*9));
            if (random ==3){
            JOptionPane.showMessageDialog(null, "Kasinolla pitää käydä ja sitten menikin enemän kuin piti. voi voi ");
            penaO.otaRahaa(150);
            penaO.vähennäEeppisyyttä(10);
            }
            else if (random ==6){
            JOptionPane.showMessageDialog(null, "Voitto kotiin kasinolla. Rahaa tuli kivasti ");
            penaO.lisääRahaa(400);
            penaO.lisääEeppisyyttä(24);
            }else{
            JOptionPane.showMessageDialog(null," Olihan toi kivaa käydä pelailemassa");
            penaO.lisääEeppisyyttä(15);
            }
            penaO.lisääAika(1);
            break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
                
    }
}
        public void hieronta(int valinta, PenaOlio penaO){
            int random;
            /*"Millaisen hierronnan otat? \n"
                + "1. Thai-hierontaan ajattelin mennä \n"
                + "2. Johonkin ihan perus kokovartalohierontaan \n"
                + "3. Kaveri antaa niskahieronnan";*/
            switch (valinta){
                case 1: penaO.otaRahaa(50);
                random = (1 + (int) (Math.random()*1));
                if (random == 2){
                    penaO.otaRahaa(50);
                    penaO.lisääEeppisyyttä(12);
                    JOptionPane.showMessageDialog(null, "Päätit ottaa Thai-hieronnassa onnellisen lopun. Rohkea valinta!");
                    penaO.lisääAika(1);
                }else{penaO.lisääEeppisyyttä(7);
                JOptionPane.showMessageDialog(null, "Oikein rentouttava hieronta");
                    penaO.lisääAika(1);
                }
                    break;
                case 2: penaO.otaRahaa(65);
                penaO.lisääEeppisyyttä(9);
                JOptionPane.showMessageDialog(null, "Todella rentouttava hieronta");
                penaO.lisääAika(1);
                    break;
                case 3: penaO.lisääEeppisyyttä(2);
                JOptionPane.showMessageDialog(null, "Kaveri ei oikein osannut hieroa. Kai se vähän rentoutti");
                penaO.lisääAika(1);
                    break;
                default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
                
            }
        }
        public void ostos(int valinta, PenaOlio penaO){
            int random;
           /* "Mitäs lähdet ostelee? \n"
                + "1. Vaatteita \n"
                + "2. Ruokakaupassa käväsen \n"
                + "3. Kirpputorille ajattelin mennä \n"
                + "4. Satunnaisesti lähden käymään kaupoilla ja katson mitä tarttuu mukaan."; */
           switch(valinta){
               case 1: penaO.otaRahaa(80);
               penaO.lisääEeppisyyttä(9);
               JOptionPane.showMessageDialog(null,"Löysit kivoja vaatteita kaupoilta");
               penaO.lisääAika(1);
                   break;
               case 2:penaO.otaRahaa(30);
               penaO.lisääEeppisyyttä(4);
               JOptionPane.showMessageDialog(null, "Safkat haettu!");
               penaO.lisääAika(1);
                   break;
               case 3:penaO.otaRahaa(20);
               penaO.lisääEeppisyyttä(5);
               JOptionPane.showMessageDialog(null,"Kirpputorilta löytyi pari kivaa löytöä");
               penaO.lisääAika(1);
                   break;
               case 4: penaO.otaRahaa(100);
               random = (1 + (int) (Math.random()*3));
               if (random == 1){
                   penaO.lisääEeppisyyttä(2);
                   JOptionPane.showMessageDialog(null,"Ostit katukauppiaalta kellon, joka hajosi jo kotimatkalla.");
               }
               if (random == 2){
                   penaO.lisääEeppisyyttä(7);
                   JOptionPane.showMessageDialog(null,"Paljon kaikkea kivaa sälää ostit.");
               }
               if (random == 3){
                   penaO.lisääEeppisyyttä(12);
                   JOptionPane.showMessageDialog(null,"Löysit alennusmyynnin, josta löysit halvalla paljon hyviä vaatteita.");
               }
               if (random == 4){
                   penaO.lisääEeppisyyttä(17);
                   JOptionPane.showMessageDialog(null,"Sait alennuksesta neljänsadan arvoisen puhelimen satasella, kävipä tuuri!");
               }
               penaO.lisääAika(1);
                   break;
               default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
           }
           
        }
        public void rikos(int valinta, PenaOlio penaO){
            int random;
           /* "Millaisen rikoksen teet? \n"
                + "1. Ryöstän Siwan \n"
                + "2. Ryöstän pankin \n"
                + "3. Teen palkkamurhan \n"
                + "4. Murtaudun vanhuksen kotiin \n"
                + "5. Pahoinpitelen ja ryöstän jonkun \n";*/
           switch(valinta){
               case 1: random = (1 + (int) (Math.random()*4));
               if (random == 3){
                   penaO.lisääRahaa(250);
                   penaO.lisääEeppisyyttä(14);
                   JOptionPane.showMessageDialog(null, "Onnistuit ryöstämään Siwan jäämättä kiinni. Saaliiksi sait hurjat 250e!");
                        
               }
               else if (random == 2){
                   penaO.lisääEeppisyyttä(3);
                   JOptionPane.showMessageDialog(null, "Siwan myyjä onnistui estämään ryöstösi, mutta pääsit karkuun.");
               }else{
                   penaO.vähennäEeppisyyttä(5);
                   penaO.otaRahaa(80);
                   JOptionPane.showMessageDialog(null, "Jäit poliiseille kiinni. Sait 80e sakkoja.");
               }
               penaO.lisääAika(1);
                   break;
               case 2: random = (1 + (int) (Math.random()*19));
               if (random == 1){
                   penaO.lisääRahaa(50000);
                   penaO.lisääEeppisyyttä(70);
                   JOptionPane.showMessageDialog(null, "Ryöstit onnistuneesti pankin. Saaliiksi tuli mukaan 50 000e. Hurraa!");
               }
               else if (random == 2){
                   penaO.setRahat(0);
                   penaO.setEeppisyys(0);
                   JOptionPane.showMessageDialog(null, "Ryöstösi epäonnistui ja jäit kiinni poliiseille."
                           + " Joudut vankilaan, joten lomasi taisi olla tässä.");
                   
               }else {JOptionPane.showMessageDialog(null, "Panikoit ryöstön aikana ja ryöstösaalis jäi pankkiin, mutta pääsit karkuun. Olipahan kokemus!");
                       penaO.lisääEeppisyyttä(5);
                       }
               penaO.lisääAika(1);
                   break;
               case 3: random = (1 + (int) (Math.random()*6));
               if (random == 1){
                   penaO.lisääRahaa(1500);
                   penaO.lisääEeppisyyttä(15);
                   JOptionPane.showMessageDialog(null, "Onnistuit murhassa ja tienasit mukavat 1500e");
                   
               }
               else if(random ==2){
                   penaO.vähennäEeppisyyttä(10);
                   JOptionPane.showMessageDialog(null, "Epäonnistuit murhassasi ja nyt joudut pakoilemaan poliiseja!");
               }else{
                   penaO.vähennäEeppisyyttä(5);
                   JOptionPane.showMessageDialog(null, "Onnistuit murhassa, mutta asiakkaasi huijasi sinua, etkä saanut rahoja");
               }
               penaO.lisääAika(1);
                   break;
               case 4:random = (1 + (int) (Math.random()*4));
               if (random == 1){
                   penaO.lisääRahaa(100);
                   penaO.lisääEeppisyyttä(10);
                   JOptionPane.showMessageDialog(null, "Onnistuit ryöstämään vanhuksen kodista sata euroa. Olet varmasti ylpeä itsestäsi!");
               }else{
                   penaO.vähennäEeppisyyttä(5);
                   JOptionPane.showMessageDialog(null, "Vanhus huomasi murtautumisyrityksesi ja soitti poliisit. Onneksi pääsit karkuun.");
               
               }
                   break;
               case 5: random = (1 + (int) (Math.random()*2));
               if (random == 2){
                   penaO.lisääRahaa(50);
                   penaO.lisääEeppisyyttä(9);
                   JOptionPane.showMessageDialog(null,"Onnistuit ryöstämään 50e pahoinpitelemällä jonkun");
               }else{
                   penaO.otaRahaa(70);
                   penaO.vähennäEeppisyyttä(10);
                   JOptionPane.showMessageDialog(null, "Sait itse turpaasi ja sinulta ryöstettiin 70e");
               }
                   break;
               default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
           }
                    
        }
}
