package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "ORDER_DTLS")
public class Order {
	@Id
	@GenericGenerator(name = "order_id_generator",strategy ="OrderIdGenerator")
	@GeneratedValue(generator="order_id_generator")
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Resource [orderId=" + orderId + ", customerName=" + customerName + "]";
	}
	
	
	
	
	
}
