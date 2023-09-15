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


@AllArgsConstructor // Constructor
@NoArgsConstructor // default
@ToString

@Entity
@Table(name = "book_table")
@Data // getter setter
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
	private int price;

}
