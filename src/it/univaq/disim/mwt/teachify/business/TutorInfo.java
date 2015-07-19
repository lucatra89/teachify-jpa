package it.univaq.disim.mwt.teachify.business;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
		  name="tutor-info-map",
		  entities={
		    @EntityResult(
		      entityClass=TutorInfo.class,
		      fields={
		        @FieldResult(name="id", column="USER_ID"),
		        @FieldResult(name="distance", column="DISTANCE")
		  }
)})
@NamedNativeQuery(name="TutorInfo.find",
query="SELECT DISTINCT t.user_id , t.distance "+
			" FROM (SELECT u.user_id, sdo_nn_distance (1) distance " +
					" FROM tutors u " + 
					" WHERE sdo_nn (u.tutor_geo_location, SDO_GEOMETRY(2001, 8307, SDO_POINT_TYPE (?,?,NULL), NULL, NULL),'sdo_num_res=200', 1)= 'TRUE'"+
					" ORDER BY distance) t"+
				" JOIN lessons l ON l.tutor_id = t.user_id "+
				" WHERE ('TRUE'=? OR l.subject_id = ?)" + 
				" AND ( 'TRUE'=? OR l.type_of_education_id = ? )",
resultSetMapping="tutor-info-map")
@Access(AccessType.PROPERTY)
@Entity
public class TutorInfo implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private long distance;
	
	public TutorInfo() {
	}

	public TutorInfo(Long id, long distance) {
		super();
		this.setId(id);
		this.distance = distance;
	}


	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}
	
	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
