package com.spring.controller;


	import java.util.Date;
	 
	public class User {
	    public User(String username, String password, String email, Date birthDate, String profession) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
			this.birthDate = birthDate;
			this.profession = profession;
		}
		private String username;
	    private String password;
	    private String email;
	    private Date birthDate;
	    private String profession;
	 
	    public String getUsername() {
	    	return username;
	    }
	    public String getPassword() {
	    	return password;
	    }
	    public String getEmail() {
	    	return email;
	    }
	    public Date getBirthDate() {
	    	return birthDate;
	    }
	    public String getProfession() {
	    	return profession;
	    }
	    
	    public void setUsername( String username ) {
	    	username = this.username;
	    }
	    public void setPassword( String password ) {
	    	password = this.password;
	    }
	    public void setEmail( String email ) {
	    	email = this.email;
	    }
	    public void setBirthDate( Date birthDate ) {
	    	birthDate = this.birthDate;
	    }
	    public void setProfession( String profession ) {
	    	profession = this.profession;
	    }
	}

