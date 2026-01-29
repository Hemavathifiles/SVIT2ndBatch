package oopsdemo;

//fooditem
public class ObjectDemo {
	//attribute or variables or dm or states , properties
	String name;
	double price;
	String category;
	
	//method or behavior or member func or funct
	
	void display()
	{
		System.out.println("Food name : " + name);
		System.out.println("Price : "+ price);
		System.out.println("Category : "+ category);
		System.out.println("---------");
	}
	

	public static void main(String[] args) {
		ObjectDemo obj=new ObjectDemo();
		obj.name = " Veg Burger ";
		obj.price=129.0;
		obj.category="Fast Food";
		
		ObjectDemo obj1=new ObjectDemo();
		obj1.name = "Panner Pizza";
		obj1.price=189.0;
		obj1.category="Fast Food";
		
		
		ObjectDemo obj2=new ObjectDemo();
		obj2.name = "Cold coffee";
		obj2.price=150.0;
		obj2.category="Beverage";
		
		
		obj.display();
		obj1.display();
		obj2.display();
		
	}

}
