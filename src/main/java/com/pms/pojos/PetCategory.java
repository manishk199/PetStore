package com.pms.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name = "pet_category")
public class PetCategory extends BaseEntity {

	@Column(length = 50, name = "pet_category_name")
	private String petCategoryName;
	
	@Lob
	@Column(name = "pet_image")
	private String petImage;

	public String getPetCategoryName() {
		return petCategoryName;
	}

	public void setPetCategoryName(String petCategoryName) {
		this.petCategoryName = petCategoryName;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	
	

	
}
