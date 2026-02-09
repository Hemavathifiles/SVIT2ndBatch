package org.tnsif.acc.c2tc.oopsdemo;

class Device
{
	void deviceType()
	{
		System.out.println("Devive Type : Electronic Device");
	}
}
class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : Samsung");
	}
}

class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features : Touchscreen , Camera , Internet");
	}
}


public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.deviceType();
		smartphone.brand();
		smartphone.features();

	}

}
