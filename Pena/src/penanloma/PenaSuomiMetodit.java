package penanloma;
import javax.swing.JOptionPane;



public class PenaSuomiMetodit {
    private PenaOlio pena;
    public void baari(int valinta){
        int random;
   //             + "1. Karaoke-baari \n"
//                + "2. Perus pubi \n"
//                + "3. Yökerho \n";
        switch (valinta){
            case 1: pena.otaRahaa(48);
            pena.lisääEeppisyyttä(6 + (int) (Math.random()*4));
            pena.lisääAika(1);
            break;
            case 2: pena.otaRahaa(40);
            pena.lisääEeppisyyttä(3 + (int) (Math.random()*7));
            pena.lisääAika(1);
            break;
            case 3: pena.otaRahaa(80);
            pena.lisääEeppisyyttä(7);
    }
}
}