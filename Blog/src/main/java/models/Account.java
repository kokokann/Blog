package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog_account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;
	private String username;
	private String password;
	private String gender;
	
	

	public Account( String username, String password, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
	}
	
	

	public Account() {
		
	}



	public Long getId() {
		return user_id;
	}

	public void setId(Long id) {
		this.user_id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
