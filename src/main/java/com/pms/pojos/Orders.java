package com.pms.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Orders extends BaseEntity {

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "order_status", length = 50)
	private OrderStatus orderStatus;

	@Column(name = "expected_delivery_date")
	private LocalDate expectedDeliveryDate;

	@Column(name = "quantity")
	private Long orderQuantity;

	@Column(name = "total_amount")
	private double totalAmount;

	// F.K
	// one order contains the detail of one pet
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pet_id")
	private Pet orderedpet;
	
	// F.K
	// one cart contains many order
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cart_id")
	private Cart custcart;

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Pet getOrderedpet() {
		return orderedpet;
	}

	public void setOrderedpet(Pet orderedpet) {
		this.orderedpet = orderedpet;
	}

	public Cart getCustcart() {
		return custcart;
	}

	public void setCustcart(Cart custcart) {
		this.custcart = custcart;
	}
	
	
	

}
