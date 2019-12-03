using System;
using System.Collections.Generic;

public class Program
{
	public static void Main()
	{
		Console.WriteLine("Welcome to the Solar System");
		
		
		Planet Mercury = new Planet("Mercury", 1516, true);
		Planet Venus = new Planet("Venus", 3760.4f, true);
		Planet Earth = new Planet("Earth", 3958.8f, true);
		Planet Mars = new Planet("Mars", 2106.1f, true);
		Planet Jupiter = new Planet("Jupiter", 43441f, false); //
		Planet Saturn = new Planet("Saturn", 36184f, false); //
		Planet Uranus = new Planet("Uranus", 15759f, false); //
		Planet Neptune = new Planet("Neptune", 15299f, false); //
		
		Planet[] solarSystem = {Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune};

		
		//bug testing
		Console.WriteLine(Earth.getName());
		Console.WriteLine(solarSystem[2].getSize());
		Saturn.Stats();
	}
}

class Planet
{
	private String name;
	private float size;
	private bool isSolid;
	
	public Planet()
	{
		name = null;
		size = 0f;
		isSolid = true;
	}

	public Planet(String nm, float sz, bool solid)
	{
		name = nm;
		size = sz;
		isSolid = solid;
	}

	public String getName()
	{
		return name;
	}

	public String getSize()
	{
		String returnStr;
		String strInit = size.ToString();
		
		if(size > 10000){ returnStr = strInit.Substring(0,2) + "," + strInit.Substring(2);}
		else if(size > 1000){returnStr = strInit.Substring(0,1)+ "," + strInit.Substring(1);}
		else{returnStr = strInit;}
		return (returnStr + " miles");
	}

	public bool getIsSolid()
	{
		return isSolid;
	}

	public void Stats()
	{
		Console.WriteLine("These are the stats for " + name + "\nsize(radius): " + this.getSize() + "\nis it a solid: " + isSolid);
	}
}
