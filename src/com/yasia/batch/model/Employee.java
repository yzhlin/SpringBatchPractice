package com.yasia.batch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private Integer gender;
	private Float salary;
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
	private Date hireDate;
	private Integer hireType;//0:临时, 1:合同, 2:编制
	private Integer isProbation;//0:试用期, 1:正式工

}
