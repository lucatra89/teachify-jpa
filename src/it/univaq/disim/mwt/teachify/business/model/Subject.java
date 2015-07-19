package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Access;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Table(name="SUBJECTS")
@Access(PROPERTY)
public class Subject implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public Subject() {
		super();
	}

	public Subject(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Subject(String name) {
		super();
		this.name = name;
	}
	
	@Id
	@Column(name="SUBJECT_ID")
	@SequenceGenerator(name="SubSeq", sequenceName="SUBJECTS_SEQ", allocationSize=1)
	@GeneratedValue(generator="SubSeq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
