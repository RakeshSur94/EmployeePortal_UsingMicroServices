package com.eal.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="DEPARTMENT_DETAILS")
@Getter
@Setter
@RequiredArgsConstructor
public class Department implements Serializable {
	@Id
	@GeneratedValue
	private Integer dID;
	@NonNull
	@Column(name="DepartmentName",length = 20)
	private String dName;
	@NonNull
	@ManyToOne(targetEntity = Company.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_cid",referencedColumnName = "cId")
	private Company companies;

}
