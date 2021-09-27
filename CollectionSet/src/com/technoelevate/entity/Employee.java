package com.technoelevate.entity;

public class Employee {

	private Integer id;
	private String name;
	private String city;

	public Employee(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Employee() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass() || obj == null)
			return false;
		Employee other = (Employee) obj;
		return this.getId().equals(other.getId()) && this.getName().equals(other.getName())
				&& this.getCity().equals(other.getCity());
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", city=" + city;
	}

}
