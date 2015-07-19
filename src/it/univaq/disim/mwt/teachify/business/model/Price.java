package it.univaq.disim.mwt.teachify.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRICES")
public class Price  implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private int value;
	
	
	public Price() {
		super();
	}


	public Price(int value) {
		super();
		this.value = value;
	}


	public Price(Long id, int value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Id
	@Column(name="PRICE_ID")
	@SequenceGenerator(name="PrSeq", sequenceName="PRICES_SEQ", allocationSize=1)
	@GeneratedValue(generator="PrSeq")
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
