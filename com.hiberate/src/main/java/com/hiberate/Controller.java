package com.hiberate;

import java.util.Scanner;

public class Controller {
	{
		System.out.println("WELCOME TO CUSTOMER MENU");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao = new CustomerDao();
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		boolean check = true;
		while (check) {
			System.out.println("************************************************************");
			System.out.println("*********************Operations Menu************************");
			System.out.println("************************************************************");
			System.out.println("1. Insert\n2.Fetch\n3.Fetch All\n4.Update\n5.Delete\n6.Cancel");
			System.out.println("************************************************************");
			System.out.println("Enter your choice: ");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("************************************************************");
				System.out.println("***************************INSERT***************************");
				System.out.println("************************************************************");
				System.out.println("Enter the name: ");
				String name = sc.next();
				System.out.println("Enter the pname: ");
				String pname = sc.next();
				System.out.println("Enter the price: ");
				int price = sc.nextInt();
				Customer customer = new Customer(name, pname, price);
				dao.save(customer);
			}
				break;
			case 2: {
				System.out.println("************************************************************");
				System.out.println("***************************FETCH****************************");
				System.out.println("************************************************************");
				System.out.println("Enter the id you want to fetch: ");
				int id = sc.nextInt();
				c = dao.fetch(id);
				System.out.println(c);
			}
				break;
			case 3: {
				System.out.println("************************************************************");
				System.out.println("************************FETCH***ALL*************************");
				System.out.println("************************************************************");
				System.out.println(dao.fetchAll());
			}
				break;
			case 4: {
				System.out.println("************************************************************");
				System.out.println("**************************UPDATE****************************");
				System.out.println("************************************************************");
				System.out.println("Enter the id you want to fetch to update: ");
				int id = sc.nextInt();
				c = dao.fetch(id);
				System.out.println("Enter the new Product name: ");
				String pname1 = sc.next();
				c.setPname(pname1);
				dao.update(c);
			}
				break;
			case 5: {
				System.out.println("************************************************************");
				System.out.println("***************************DELETE***************************");
				System.out.println("************************************************************");
				System.out.println("Enter the id you want to fetch to delete: ");
				int id = sc.nextInt();
				c = dao.fetch(id);
				dao.delete(c);
			}
				break;
			case 6:
				System.out.println("Cancelled");
				System.out.println("Thank You!!!! For using our application....");
				check = false;
				break;
			default:
				System.out.println("Invalid Input!!!");
				System.out.println("Enter if you want to continue(y/n): ");
				String val = sc.next();
				if(val == "y") {
					break;
				}
				else {
					System.out.println("Cancelled");
					System.out.println("Thank You!!!! For using our application....");
					check = false;
				}
				break;
			}

		}

	}

}
