package com.xworkz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="restarunant")
public class RestarunantEntity {
	@Id
	@Column
	(name="id")
	private int restarunantId;
	private long contactNo;
	private String name;
	private double rating;
	private String loction;
	private String type;
	

}
