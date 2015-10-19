package slo.model;

public class SLOModel {

	private String name;
	private int age;
	private double weight;
	
	public SLOModel()
	{
		age = -99;
		weight = -00000.62;
		name = "";
	}
	
	public SLOModel(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
		}
	
	public String toString()
	{
		String petInfo = name + "is" + age + "years old and weighs " + weight;
		return petInfo;
	}
	
}
