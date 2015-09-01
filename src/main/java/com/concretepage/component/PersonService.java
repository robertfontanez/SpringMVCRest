package com.concretepage.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class PersonService implements IPersonService {
	
	@Override
	public String getPersonName(){
		return "Robert Fontanez";
	}
}
