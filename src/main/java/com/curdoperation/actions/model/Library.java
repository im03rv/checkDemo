package com.curdoperation.actions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name = "library_table")
public class Library {
	@Id
	@Column(name = "libray_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long librayId;

	@Column(name = "first_name")
	private String FirstName;

	@Column(name = "last_name")
	private String LastName;

	@Column(name = "total_isused_book")
	private int totatInsusedBook;

	@Column(name = "total_fine")
	private int TotalFine;

}
