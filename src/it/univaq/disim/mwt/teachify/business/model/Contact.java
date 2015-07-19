package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Access;
import static javax.persistence.AccessType.PROPERTY;

@Embeddable
@Access(PROPERTY)
public class Contact implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String telephone;
	private String email;
	private String skype;

	public Contact() {
		super();
	}

	public Contact(String telephone, String email, String skype) {
		super();
		this.telephone = telephone;
		this.email = email;
		this.skype = skype;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Column(name="CONTACT_EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

}
