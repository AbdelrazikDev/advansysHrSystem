package com.advansys.hr.persistence.dao.user.entity;

import java.math.BigDecimal;

import javax.persistence.Id;


public class BaseEntity implements Cloneable {

	
	protected BigDecimal id;

	@Id
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
}
