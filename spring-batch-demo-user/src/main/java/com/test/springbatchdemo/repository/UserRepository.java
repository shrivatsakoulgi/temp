package com.test.springbatchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springbatchdemo.model.CompanyUser;

@Repository
public interface UserRepository extends JpaRepository<CompanyUser,Integer>{

}
