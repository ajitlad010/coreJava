package prototype;

public class EmployeeProto implements Prototype {
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeProto() {}
	public EmployeeProto(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public Object getClone() {
		return new EmployeeProto(id, name);
	}

}
