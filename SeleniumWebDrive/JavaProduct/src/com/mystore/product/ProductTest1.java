package com.mystore.product;

public class ProductTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product iphone = new Product();
		Product desktop = new Product();
		
		iphone.name="iphone";
		iphone.price= 399.00;
		iphone.skuID="iphone1";
		
		System.out.println(iphone.name);
		System.out.println(iphone.price);
		System.out.println(iphone.skuID);
		
		desktop.name="desktop";
		desktop.price= 199.00;
		desktop.skuID="desktop1";
		
		System.out.println(desktop.name);
		System.out.println(desktop.price);
		System.out.println(desktop.skuID);
		
		iphone.purchase(3);
		desktop.purchase(5);
		
		System.out.println(iphone.calculatePrice(2));
		System.out.println(desktop.calculatePrice(2));
		
		

	}
	
	

}
