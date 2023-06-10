package com.test.springbatchdemo.batch;


import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.springbatchdemo.model.CompanyUser;
import com.test.springbatchdemo.repository.UserRepository;

@Component
public class UserItemWriter implements ItemWriter<CompanyUser>{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends CompanyUser> items) throws Exception {
		System.out.println("Saving all users:"+items);
		userRepository.saveAll(items);
		
	}
	


}
