package com.blob.model.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Entity
//@Table(name="customer")
@Embeddable
public class Customer {

	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;*/	
	
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
