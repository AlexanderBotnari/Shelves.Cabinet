package main;

import Cabinet.Cabinet;
import Things.Book;
import Things.Phone;
import Things.Tablet;
import Things.Thing;
public class Aplication {

	public static void main(String[] args){
	    		
	    
		Cabinet cabinet = new Cabinet();
		cabinet.put("topShelf", new Phone("Apple Iphone 11"));
		cabinet.put("middleShelf", new Book("Book: Programming in Java for beginners"));
	        cabinet.put("bottomShelf", new Tablet("Apple IPad 2th generation"));
			
	        
	        Thing thing = cabinet.whatIsOn("topShelf");
	        System.out.println(thing.getName());
		thing = cabinet.whatIsOn("middleShelf");
		System.out.println(thing.getName());
		thing = cabinet.whatIsOn("bottomShelf");
		System.out.println(thing.getName());
	    	
		    
	        thing = cabinet.take("topshelf");
		    try{
		    System.out.println(thing.getName());
	            }catch(NullPointerException e) {
	    	          System.err.println("There is no object on the top shelf!");
	            }
	   
	}

}
