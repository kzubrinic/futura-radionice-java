package r04.superp;

public class PorodicaPasa extends Zivotinja {
    PorodicaPasa(String ime) {
       super(ime);
       System.out.println("Izvodi se konstruktor razreda PorodicaPasa");
    }
    public void lutanje() {
        System.out.println("Lutanje PORODICE PASA!");   
    }
    public void glasanje() {
        super.glasanje();
    } 
}
