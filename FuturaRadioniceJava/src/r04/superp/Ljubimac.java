package r04.superp;
public class Ljubimac {
	public static void main(String[] args){
		Ljubimac l = new Ljubimac();
		l.kreni();
	}
    private void kreni() {
        Pas p = new Pas("Reks");
        p.glasanje();
        p.lutanje();
        Zivotinja.spavanje();

        // primjer korištenja kljuène rijeèi super
        PorodicaPasa pp=new PorodicaPasa("reks");
        pp.glasanje();
        
        SuperPas s = new SuperPas("Supi");
        s.glasanje();
        s.lutanje();
    }    
    
}
