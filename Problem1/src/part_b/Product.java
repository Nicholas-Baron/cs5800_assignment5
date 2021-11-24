package part_b;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "order_detail", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
	private List<Order> orders = new ArrayList<>();

	public Product() {
	}

	public Product(String name) {
		this.name = name;
	}
}
