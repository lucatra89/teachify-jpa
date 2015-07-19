package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Access;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.AccessType.PROPERTY;
@Entity
@Table(name="LESSONS")
@Access(PROPERTY)
public class Lesson implements java.io.Serializable {

	private static final long serialVersionUID = 1L;


	private Long id;

	private Subject subject;

	private TypeOfEducation typeOfEducation;
	
	private Tutor tutor;

	public Lesson() {
		super();
	}

	public Lesson(Subject subject, TypeOfEducation typeOfEducation) {
		super();
		this.subject = subject;
		this.typeOfEducation = typeOfEducation;
	}

	public Lesson(Long id, Subject subject, TypeOfEducation typeOfEducation) {
		super();
		this.id = id;
		this.subject = subject;
		this.typeOfEducation = typeOfEducation;
	}
	
	@Id
	@Column(name="LESSON_ID")
	@SequenceGenerator(name="LesSeq", sequenceName="lessons_seq", allocationSize=1)
	@GeneratedValue(generator="LesSeq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@ManyToOne
	@JoinColumn(name="TYPE_OF_EDUCATION_ID")
	public TypeOfEducation getTypeOfEducation() {
		return typeOfEducation;
	}

	public void setTypeOfEducation(TypeOfEducation typeOfEducation) {
		this.typeOfEducation = typeOfEducation;
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
