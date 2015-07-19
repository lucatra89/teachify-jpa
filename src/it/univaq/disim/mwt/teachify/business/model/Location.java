package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Access;
import static javax.persistence.AccessType.PROPERTY;

@Embeddable
@Access(PROPERTY)
public class Location implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private float latitude;
	private float longitude;
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	@Column(name="LOCATION_NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
