package r07.serijalizacija;

import java.io.Serializable;

/**
 * @author Krunoslav �ubrini�
 * 19. svi 2015.
 */
public class Osoba implements Serializable{
	private String ime, prezime;
	private int starost;
	// Ne �elimo serijalizirati ovaj podatak pa ga ozna�avamo s "transient"
	private transient String datumRod;
	
	public Osoba(String i, String p, int s, String d){
		ime = i;
		prezime = p;
		starost = s;
		datumRod = d;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	public String getDatumRod() {
		return datumRod;
	}
	public void setDatumRod(String datumRod) {
		this.datumRod = datumRod;
	}
	
	public String toString(){
		return ime+" "+prezime+", "+starost+" godina, ro�en: "+datumRod;
	}
}
