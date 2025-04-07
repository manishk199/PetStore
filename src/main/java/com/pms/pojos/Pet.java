package com.pms.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "pet")
public class Pet extends BaseEntity {

	@Column(length = 100, name = "pet_breed")
	private String petBreed;

	@Lob
	@Column(name = "pet_image")
	private String petImage;

	@Column(length = 20, name = "pet_color")
	private String petColor;

	@Column(name = "pet_age")
	private int petAge;

	@Column(length = 100, name = "pet_description")
	private String petDescription;

	@Column(name = "pet_cost_price")
	private double petCostPrice;
	
	@Column(name = "pet_MRP")
	private double petMRP;

	@Column(name="pet_quantity")
	private double petQuantity;
	
	@Column(name = "pet_discount")
	private double petDiscount;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pet_category")
	private PetCategory petCategoryRef;

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	public String getPetColor() {
		return petColor;
	}

	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}

	public double getPetCostPrice() {
		return petCostPrice;
	}

	public void setPetCostPrice(double petCostPrice) {
		this.petCostPrice = petCostPrice;
	}

	public double getPetMRP() {
		return petMRP;
	}

	public void setPetMRP(double petMRP) {
		this.petMRP = petMRP;
	}

	public double getPetQuantity() {
		return petQuantity;
	}

	public void setPetQuantity(double petQuantity) {
		this.petQuantity = petQuantity;
	}

	public double getPetDiscount() {
		return petDiscount;
	}

	public void setPetDiscount(double petDiscount) {
		this.petDiscount = petDiscount;
	}

	public PetCategory getPetCategoryRef() {
		return petCategoryRef;
	}

	public void setPetCategoryRef(PetCategory petCategoryRef) {
		this.petCategoryRef = petCategoryRef;
	}
	
	
	

}
