package com.rest.crud.services;

import java.util.List;

import com.rest.crud.entities.name;

public interface NameService {
	
	public List<name> getNames();
	public name addName(name name);
	public name updateName(name name);
	public name deleteName(name name);

}
