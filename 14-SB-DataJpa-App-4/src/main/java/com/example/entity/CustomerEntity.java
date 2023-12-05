package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "CSTMR_DTLS")
public class CustomerEntity {
		@Id 
		@Column(name = "CUSTOMER_ID")
		private Integer customerId;
		
		@Column(name = "CUSTOMER_NAME")
		private String customerName;
		
		@Column(name = "CUSTOMER_EMAIL")
		private String customerEmail;

		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}
		@Override
		public String toString() {
			return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
					+ customerEmail + "]";
		}


		
}
