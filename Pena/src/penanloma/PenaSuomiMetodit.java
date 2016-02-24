package penanloma;
import javax.swing.JOptionPane;



public class PenaSuomiMetodit {
    private PenaOlio pena;
    private int naisystävä = 0;
    public void baari(int valinta){
        int random;

   //             + "1. Karaoke-baari \n"
//                + "2. Perus pubi \n"
//                + "3. Yökerho \n";

        switch (valinta){
            case 1: pena.otaRahaa(48);
            pena.lisääEeppisyyttä(6 + (int) (Math.random()*4));
            pena.lisääAika(1);
            JOptionPane.showMessageDialog(null, "Oikein mukava karaokeilta vietetty!");
            break;
            case 2: pena.otaRahaa(40);
            pena.lisääEeppisyyttä(3 + (int) (Math.random()*7));
            pena.lisääAika(1);
            JOptionPane.showMessageDialog(null,"Vietit kivan iltaman kavereiden kanssa!");
            break;
            case 3: pena.otaRahaa(80);
            pena.lisääEeppisyyttä(7);
            random = (1 + (int) (Math.random()*2));
            if (random == 1){
                pena.lisääEeppisyyttä(10);
                JOptionPane.showMessageDialog(null, "Sait yökerhosta naisen kotiisi yöksi. NICE!");
                naisystävä = 1;
                
            } else{
                JOptionPane.showMessageDialog(null, "Hyvät jyskeet oli yökerhossa!");
            }
            pena.lisääAika(1);
            break;
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
  
    }

}
    public void keilaus(int valinta){
        int random;
 //       "Kaverisi ehdottavat viidenkympin vedonlyöntiä keilaillasta. Suostutko?\n"
   //             + "1. Suostun\n"
     //           + "2. En suostu";
     switch (valinta){
         case 1: pena.otaRahaa(65);
         random = (1 + (int) + (Math.random()*9));
         if (random >=1 && random <5){
             pena.lisääRahaa(100);
             pena.lisääEeppisyyttä(12);
             JOptionPane.showMessageDialog(null, "Voitit keilakisan! Onneksi olkoon!");
             
         }else{
             pena.lisääEeppisyyttä(2);
             JOptionPane.showMessageDialog(null, "Hävisit keilakisan. Voi harmi!");
         }
         pena.lisääAika(1);
         break;
         case 2: pena.otaRahaa(15);
         pena.lisääEeppisyyttä(6);
         JOptionPane.showMessageDialog(null, "Vietit mukavan keilaillan.");
         pena.lisääAika(1);
         break;
         default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
     }
     
    }
    public void koti(int valinta){
//               + "1. Netflix and chill\n"
  //              + "2. Pelaan videopelejä\n"
    //            + "3. Siivoan ja tiskaan \n"
      //          + "4. Luen kirjaa \n";
      switch (valinta){
          case 1: if (naisystävä == 1){
              pena.lisääEeppisyyttä(10);
              JOptionPane.showMessageDialog(null, "Kutsuit naisen, jonka nappasit baarista aikaisemmin, kanssasi katsomaan Netflixiä");
          }else{
              pena.lisääEeppisyyttä(5);
              JOptionPane.showMessageDialog(null, "Rauhallinen Netflix-ilta yksin");
          }
          pena.lisääAika(1);
          break;
          case 2: pena.lisääEeppisyyttä(6);
          pena.lisääAika(1);
          JOptionPane.showMessageDialog(null, "Kivan peli-illan vietit");
          break;
                  
      }
    }
}