package com.revature.organization.model;



import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organisations")
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column(name="`name`")
	private String name;
	@Column(name="`alias name`")
	private String alias;
	@Column(name="`type`")
	private String type;
	@Column(name="`createdon`")
	 private Instant createdon;
	@Column(name="`modifiedon`")
	private Instant modifiedon;
	@Column(name="`isactive`")
	private Boolean isActive;
	@Column(name="`isuserverification`")
	private Boolean isUserVerification;
	@Column(name="`issignup`")
	private Boolean isSignup;
	

	

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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsUserVerification() {
		return isUserVerification;
	}

	public void setIsUserVerification(Boolean isUserVerification) {
		this.isUserVerification = isUserVerification;
	}

	public Boolean getIsSignup() {
		return isSignup;
	}

	public void setIsSignup(Boolean isSignup) {
		this.isSignup = isSignup;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", alias=" + alias + ", type=" + type + ", createdon="
				+ createdon + ", modifiedon=" + modifiedon + ", isActive=" + isActive + ", isUserVerification="
				+ isUserVerification + ", isSignup=" + isSignup + "]";
	}


	



}
