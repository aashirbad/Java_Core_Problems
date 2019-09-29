package com.Program.Cls;

public class InstanceVariable {
	private int roll;
	private String name ;
	private double fee;

	public static void main(String[] args) {
	
			InstanceVariable d = new InstanceVariable();
			d.setFee(121.012);
			d.setName("Aashirbad");
			d.setRoll(1);
			
		System.out.println(d.getFee() + " " + d.getName() + " " + d.getRoll());
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public double getFee() {
		return fee;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
