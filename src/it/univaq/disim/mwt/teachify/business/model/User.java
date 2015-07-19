package it.univaq.disim.mwt.teachify.business.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Access;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.eclipse.persistence.annotations.Noncacheable;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Table(name="USERS")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="U_TYPE")
@DiscriminatorValue("U")
@Access(PROPERTY)
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String email;
	private String password;
	private String name;
	private String surname;

	private Collection<Group> groups;

	private byte[] photo;

	public User() {
		super();
	}

	public User(Long id) {
		super();
		this.id = id;
	}

	public User(String email, String password, String name, String surname, Collection<Group> groups) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.groups = groups;
	}

	public User(Long id, String email, String password, String name, String surname, Collection<Group> groups) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.groups = groups;
	}
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(generator="UserSeq")
	@SequenceGenerator(name="UserSeq", sequenceName="USERS_SEQ" , allocationSize=1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@ManyToMany(fetch =FetchType.EAGER, cascade={CascadeType.ALL})
	@JoinTable(name="USERS_GROUPS", joinColumns={@JoinColumn(name="USER_ID")}, inverseJoinColumns={@JoinColumn(name="GROUP_ID")})
	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}
	
	@Transient
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}



}
