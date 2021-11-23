package part_a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private String address;

	public Customer() {
	}

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
}
