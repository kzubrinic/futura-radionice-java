package r05.datoteke;

import java.io.File;

/**
 * @author Krunoslav �ubrini�
 * 21. tra 2015.
 */
public class PrimjerFile
{
    public void osnovneMetode() {
        File dir = new File("c:/Windows");
        File file1 = new File(dir, "write.exe");
        File file2 = new File("testna.txt");
        File parent = file1.getParentFile();
        boolean exists = file2.exists();
        boolean readable = file1.canRead();
        boolean writeable = file1.canWrite();
        boolean executable = file1.canExecute();
        long fileSize = file1.length();
        boolean isFile = file1.isFile();
        boolean isDirectory = file1.isDirectory();
        boolean isDirectory2 = dir.isDirectory();
        String path = file2.getPath();
        String pathA = file2.getAbsolutePath();
        System.out.println("Folder datoteke write.exe: " +parent);
        System.out.println("testna.txt postoji? " +exists);
        System.out.println("c:/Windows/write.exe se mo�e �itati? " +readable);
        System.out.println("c:/Windows/write.exe se mo�e mijenjati? " +writeable);
        System.out.println("c:/Windows/write.exe se mo�e izvesti? " +executable);
        System.out.println("Veli�ina datoteke c:/Windows/write.exe je: " +fileSize+ "B");
        System.out.println("c:/Windows/write.exe je datoteka? " +isFile);
        System.out.println("c:/Windows/write.exe je mapa? " +isDirectory);    
        System.out.println("c:/Windows je mapa? " +isDirectory2); 
        System.out.println("Putanja do datoteke testna.txt je " +path);
        System.out.println("Apsolutna putanja do datoteke testna.txt je " +pathA);
    }
 
    public void ispisDatoteka(){
    	// trenutna mapa programa ozna�ava se to�kom
        File mapa = new File(".");
        File[] d = mapa.listFiles();
        System.out.println("MAPA: " + mapa.getAbsolutePath());
        for(File f : d) {
           if (f.isDirectory()){
                System.out.println("[MAPA]" + f.getName());
           }
           else 
                System.out.println(f.getName());
        }
    }
	public static void main(String[] args) {
		PrimjerFile p = new PrimjerFile();
		p.osnovneMetode();
		p.ispisDatoteka();
	}

}
