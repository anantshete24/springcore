package com.sprincore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{

		
		protected double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Pepsi() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Pepsi [price=" + price + "]";
		}

		@Override
		public void afterPropertiesSet() throws Exception {

			System.out.println("Taking Pepsi: init");
			
		}

		@Override
		public void destroy() throws Exception {
			
			System.out.println("Taking Pepsi: Destroy");
		} 
		

}
