package it.univaq.disim.mwt.teachify.business.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="GROUPS")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public Group() {
		super();
	}

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group(Long id, String name) {
		super();
		this.setId(id);
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Id
	@Column(name="GROUP_ID")
	@SequenceGenerator(name="GroupSeq", sequenceName="GROUPS_SEQ", allocationSize=1)
	@GeneratedValue(generator="GroupSeq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
