package com.mygrocery;
import java.util.*;

public class GroceryList {
	public ArrayList<String> groceryList = new ArrayList<String>();
	//Method for adding item to the grocery list
	public void addGroceryItem(String item)
	{
		groceryList.add(item);
	}
	// Method for printing grocery item
	public void printGroceryList()
	{
		System.out.println("You have "+groceryList.size()
				+" item in your grocery list......");
		for(int i = 0; i < groceryList.size(); i++)
		{
		  System.out.println((i+1)+". "	+groceryList.get(i));
		}
	}
	//Method to modify grocery item
	public void modifyGroceryItem(int position,String newItem)
	{
		groceryList.set(position, newItem);
		System.out.println("Grocery item "+(position+1)+" has been modified...");
	}
	//Method to remove item
	public void removeGroceryItem(int position)
	{
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	//Method to find item
	public String findGroceryItem(String searchItem)
	{
		boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0)
		{
			return groceryList.get(position);
		}
		return null;
	}

}
