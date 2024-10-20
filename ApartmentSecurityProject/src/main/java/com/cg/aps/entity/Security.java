package com.cg.aps.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;

import lombok.Data;

@Entity
@Data
public class Security extends Base  {
	
	private Integer alertId;
	private String alertMessage;
	private String alertType;
	private LocalDate alertDate;

}
