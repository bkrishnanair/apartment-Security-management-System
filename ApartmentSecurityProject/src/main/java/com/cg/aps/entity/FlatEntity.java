package com.cg.aps.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;

import lombok.Data;

@Entity
@Data
public class FlatEntity extends Base {
	

	private String flatNo;
	private String ownerName;
	private String floorNo;
	private String flatType;

}
