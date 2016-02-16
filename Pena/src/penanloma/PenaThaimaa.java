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
        int valinta = 0;
        String lukuStr;
        
        lukuStr = JOptionPane.showInputDialog(thaimaaMenu);
        valinta = Integer.parseInt(lukuStr);
        String taksin_hotellille = "Tilaat taksin ja jatkat matkaa taksilla hotelille\n";
        
            switch (valinta){
                case 1: JOptionPane.showMessageDialog(null,taksin_hotellille);
                    break;
                case 2: JOptionPane.showMessageDialog(null, pena);
                    break;
                case 3: JOptionPane.showMessageDialog(null, pena);
                    break;
        }
        
        
    }
   
}
