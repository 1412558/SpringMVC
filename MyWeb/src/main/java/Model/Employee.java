package Model;

import org.hibernate.validator.constraints.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
//@Entity
@Table(name = "EMP_TBL")
public class Employee implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	@NotEmpty(message="TÃªn khÃ´ng Ä‘Æ°á»£c rá»—ng!")
	private String name;

	@Column
	@NotEmpty(message="Email khÃ´ng Ä‘Æ°á»£c rá»—ng!")
	@Email(message="Email khÃ´ng nháº­p Ä‘Ãºng Ä‘á»‹nh dáº¡ng")
	private String email;

	@Column
	@NotEmpty(message="Ä�á»‹a chá»‰ khÃ´ng Ä‘Æ°á»£c rá»—ng!")
	private String address;

	@Column
	@NotEmpty(message="Ä�iá»‡n thoáº¡i khÃ´ng Ä‘Æ°á»£c rá»—ng!")
	@Size(min = 10, max = 11)
	private String telephone;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", address='" + address + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}