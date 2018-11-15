package com.c137.util;

public enum DaysofWeek {
	
	SUNDAY("SUNDAY", 1),
	MONDAY("MONDAY", 2),
	TUESDAY("TUESDAY", 3),
	WEDNESDAY("WEDNESDAY",4),
	THURSDAY("THURSDAY",5),
	FRIDAY("FRIDAY",6),
	SATURDAY("SATURDAY",7);
	
	private String label;
	private Integer value;
	
	private DaysofWeek(String label, Integer value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
	
}
