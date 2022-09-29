package crudOperationUsingCollection;

public class Customer 
{
	private int cid;
	private String name;
	private String city;
	private String phone;
	
	public Customer() {}

	public Customer(int cid, String name, String city, String phone) 
	{
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
