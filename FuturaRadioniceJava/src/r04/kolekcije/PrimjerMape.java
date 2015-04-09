/**
 * 
 */
package r04.kolekcije;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Krunoslav Žubriniæ
 * 9. tra 2015.
 */
public class PrimjerMape {

	private Map<Integer, String> map;
	  private Map<Integer, String> sortedMap;
	  public void start() {
	    System.out.println("Ovo je HashMap implementacija");  
	    map = new HashMap<Integer, String>();
	    map.put(new Integer(72),"Ivo");
	    map.put(new Integer(2),"Ana");
	    map.put(new Integer(3132),"Vlaho");
	    map.put(new Integer(1),"Ana");
	    map.put(new Integer(4215),"Kate");
	    System.out.println("5 elemenata dodano u mapu"); 
	    System.out.println(map);
	    
	    System.out.println("Ovo je (sortirana!) implementacija TreeMap"); 
	    sortedMap = new TreeMap<Integer, String>(map);
	    System.out.println(sortedMap);
	    // Ispiši vrijednosti mape
	    System.out.println("Dohvaæene vrijednosti");
	    for (String a : sortedMap.values()) 
	        System.out.println(a);
	    // Ispiši kljuèeve mape
	        System.out.println("Dohvaæeni kljuèevi");
	    for (Integer i : sortedMap.keySet()) 
	        System.out.println(i);
	    System.out.println("Mapa prije izmjene");
	    System.out.println(sortedMap);
	    // Izmjene elemenata mape - s istim kljuèem zapiši novu vrijednost
	    System.out.println("Mijenja se element s kljuèem 4215");
	    sortedMap.put(new Integer(4215),"Katica");
	    System.out.println("Mapa nakon izmjene");
	    System.out.println(sortedMap);
	    
	  }

	public static void main(String[] args) {
		PrimjerMape pm = new PrimjerMape();
		pm.start();

	}

}
