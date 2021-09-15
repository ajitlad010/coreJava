package Singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	private static Singleton obj;
	
	private Singleton() throws Exception {
		if(obj != null) {
			throw new Exception("Object can not be created using constructor");
		}
	}
	
	public static Singleton getObj() throws Exception {
		if(obj == null) {
			synchronized (Singleton.class) {
				if(obj == null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
	}
	
	protected Singleton readResolve() throws Exception {
		return getObj();
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
