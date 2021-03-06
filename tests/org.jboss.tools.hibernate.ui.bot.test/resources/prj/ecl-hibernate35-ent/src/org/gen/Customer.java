package org.gen;

// Generated Mar 6, 2015 3:28:00 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private short customerId;
	private Store store;
	private Address address;
	private String firstName;
	private String lastName;
	private String email;
	private boolean active;
	private Date createDate;
	private Date lastUpdate;
	private Set payments = new HashSet(0);
	private Set payments_1 = new HashSet(0);
	private Set rentals = new HashSet(0);
	private Set rentals_1 = new HashSet(0);

	public Customer() {
	}

	public Customer(short customerId, Store store, Address address,
			String firstName, String lastName, boolean active, Date createDate,
			Date lastUpdate) {
		this.customerId = customerId;
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
	}

	public Customer(short customerId, Store store, Address address,
			String firstName, String lastName, String email, boolean active,
			Date createDate, Date lastUpdate, Set payments, Set payments_1,
			Set rentals, Set rentals_1) {
		this.customerId = customerId;
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.active = active;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
		this.payments = payments;
		this.payments_1 = payments_1;
		this.rentals = rentals;
		this.rentals_1 = rentals_1;
	}

	public short getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(short customerId) {
		this.customerId = customerId;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

	public Set getPayments_1() {
		return this.payments_1;
	}

	public void setPayments_1(Set payments_1) {
		this.payments_1 = payments_1;
	}

	public Set getRentals() {
		return this.rentals;
	}

	public void setRentals(Set rentals) {
		this.rentals = rentals;
	}

	public Set getRentals_1() {
		return this.rentals_1;
	}

	public void setRentals_1(Set rentals_1) {
		this.rentals_1 = rentals_1;
	}

}
