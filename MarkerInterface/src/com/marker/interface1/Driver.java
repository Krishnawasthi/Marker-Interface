package com.marker.interface1;


class Hospital implements Cloneable  //this class has given permission to clone itself.
{
	
    String pateintName;
    String PId;
    
	public Hospital(String pateintName, String pId) {
		
		super();
		this.pateintName = pateintName;
		this.PId = pId;
	}
	@Override  //we have override this from Object class the mother of all the classes
	public Object clone() throws CloneNotSupportedException{
		 
		return super.clone();
	}
	
}

public class Driver {

	public static void main(String[] args)  throws CloneNotSupportedException {
	  
		Hospital h = new Hospital("Rahan", "P123#rahan");//created obejct
		
		Hospital h1 = (Hospital) h.clone();//clonning the obejct
		
		System.out.println(h1.pateintName+ " " + h1.PId);
		
		
		GoldUser goldUser = new GoldUser();
		
		if(goldUser instanceof User) {
			System.out.println("gold type of user.....");
		}
		else {
			System.out.println("no.....");
		}

	}

}
