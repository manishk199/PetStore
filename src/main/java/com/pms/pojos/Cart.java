package com.pms.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cart")
public class Cart extends BaseEntity {

	// F.K
	// one customer has one order details which will point to multiple orders
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id")
	private Customer custorders;

	public Customer getCustorders() {
		return custorders;
	}

	public void setCustorders(Customer custorders) {
		this.custorders = custorders;
	}
	
	

}
