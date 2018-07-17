package com.one97.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "BlogPost")
public class BlogPost extends Publication {

	@Column
	private String url;
	
}