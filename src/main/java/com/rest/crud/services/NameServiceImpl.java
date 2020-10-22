package com.rest.crud.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.crud.dao.NameDao;
import com.rest.crud.entities.name;

@Service
public class NameServiceImpl implements NameService {
	
	@Autowired
	private NameDao namedao;


	public NameServiceImpl() {
		/*
		 * list=new ArrayList<>(); list.add(new name(1, "sarvesh")); list.add(new
		 * name(2, "Apple"));
		 */
	}
	
	
	
	@Override
	public List<name> getNames() {
		// TODO Auto-generated method stub
		return namedao.findAll();
	}



	@Override
	public name addName(name name) {
//		list.add(name);
		namedao.save(name);
		return name;
	}



	@Override
	public name updateName(name name) {
//		list.forEach(e ->{
//			if(e.getId()==name.getId()) {
//				e.setName(name.getName());
//			}
		
		namedao.save(name);
//		});
		
		return name;
	}



	@Override
	public name deleteName(name name) {
		namedao.delete(name);
		return name;
	}

}
