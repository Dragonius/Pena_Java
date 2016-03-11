package penanloma;
import javax.swing.JOptionPane;

public class PenaSuomi {
    
    private PenaOlio pena;
    private PenaSuomiMetodit suomiMetodit;
    
    public void suomiAlku(PenaOlio penaO){
        PenaSuomiMetodit metodit = new PenaSuomiMetodit();
        PenaKontrolleri kontrolleri = new PenaKontrolleri();
        
        
        String baarimenu = "Millaiseen baariin haluat mennä? \n"
                + "1. Karaoke-baari \n"
                + "2. Perus pubi \n"
                + "3. Yökerho \n";
        
        String keilamenu = "Kaverisi ehdottavat viidenkympin vedonlyöntiä keilaillasta. Suostutko?\n"
                + "1. Suostun\n"
                + "2. En suostu";
        
        String kotimenu = "Mitä teet koti-iltana?\n"
                + "1. Netflix and chill\n"
                + "2. Pelaan videopelejä\n"
                + "3. Siivoan ja tiskaan \n"
                + "4. Luen kirjaa \n";
        
        String ulkosyömismenu = "Missä käyt syömässä?\n"
                + "1. Pizzeria \n"
                + "2. Hieno ravintola \n"
                + "3. McDonald's \n"
                + "4. Nakkigrilli \n";
        
        String urheilumenu = "Miten haluat urheilla? \n"
                + "1. Käyn lenkillä \n"
                + "2. Menen salille \n"
                + "3. Menen pelaamaan jalkapalloa kavereiden kanssa";
        
        String viromenu = "Mitä teet risteilyllä?\n"
                + "1. Ekana Tax Freehen ostamaan viinat, hytissä alottelua, sitten tanssimaan baariin ja iskemään naisia!\n"
                + "2. Suoraan baariin juomaan loppuillaksi! \n"
                + "3. Tax Freen kautta loppuillaksi hyttiin murjottamaan. \n"
                + "4. Nukun vain hytissä. \n"
                + "5. Kasinolla pitää käydä!";
        
        String hierontamenu = "Millaisen hierronnan otat? \n"
                + "1. Thai-hierontaan ajattelin mennä \n"
                + "2. Johonkin ihan perus kokovartalohierontaan \n"
                + "3. Kaveri antaa niskahieronnan";
        
        String ostosmenu = "Mitäs lähdet ostelee? \n"
                + "1. Vaatteita \n"
                + "2. Ruokakaupassa käväsen \n"
                + "3. Kirpputorille ajattelin mennä \n"
                + "4. Satunnaisesti lähden käymään kaupoilla ja katson mitä tarttuu mukaan.";
        
        String rikosmenu = "Millaisen rikoksen teet? \n"
                + "1. Ryöstän Siwan \n"
                + "2. Ryöstän pankin \n"
                + "3. Teen palkkamurhan \n"
                + "4. Murtaudun vanhuksen kotiin \n"
                + "5. Pahoinpitelen ja ryöstän jonkun \n";
//luo menun int valinnat ja Stringi 
        int menuvalinta;      
        int valinta;
        String lukuStr;
        
        
        do {        

            lukuStr = JOptionPane.showInputDialog("Olet päättänyt jäädä Suomeen. \n"
                + "Tämä on lomasi "+(penaO.getAika()+ 1)+". päivä\n"
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
                + "11. Näytä rahatilanne. \n"
                + "12. Lopeta loma");
            
            /* Niin kauan kuin alkuvalinta on Null(=Cancel taikka X oikeasta
            Yläkulmasta niin aja ohjelmaa. (tästä voi tulla ongelma että ei voi
            vielä lopettaa tätät ohjelmaa... -jari
            */
            while(lukuStr == null ){
        /*JOptionPane.showMessageDialog(null, "Rahaa jäi "+ penaO.getRahat() + "\n"
        + "Eepisyys oli tosiaan: "  + penaO.getEeppisyys() + "\n" 
        + "Aikaa tosiaankin jäi vielä " + penaO.getAika() + "\n");
        System.exit(0);*/
            }
            valinta = Integer.parseInt(lukuStr);
            switch (valinta){
                
            case 1: lukuStr = JOptionPane.showInputDialog(baarimenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.baari(menuvalinta, penaO);
            
            
            break;
            
            case 2: lukuStr = JOptionPane.showInputDialog(keilamenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.keilaus(menuvalinta, penaO);
            
            break;
            
            case 3: lukuStr = JOptionPane.showInputDialog(kotimenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.koti(menuvalinta, penaO);
            
            break;
            
            case 4: lukuStr = JOptionPane.showInputDialog(ulkosyömismenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.ruoka(menuvalinta, penaO);
            
            break;
            
            case 5: lukuStr = JOptionPane.showInputDialog(urheilumenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.urheilu(menuvalinta, penaO);
            
            break;
            
            case 6: lukuStr = JOptionPane.showInputDialog(viromenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.viro(menuvalinta, penaO);
            
            break;
            
            case 7: lukuStr = JOptionPane.showInputDialog(hierontamenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.hieronta(menuvalinta, penaO);
            
            break;
            
            case 8: lukuStr = JOptionPane.showInputDialog(ostosmenu);
            menuvalinta = Integer.parseInt(lukuStr);
           metodit.ostos(menuvalinta, penaO);
            
            break;
            
            case 9: lukuStr = JOptionPane.showInputDialog(rikosmenu);
            menuvalinta = Integer.parseInt(lukuStr);
            metodit.rikos(menuvalinta, penaO);
            
            break;
            
            case 10: penaO.otaLaina();
            
            break;
            
            case 11: JOptionPane.showMessageDialog(null,"Rahatilanne: " + penaO.getRahat());
            break;
            case 12: JOptionPane.showMessageDialog(null, "Lopetit loman kesken, Maanantaina duuniin!");
            kontrolleri.loppu(penaO);
            break;
            
            default: JOptionPane.showMessageDialog(null, "Väärä valinta!");
            
            }   
        

        }
        // niin kauan kuin penan aika on vähemmän kuin 10 ja raha on enemmän kuin 0
        while(penaO.getAika()<10 && penaO.getRahat()>0);
        
        
    }
}
