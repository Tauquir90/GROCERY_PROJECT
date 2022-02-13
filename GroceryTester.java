package com.mygrocery;

import java.util.Scanner;

public class GroceryTester {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList grocery = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice=0;
		printInstruction();
		while(!quit)
		{
			System.out.println("Enter your choice....\t");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 0:
				     printInstruction();
				     break;
				     
			case 1:
				      grocery.printGroceryList();
				      break;
			 
			case 2:
				     addItem();
				     break;
				     
			case 3:
				     modifyItem();
				     break;
				     
			case 4:
				    removeItem();
				    break;
				    
			case 5:
				    searchForItem();
				    break;
				    
			case 6:
				     quit=true;
				     break;
			}
		}

	}
	public static void printInstruction(){
		System.out.println("\n Press");
		System.out.println("\t 0-To-Print Choice option.");
		System.out.println("\t 1-To print list of grocery item. ");
		System.out.println("\t 2-To add an item to grocery list.");
		System.out.println("\t 3-To Modify an item in grocery list.");
		System.out.println("\t 4-To remove an item from grocery list.");
		System.out.println("\t 5- To search for item in grocery list.");
		System.out.println("\t To quit application.");
	}
	public static void addItem(){
		System.out.println("plz enter grocery item.....\t");
		grocery.addGroceryItem(sc.nextLine());
		
		
	}
	public static void modifyItem(){
		System.out.println("Enter item number :");
		int itemNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter replacement item :");
		String newItem = sc.nextLine();
		sc.nextLine();
		grocery.modifyGroceryItem(itemNumber-1, newItem);
		
	}
	public static void removeItem()
	{
		System.out.println("Enter item number :");
		int itemNo = sc.nextInt();
		sc.nextLine();
		grocery.removeGroceryItem(itemNo-1);
		
	}
	public static void searchForItem()
	{
		System.out.println("Enter item to search for......");
		String searchItem = sc.nextLine();
		if(grocery.findGroceryItem(searchItem)!=null){
			System.out.println("found "+searchItem + " in your grocery list");
			
		}
		else{
			System.out.println(searchItem +" is not in grocery list.");
		}
	}

}
