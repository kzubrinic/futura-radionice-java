package r04.superp;
public class Pas extends PorodicaPasa{
    Pas(String ime) {
        super(ime);
        System.out.println("Izvodi se konstruktor razreda Pas");
     }
    public void glasanje() {
        System.out.println("Glasanje PSA!");   
     }   
    public void hranjenje() {
        System.out.println("Hranjenje PSA!");   
    }   
}
