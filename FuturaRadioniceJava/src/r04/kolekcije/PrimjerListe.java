/**
 * 
 */
package r04.kolekcije;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Krunoslav �ubrini�
 * 9. tra 2015.
 */
public class PrimjerListe {

	  private List<String> list;
	  private void start() {
	    System.out.println("Implementacija liste ArrayList-om");  
	    list = new ArrayList<String>();
	    list.add("Ivo");
	    list.add("Ana");
	    list.add("Vlaho");
	    list.add("Ana");
	    list.add("Kate");
	    System.out.println("5 elemenata dodano u listu"); 
	    System.out.println(list);
	    System.out.println("3. element: " + list.get(2));
	    System.out.println("1. element: " + list.get(0));
	    // Ispis pomo�u iteratora
	    System.out.println("Ispis pomo�u iteratora");
	    for (ListIterator<String> it = list.listIterator(); it.hasNext(); ) {
	        String el = it.next();
	        System.out.println(el);
	    }
	    System.out.println("Izmjene elemenata liste pomo�u iteratora");
	    for (ListIterator<String> it = list.listIterator(); it.hasNext(); ) {
	        String el = it.next();
	        it.set(el.toUpperCase());
	    }
	    for (ListIterator<String> it = list.listIterator(); it.hasNext(); ) {
	        String el = it.next();
	        System.out.println(el);
	    }
	    
	  }
	public static void main(String[] args) {
		PrimjerListe pl = new PrimjerListe();
		pl.start();

	}

}
