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
              JOptionPane.showMessageDialog(null, "Kutsuit naisen, jonka nappasit baarista aikaisemmin, kanssasi katsomaan Netflixiä");
          }else{
              penaO.lisääEeppisyyttä(5);
              JOptionPane.showMessageDialog(null, "Rauhallinen Netflix-ilta yksin");
          }
          penaO.lisääAika(1);
          break;
          case 2: penaO.lisääEeppisyyttä(6);
          penaO.lisääAika(1);
          JOptionPane.showMessageDialog(null, "Kivan peli-illan vietit");
          break;
                  
      }
    }
}