package com.wcoin.common.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class CommonUser implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 protected Long  id;	
	
 protected  String name;
  
 protected String phone;
  
  
 protected String password;


public abstract Long getId();


public abstract void setId(Long id) ;


public  abstract String getName();


public abstract void setName(String name);

public abstract String getPhone();


public abstract void setPhone(String phone);


public abstract String getPassword();


public abstract void setPassword(String password) ;
  
   
	
}
