package com.zzd.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7226647598763762930L;

	@Id
	private int id;
	private String name;
	private int age;
	private int sex;

	public User() {

	}



}
