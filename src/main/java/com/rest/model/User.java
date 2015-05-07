package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="ID", nullable=false, unique=true, length=11)
	    private int id;

	    @Column(name="NAME", length=20, nullable=true)
	    private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
