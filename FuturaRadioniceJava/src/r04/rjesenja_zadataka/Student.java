package r04.rjesenja_zadataka;

/**
 * @author Krunoslav Žubriniæ
 * 23. tra 2015.
 */
public class Student {
	private Integer id;
	private String imePrezime;
	private Float prosjecnaOcjena;
	public Student(Integer id, String ime, Float poc){
		this.id = id;
		imePrezime = ime;
		prosjecnaOcjena = poc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public Float getProsjecnaOcjena() {
		return prosjecnaOcjena;
	}
	public void setProsjecnaOcjena(Float prosjecnaOcjena) {
		this.prosjecnaOcjena = prosjecnaOcjena;
	}
	// 1. objekti su jednaki ako su jednaka sva tri podatka: id, imePrezime i prosjecnaOcjena
	// 2. objekt su poredani po imePrezime 
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		Student s2 = (Student) o;
		if (id.equals(s2.id) && imePrezime.equals(s2.imePrezime) && prosjecnaOcjena.equals(s2.prosjecnaOcjena)) 
			return 0;
		else if (imePrezime.equals(s2.imePrezime))
			return id.compareTo(s2.id);
		else
			return imePrezime.compareTo(s2.imePrezime);
	}
	// Jednakost pomoæu metode compareTo
	public boolean equals(Object k) {
		int rez = this.compareTo(k);
		if (rez == 0) {
			return true;
		}
		return false;
	}
	public String toString(){
		String poc = String.format("%.2f", prosjecnaOcjena);
		return "Id: "+id+" Ime i prezime: "+imePrezime + " Prosjeèna ocjena: " + poc;
	}

}
