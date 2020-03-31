package asterisk.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column
	private String fullname;
	
	
	@Column
	private String username;
	
	@Column
    private String password;
 
    @Column(name = "created_at")
    private Date createdAt;
 
    @Column(name = "modified_at")
    private Date modifiedAt;

}
