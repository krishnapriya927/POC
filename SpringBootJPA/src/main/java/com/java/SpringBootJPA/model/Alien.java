package com.java.SpringBootJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alien")
public class Alien {
	
@Id
@Column(name="a_id")
@GeneratedValue
public int aid;
@Column(name="a_name")
public String aname;

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}

@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + "]";
}

}
