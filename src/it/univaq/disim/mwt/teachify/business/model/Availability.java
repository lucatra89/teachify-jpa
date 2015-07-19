package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Access;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Table(name="AVAILABILITIES")
@Access(PROPERTY)
public class Availability implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Day day;
	private Hour from;
	private Hour to;
	private Tutor tutor;
	
	public Availability() {
		super();
	}
	
	public Availability(Day day, Hour from, Hour to) {
		super();
		this.day = day;
		this.from = from;
		this.to = to;
	}
	
	public Availability(Long id, Day day, Hour from, Hour to) {
		super();
		this.setId(id);
		this.day = day;
		this.from = from;
		this.to = to;
	}

	@Enumerated(EnumType.STRING)
	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
	@ManyToOne
	@JoinColumn(name="FROM_HOUR_ID")
	public Hour getFrom() {
		return from;
	}

	public void setFrom(Hour from) {
		this.from = from;
	}
	@ManyToOne
	@JoinColumn(name="TO_HOUR_ID")
	public Hour getTo() {
		return to;
	}

	public void setTo(Hour to) {
		this.to = to;
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
	@Column(name="AVAILABILITY_ID")
	@GeneratedValue(generator="AvSeq")
	@SequenceGenerator(name="AvSeq", sequenceName="AVAILABILITIES_SEQ", allocationSize=1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
