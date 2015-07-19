package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TYPES_OF_EDUCATION")
public class TypeOfEducation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public TypeOfEducation() {
		super();
	}

	public TypeOfEducation(String name) {
		super();
		this.name = name;
	}

	public TypeOfEducation(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Id
	@Column(name="TYPE_OF_EDUCATION_ID")
	@SequenceGenerator(name="TYOSeq", sequenceName="TYPES_OF_EDUCATION_SEQ", allocationSize=1)
	@GeneratedValue(generator="TYOSeq")
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
