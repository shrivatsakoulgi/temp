package com.test.springbatchdemo.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.test.springbatchdemo.model.CompanyUser;

@Component
public class UserProcessor implements ItemProcessor<CompanyUser, CompanyUser>{

	@Override
	public CompanyUser process(CompanyUser item) throws Exception {
		//some processing
		item.setDept(item.getDept().toUpperCase());
		return item;
	}

}
