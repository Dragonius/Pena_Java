//Testausta
package penanloma;

//luodaan pena kontrolleri ja sen alle omat kontroloitavat oliot.
public class PenaKontrolleri {
    private PenaSuomi suomiloma;
    private PenaThaimaa thaimaaloma;
    private PenaOlio penaO;
    private PenaLoppu loppu;
    
    public void suomi(PenaOlio penaO){
        this.penaO = penaO;
        PenaSuomi suomi = new PenaSuomi();
        suomi.suomiAlku(this.penaO);
        
    }
    public void thaimaa(PenaOlio penaO){
        this.penaO = penaO;
        PenaThaimaa thaimaa = new PenaThaimaa();
        thaimaa.thaimaaAlku(this.penaO);
    }
    public void loppu(PenaOlio penaO){
        this.penaO = penaO;
        PenaLoppu lopetus = new PenaLoppu();
        lopetus.loppu(this.penaO);
    }
    
    
    
}
