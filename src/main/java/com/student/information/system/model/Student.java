package com.student.information.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NonNull
	private String firstName;

	@NonNull
	private String lastName;

}
