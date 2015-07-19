package it.univaq.disim.mwt.teachify.business.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Access;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Access(PROPERTY)
public class Feedback implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private int rating;
	private Date createdAt;
	private User user;
	private Tutor tutor;

	public Feedback() {
		super();
	}

	public Feedback(String description, int rating, Date createdAt, User user,Lesson lesson) {
		super();
		this.description = description;
		this.setRating(rating);
		this.createdAt = createdAt;
		this.user = user;
	}

	public Feedback(Long id, String description, int rating, Date createdAt, User user, Lesson lesson) {
		super();
		this.setId(id);
		this.description = description;
		this.setRating(rating);
		this.createdAt = createdAt;
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
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@ManyToOne
	@JoinColumn(name="TUTOR_ID")
	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	@Id
	@Column(name="FEEDBACK_ID")
	@GeneratedValue(generator="FeeSeq")
	@SequenceGenerator(name="FeeSeq", sequenceName="FEEDBACK_SEQ", allocationSize=1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
