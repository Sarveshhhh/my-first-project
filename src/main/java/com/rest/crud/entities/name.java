 package com.rest.crud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class name {
	@Id
	private long id;
	private String name;
	
	 public name(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name [id=" + id + ", name=" + name + "]";
	}

	 
}
  