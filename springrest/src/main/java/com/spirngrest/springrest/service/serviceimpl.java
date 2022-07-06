package com.spirngrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import com.spirngrest.springrest.entities.info;

public class serviceimpl implements service {

	List<info> list;
	
	public serviceimpl() {
		list= new ArrayList<>();
		list.add(new info(1, "hi"));
		list.add(new info(2, "the"));
	}
	
	@Override
	public List<info> home(String words) {
		// TODO Auto-generated method stub
		return list;
	}

}
