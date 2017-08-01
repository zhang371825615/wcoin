package com.wcoin.itf.server.asyz.domain;

import javax.persistence.Entity;
import javax.persistence.Table;



import com.wcoin.common.domain.CommonUser;
@Entity
@Table(name="asyz_account")
public class AsyzAccountEntity  extends CommonUser {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6623522424844498757L;


	private Long balance;
	
	
	private Long  lockBalance;
	
	
	
	
	public AsyzAccountEntity() {
		super();
	}
	
	public AsyzAccountEntity(long id) {
		super.id=id;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getLockBalance() {
		return lockBalance;
	}

	public void setLockBalance(Long lockBalance) {
		this.lockBalance = lockBalance;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

}
