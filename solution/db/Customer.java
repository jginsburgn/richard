package db;

public class Customer {
	// 1. Crear los atributos de la clase Customer en base a la definición de la base de datos
	// Escribe tu codigo aqui {
	private int CustomerId;
	private String FirstName;
	private String LastName;
	private String Company;
	private String Address;
	private String City;
	private String State;
	private String Country;
	private String PostalCode;
	private String Phone;
	private String Fax;
	private String Email;
	private int SupportRepId;
	// }
	
	//2. Crear los métodos de acceso
	// Escribe tu codigo aqui {
	public int getCustomerId() {
		return this.CustomerId;
	}
	public String getFirstName() {
		return this.FirstName;
	}
	public String getLastName() {
		return this.LastName;
	}
	public String getCompany() {
		return this.Company;
	}
	public String getAddress() {
		return this.Address;
	}
	public String getCity() {
		return this.City;
	}
	public String getState() {
		return this.State;
	}
	public String getCountry() {
		return this.Country;
	}
	public String getPostalCode() {
		return this.PostalCode;
	}
	public String getPhone() {
		return this.Phone;
	}
	public String getFax() {
		return this.Fax;
	}
	public String getEmail() {
		return this.Email;
	}
	public int getSupportRepId() {
		return this.SupportRepId;
	}
	public void setCustomerId(int newCustomerId) {
		this.CustomerId = newCustomerId;
	}
	public void setFirstName(String newFirstName) {
		this.FirstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		this.LastName = newLastName;
	}
	public void setCompany(String newCompany) {
		this.Company = newCompany;
	}
	public void setAddress(String newAddress) {
		this.Address = newAddress;
	}
	public void setCity(String newCity) {
		this.City = newCity;
	}
	public void setState(String newState) {
		this.State = newState;
	}
	public void setCountry(String newCountry) {
		this.Country = newCountry;
	}
	public void setPostalCode(String newPostalCode) {
		this.PostalCode = newPostalCode;
	}
	public void setPhone(String newPhone) {
		this.Phone = newPhone;
	}
	public void setFax(String newFax) {
		this.Fax = newFax;
	}
	public void setEmail(String newEmail) {
		this.Email = newEmail;
	}
	public void setSupportRepId(int newSupportRepId) {
		this.SupportRepId = newSupportRepId;
	}
	// }
	
	
	@Override
	public String toString(){
		return String.format("%-5s %-10s %-20s %-25s %-15s %-5s", this.CustomerId, this.FirstName, 
				this.LastName, this.Company, this.Email, this.SupportRepId);
	}
}
