package com.cg.aps.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;

import lombok.Data;


@Entity
@Data

public class FlatRent extends Base {
	
	

	private String flatId;
	private String renterName;
	private String amount;
	private String type;

}
