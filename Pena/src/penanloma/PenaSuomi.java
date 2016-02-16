package penanloma;
import javax.swing.JOptionPane;

public class PenaSuomi {
    
    private PenaOlio pena;
    
    public void suomiAlku(){
        PenaOlio penaoo = new PenaOlio();
        int rahat = pena.getRahat();

        String suomiMenuAlku = "Olet päättänyt jäädä Suomeen. \n"
                + "Kerroppa mitä haluat tehdä.\n \n 1. Lähden baariin. \n"
                + "2. Lähden kavereiden kanssa keilaamaan. \n"
                + "3. Vietän koti-illan. \n"
                + "4. Käyn ulkona syömässä. \n"
                + "5. Käyn urheilemassa.  \n"
                + "6. Lähden risteilylle Viron laivalle. \n"
                + "7. Käyn hieronnassa. \n"
                + "8. Käyn ostoksilla. \n"
                + "9. Teen rikoksen. \n"
                + "10. Otan lainan (+ 500e). \n"
                + "11. Näytä rahatilanne.";
        String baarimenu = "Millaiseen baariin haluat mennä? \n"
                + "1. Karaoke-baari \n"
                + "2. Perus pubi \n"
                + "3. Yökerho \n";
        int valinta;
        String lukuStr;
                

            lukuStr = JOptionPane.showInputDialog(suomiMenuAlku);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta){
                
            case 1: 
            
            break;
            
            case 2:
            
            break;
            
            case 3:
            
            break;
            
            case 4:
            
            break;
            
            case 5:
            
            break;
            
            case 6:
            
            break;
            
            case 7:
            
            break;
            
            case 8:
            
            break;
            
            case 9:
            
            break;
            
            case 10:
            
            break;
            
            case 11: JOptionPane.showMessageDialog(null,"Rahatilanne: " + rahat);
            
            break;
            
            default: 
            
            }   

        
        
        
    }
}
