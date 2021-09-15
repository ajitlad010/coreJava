package prototype;

public class Main {
	public static void main(String[] args) {
		EmployeeProto p = new EmployeeProto("1", "Ajit");
		
		EmployeeProto clonedOb = (EmployeeProto) p.getClone();
		System.out.println("cloned : " + clonedOb.getId());
		System.out.println("cloned : " + clonedOb.getName());
		
		System.out.println(p);
		System.out.println(clonedOb);
		
	}

}
