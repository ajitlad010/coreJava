package Singleton;

public class Main {
	public static void main(String[] args) throws Exception {
		Singleton s = Singleton.getObj();
		
		System.out.println(s);
		
		Singleton s1 = Singleton.getObj();
		System.out.println(s1);
	}

}
