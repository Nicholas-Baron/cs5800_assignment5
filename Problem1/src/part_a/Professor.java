package part_a;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Professor {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "office_number", nullable = false)
	private String officeNumber;

	@Column(name = "research_area", nullable = false)
	private String researchArea;

	@OneToOne(optional = false, cascade = { CascadeType.ALL })
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	public Professor() {
	}

	public Professor(String officeNumber, String researchArea, Customer customer) {
		this.officeNumber = officeNumber;
		this.researchArea = researchArea;
		this.customer = customer;
	}
}
