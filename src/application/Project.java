package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Project {

	public static void main(String[] args) {

		Department obj = new Department(1, "BOOKS");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);	
		
		System.out.println(seller);
	}

}
