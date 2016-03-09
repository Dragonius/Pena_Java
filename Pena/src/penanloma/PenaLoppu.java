
package penanloma;

import javax.swing.JOptionPane;

public class PenaLoppu {

    public void loppu(PenaOlio penaO){
        int välieeppisyys;
        int loppueeppisyys;
        int eeppisyyslisä;
        eeppisyyslisä = (penaO.getRahat()/200);
        välieeppisyys = (penaO.getEeppisyys() + eeppisyyslisä);
        if (välieeppisyys >100){
            loppueeppisyys = 100;
        }else if (välieeppisyys <0){
            loppueeppisyys = 0;
        }else{
            loppueeppisyys = välieeppisyys;
        }

        JOptionPane.showMessageDialog(null, "Lomasi loppui! \n"
                + "Rahaa jäi: "+penaO.getRahat()+"e \n"
                + "Loman eeppisyys: "+loppueeppisyys+"% \n"
                + "\n Hyvää alkavaa työviikkoa!");
        System.exit(0);
        
        
    }
    
}
