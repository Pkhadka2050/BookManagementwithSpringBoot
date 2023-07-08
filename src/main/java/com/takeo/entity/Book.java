package com.takeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="BOOK_DETAILS")
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BID")
	private int bid;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="PUBYEAR")
	private String pubyear;
	
	@Column(name="ISBN")
	private long isbn;

}
