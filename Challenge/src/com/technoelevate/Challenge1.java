package com.technoelevate;

public class Challenge1 {
	public String getDurationString(int minute, int second) {
		int hr = 0;
		if (minute >= 0 && second >= 0 && second < 60) {
			hr = minute / 60;
			minute = minute % 60;
			return "" + hr + "h  " + minute + "m  " + second + "s";
		}
		return "invalied input";
	}

	public String getDurationString(int second) {
		int min = 0;
		if (second < 0) {
			return "invalied input";
		}
		min = second / 60;
		second = second % 60;
		String durationString = this.getDurationString(min, second);
		return durationString;
	}
}
