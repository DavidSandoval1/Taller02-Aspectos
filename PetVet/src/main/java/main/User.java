package main;
public class User {

	public int id = 0;
	public String petName = "";
	public String petOwner = "";
	public String levelAssurance = "";
	public String appointment = ""; 
   
	public boolean isActive = true;
   
   public User(int id, String petName, String petOwner, String levelAssurance, boolean isActive){
       this.id = id;
       this.petName = petName;
       this.petOwner = petOwner;
       this.levelAssurance = levelAssurance;
       this.isActive = isActive;
   }

   public int getId() {
		return id;
	}
		
		
	public void setId(int id) {
		this.id = id;
	}
   
   public String getPetName() {
	   return petName;
	}
	
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	
	public String getPetOwner() {
		return petOwner;
	}
	
	
	public void setPetOwner(String petOwner) {
		this.petOwner = petOwner;
	}
	
	
	public String getLevelAssurance() {
		return levelAssurance;
	}
	
	
	public void setLevelAssurance(String levelAssurance) {
		this.levelAssurance = levelAssurance;
	}
	
	
	public boolean isActive() {
		return isActive;
	}
	
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	public void setAppointment(String date) {
		this.appointment = date;
	}
	

	public String toString(){
      return "(" + getPetOwner() + " has a pet named, " + getPetName() + ") with " 
	 + getLevelAssurance() + " membership ";
   }

}
