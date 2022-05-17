package com.te.java_8;

public class UdemyCourse {
	private String course_name;
	private double price;

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public UdemyCourse(String course_name, double price) {
		super();
		this.course_name = course_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "UdemyCourse [course_name=" + course_name + ", price=" + price + "]";
	}

}
