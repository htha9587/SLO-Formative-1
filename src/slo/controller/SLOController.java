package slo.controller;

import slo.view.SLOView;
import slo.model.SLOModel;

public class SLOController {

	private SLOView myPopups;
	private SLOModel myPet;
	
	public SLOController()
	{
		myPopups = new SLOView();
	}
	
	public void start()
	{
		
		String name = myPopups.getAnswer("Type your pets name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("Type in your pets age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("That can't be your pet's age! Type in an Integer!");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = 12345678;
		}
		
		myPopups.displayResponse("You typed in" + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("How big is your pet? Type in his or her weight!");
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("This is supposed to be a valid double value!");
		}
		
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		
		else
		{
			double a = .9999901;
			double b = 0.000001;
			double c = a-b;
			if (Math.abs(c-1.0) <=0.000001);
		}
		
		weight = Double.parseDouble(tempWeight);
		
		myPet = new SLOModel(name, age, weight);
		myPopups.displayResponse(myPet.toString());
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not return a valid Integer :(");
		}
		return isInt;
	}
	
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid double.");
		}
		
		return isDouble;
		
		
	}
}
