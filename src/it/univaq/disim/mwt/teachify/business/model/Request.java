package it.univaq.disim.mwt.teachify.business.model;


import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="REQUESTS")
@Access(AccessType.PROPERTY)
public class Request implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Tutor tutor;
	private User user;
	private String description;
	private StatusRequest status;
	private Date createdAt;

	public Request() {
		super();
	}

	@Id
	@Column(name="REQUEST_ID")
	@SequenceGenerator(name="ReqSeq", sequenceName="REQUESTS_SEQ", allocationSize=1)
	@GeneratedValue(generator="ReqSeq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="USER_ID")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_AT")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Enumerated(EnumType.STRING)
	public StatusRequest getStatus() {
		return status;
	}


	public void setStatus(StatusRequest status) {
		this.status = status;
	}

	@ManyToOne
	@JoinColumn(name="TUTOR_ID")
	public Tutor getTutor() {
		return tutor;
	}


	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}



}
