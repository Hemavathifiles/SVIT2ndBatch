package org.tnsif.acc.c2tc.oopsdemo;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}
class  UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment done using UPI");
	}
}

class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment done using Card");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Payment payment;
		
		payment=new UpiPayment();
		payment.makePayment();
		
		payment=new CardPayment();
		payment.makePayment();
		
		
		

	}

}
