package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HOURS")
@Access(AccessType.PROPERTY)
public class Hour implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private int value;

	public Hour() {
		super();
	}

	public Hour(int nome) {
		super();
		this.value = nome;
	}

	public Hour(Long id, int nome) {
		super();
		this.id = id;
		this.value = nome;
	}

	@Id
	@Column(name="HOUR_ID")
	@SequenceGenerator(name="HSeq", sequenceName="HOURS_SEQ", allocationSize=1)
	@GeneratedValue(generator="HSeq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}
