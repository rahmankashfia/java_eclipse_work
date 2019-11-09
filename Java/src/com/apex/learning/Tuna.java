package com.apex.learning;

public class Tuna {
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = ((hour > 0 && hour < 24) ? hour : 0);
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = ((minute > 0 && minute < 60) ? minute : 0);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = ((second > 0 && second < 60) ? second : 0);
	}
	
	String toMilitaryTime(int h, int m, int s) {
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
		String m_time = String.format("%2d:%2d:%2d",this.getHour(), this.getMinute(), this.getSecond());
		return m_time;
	}
}
