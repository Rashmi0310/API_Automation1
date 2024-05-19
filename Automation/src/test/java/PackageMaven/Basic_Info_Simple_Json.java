// pojo class -- basic information of simple , complex , array


package PackageMaven;

public class Basic_Info_Simple_Json {
	
// pojo class declare private keys 
	
	private String firstname;
	private String lastname;
	private String designation;
	private String id;
	private Address_Info_ComplexJSON address[] ;
	
// generate setter getter to access the private variable. Go to source - generate setter getter and select objects and generate

	
	
	public Address_Info_ComplexJSON[] getAddress() {
		return address;
	}

	public void setAddress(Address_Info_ComplexJSON[] address) {
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
