/**
 * 
 */
package r04.rjesenja_zadataka;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Krunoslav Žubriniæ
 * 23. tra 2015.
 */
public class Baza {
	private Map<Integer,Student> mapaStud;
	private Student s;
	public Baza(){
		mapaStud = new TreeMap<Integer,Student>();
	}
	public void dodajStudenta(Integer id, String ime, Float po){
		if (!mapaStud.containsKey(id))
			mapaStud.put(id, new Student(id, ime, po));
	}

	public void izmjeniOcjenu(Integer id, float ocj){
		if (mapaStud.containsKey(id)){
			s = mapaStud.get(id);
			s.setProsjecnaOcjena(ocj);
		}
	}
	public void obrisiStudenta(Integer id){
		if (mapaStud.containsKey(id)){
			s = mapaStud.remove(id);
		}
	}
	public void ispisiStudenta(Integer id){
		if (mapaStud.containsKey(id)){
			System.out.println(mapaStud.get(id));
		}
	}
	public void ispisiStudente(){
		if (!mapaStud.isEmpty()){
			for (Student s : mapaStud.values())
				System.out.println(s);
		}
	}
	public void nulirajOcjene(){
		if (!mapaStud.isEmpty()){
			for (Iterator<Student> it = mapaStud.values().iterator (); it.hasNext ();) {
				s = it.next();
				s.setProsjecnaOcjena(new Float(0));
			}
		}
	}
}