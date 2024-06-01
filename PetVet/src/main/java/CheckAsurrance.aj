import main.PetStore;

public aspect CheckAsurrance {
	pointcut verifyAssurance(): execution(void PetStore.makeAppointment());
	
	before(): verifyAssurance(){
		String petName = PetStore.readConsole("Verifying assurance...\nName of your pet: ");
		System.out.println("Welcome "+petName+"\nYou are able to use this service");
	}
}
