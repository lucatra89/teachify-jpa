package it.univaq.disim.mwt.teachify.business;

public class RequestTutors implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private float latitude;
	private float longitude;
	private Long subjectId;
	private Long typeOfEducationId;

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

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getTypeOfEducationId() {
		return typeOfEducationId;
	}

	public void setTypeOfEducationId(Long typeOfEducationId) {
		this.typeOfEducationId = typeOfEducationId;
	}

}
