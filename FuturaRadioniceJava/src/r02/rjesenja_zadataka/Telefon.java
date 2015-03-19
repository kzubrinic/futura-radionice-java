package r02.rjesenja_zadataka;

/**
 * zadatak
 * Meðunarodni standard povezivanja slova i brojeva na telefonskoj tipkovnici prikazan je u tablici desno.
 * Napišite razred Telefon koji treba sadržavati sljedeæe metode:
 * - Metodu String vratiTelBroj(String nizZ)
 * - Metodu boolean provjeriTelBroj(String nizZ)
 * - Metodu String oblikujBroj(String telBr)
 *  
 * @author Krunoslav Žubriniæ
 * 17. ožujak 2015.
 */
public class Telefon {
	
	public String vratiTelBroj(String nizZ){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nizZ.length(); i++){
			char znak = nizZ.toUpperCase().charAt(i);
			if (znak >= 'A' && znak <= 'C')
				sb.append('2');
			else if (znak >= 'D' && znak <= 'F')
				sb.append('3');
			else if (znak >= 'G' && znak <= 'I')
				sb.append('4');
			else if (znak >= 'J' && znak <= 'L')
				sb.append('5');
			else if (znak >= 'M' && znak <= 'O')
				sb.append('6');
			else if (znak >= 'P' && znak <= 'S')
				sb.append('7');
			else if (znak >= 'T' && znak <= 'V')
				sb.append('8');
			else if (znak >= 'W' && znak <= 'Z')
				sb.append('9');
			else
				sb.append(znak);
			}
		return sb.toString();
		}

	public boolean provjeriTelBroj(String nizZ){
		if (nizZ.length() == 10)
			return true;
		return false;
	}
	public String oblikujBroj(String telBr){
		//"+385(#)##/###-####" 
		return "+385("+ telBr.substring(0, 1) + ")"+ telBr.substring(1, 3) + "/" + telBr.substring(3, 6) + "-" + telBr.substring(6);
	}
}
