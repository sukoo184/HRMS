package kodlamaio.hrms.entities.concrate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor


public class Candidate extends User{
	
	@Id
	@Column(name="id")
	private int id;
	
	
	@Column(name="first_name")
	private String firstName;

	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	

	@Column(name="birthdate")
	private Date birthdate;
	
	private String isChackPassword;
	
	

}
