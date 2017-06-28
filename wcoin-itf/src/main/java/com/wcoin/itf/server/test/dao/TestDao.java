package com.wcoin.itf.server.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.wcoin.itf.server.test.domain.User;

public interface  TestDao extends CrudRepository<User, Long> {

	public User findByEmail(String email);

}
