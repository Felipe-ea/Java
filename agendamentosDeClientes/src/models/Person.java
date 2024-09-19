package models;

public class Person {

	private int id;
	private String name;
	private String phone;
	private String cpf;
	private String address;
	private String maritalStatus;
	
	
	public Person(String name, String phone, String cpf, String address, String maritalStatus) {
		super();
		this.name = name;
		this.phone = phone;
		this.cpf = cpf;
		this.address = address;
		this.maritalStatus = maritalStatus;
	}

	public Person(String name, String phone, String cpf) {
		super();
		this.name = name;
		this.phone = phone;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatusl(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
	
	
	
}
