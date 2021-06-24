package person;

import peoples.employee;

public class Manager extends employee {
	private double asistance = 1;

	public double getAsistance() {
		return asistance;
	}
	public void setAsistance(double asistance) {
		this.asistance = asistance;
	}
	@Override
	public String toString()
	{
		return name + birthday + asistance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
