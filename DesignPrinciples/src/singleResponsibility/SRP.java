package singleResponsibility;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.*;

class Journal {
	private final List<String> entries = new ArrayList<>();
	private static int count = 0;
	
	public void addEntry(String text) {
		entries.add("" + "Count : " + (++count) + " : " + text);
	}
	
	public void removeEntry(int index) {
		entries.remove(index);
	}
	
	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
	//here we break SRP
	public void save(String fileName) throws Exception {
		try(PrintStream out = new PrintStream(fileName)) {
			out.println(toString());
		}
	}
	
	public void load(String fileName) {}
	public void load(URL url) {}
	
}

//handles responsibility of persisting objects
class Persistance {
	public void saveToFile(Journal journal, String fileName, boolean overwrite) throws Exception {
		if(overwrite || new File(fileName).exists()) {
			try(PrintStream out = new PrintStream(fileName)) {
				out.println(journal.toString());
			}
		}
	}
	public void load(String fileName) {}
	public void load(URL url) {}
}

public class SRP {
	public static void main(String[] args) throws Exception {
		Journal j = new Journal();
		j.addEntry("A letter");
		j.addEntry("B letter");
		System.out.println(j);
		
		Persistance p = new Persistance();
		p.saveToFile(j, "journal.txt", true);
		
		//Windows
		Runtime.getRuntime().exec("notepad.exe " + "journal.txt");
	}
}
