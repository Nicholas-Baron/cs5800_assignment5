package part_b;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private Date date;

	@Column(name = "customer_name", nullable = false)
	private String customerName;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "order_detail", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Product> products = new ArrayList<>();

	public Order() {
	}

	public Order(String customer, Date date) {
		this.customerName = customer;
		this.date = date;
	}
}
