package com.cg.aps.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import lombok.Data;

@Entity
@Data
@Inheritance
public class Base {

	@Id
	@GeneratedValue
	private long id;
	private String createdBy;
	private String modifiedBy;
	private LocalDateTime createdDateTime;
	private LocalDateTime modifiedDateTime;
	
}
