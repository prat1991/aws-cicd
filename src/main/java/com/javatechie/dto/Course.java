package com.javatechie.dto;

public class Course {
	// Private fields
	private int id;
	private String name;
	private double price;

	// Default no-args constructor
	public Course() {
	}

	// All-args constructor
	public Course(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// toString method
	@Override
	public String toString() {
		return "Course(id=" + this.id + ", name=" + this.name + ", price=" + this.price + ")";
	}

	// equals and hashCode methods
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Course course = (Course) o;

		if (id != course.id)
			return false;
		if (Double.compare(course.price, price) != 0)
			return false;
		return name != null ? name.equals(course.name) : course.name == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		temp = Double.doubleToLongBits(price);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}