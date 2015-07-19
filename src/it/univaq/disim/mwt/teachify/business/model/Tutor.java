package it.univaq.disim.mwt.teachify.business.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Access;
import javax.persistence.Table;

import static javax.persistence.AccessType.PROPERTY;

@NamedNativeQuery(name="Tutor.updateGeoLocation", query="UPDATE tutors SET tutor_geo_location = SDO_GEOMETRY(2001, 8307, SDO_POINT_TYPE (?,?,NULL), NULL, NULL) WHERE USER_ID=?")

@Entity
@DiscriminatorValue("T")
@Table(name="TUTORS")
@Access(PROPERTY)
public class Tutor extends User{

	private static final long serialVersionUID = 1L;

	private float rating;

	private Location location;

	private Price price;

	private String description;
	private Contact contact;
	private Collection<Lesson> lessons;
	private Collection<Availability> availabilities;

	public Tutor() {
		super();
		
	}

	public Tutor(Long id) {
		super(id);
	}
	

	@OneToMany( mappedBy = "tutor", orphanRemoval = true, fetch = FetchType.EAGER, cascade={CascadeType.ALL})
	public Collection<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Collection<Lesson> lessons) {
		this.lessons = lessons;
	}

	@OneToMany(mappedBy = "tutor" , orphanRemoval = true, fetch = FetchType.EAGER, cascade={CascadeType.ALL})
	public Collection<Availability> getAvailabilities() {
		return availabilities;
	}

	public void setAvailabilities(Collection<Availability> availabilities) {
		this.availabilities = availabilities;
	}

	@Embedded
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToOne
	@JoinColumn(name="PRICE_ID")
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Embedded
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
