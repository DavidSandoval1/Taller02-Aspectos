import main.PetStore;

public aspect CheckAsurrance {
	pointcut verifyAssurance(): execution(void PetStore.makeAppointment());
}
