/**
 * 
 */
package com.niit.onlineshoppingbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 * @author User
 *
 */
@Entity
public class BillingAddress {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty
	private String doorno;
	@NotEmpty
	private String street;
	@NotEmpty
	private String city;
	@NotEmpty
	private String state;
	@NotEmpty
	private String country;
	@NotEmpty
	private String zipcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
