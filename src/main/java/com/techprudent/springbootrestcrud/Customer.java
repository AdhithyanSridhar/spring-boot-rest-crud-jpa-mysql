package com.techprudent.springbootrestcrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tech prudent
 *
 *         customer entity, created automatically for us
 */
@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String contact;
	private String gender;

	// getters setters - avoided since we have used lombok, for more info
	// https://www.youtube.com/watch?v=lPhSOEh35i8&t=281s

}
