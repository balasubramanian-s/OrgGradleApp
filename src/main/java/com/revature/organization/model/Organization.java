package com.revature.organization.model;



import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String alias;
	@Column
	private String type;
	@Column
	 private Instant createdon;
	@Column
	private Instant modifiedon;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Instant getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Instant ts) {
		this.createdon = ts;
	}

	public Instant getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Instant modifiedon) {
		this.modifiedon = modifiedon;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", alias=" + alias + ", type=" + type + ", createdon="
				+ createdon + ", modifiedon=" + modifiedon + "]";
	}

	



}
