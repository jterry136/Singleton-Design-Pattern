import java.util.ArrayList;


/**
 * This class represents a system to manage patients at a hostpital
 * @author Jonathan Terry
 *
 */
public class HospitalSystem {
	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalSystem;
	
	/**
	 * A constructor for the hospital system. Creates a new ArrayList of type Patient for the system.
	 */
	private HospitalSystem() {
		this.patients = new ArrayList<Patient>();
	}
	
	/**
	 * Returns the instance of the HospitalSystem class
	 * @return
	 */
	public static HospitalSystem getInstance() {
		if(hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}
		return hospitalSystem;
	}
	
	/**
	 * This method adds a patient to the hospital system's patients ArrayList.
	 * @param firstName A String representing the patient's first name.
	 * @param lastName A String representing the patient's last name.
	 * @return An integer representing the patient's new id number.
	 */
	public int addPatient(String firstName, String lastName) {
		Patient patient = new Patient(patients.size() + 1, firstName, lastName);
		patients.add(patient);
		return patients.size();
	}
	
	/**
	 * Gets the Patient object from the patients ArrayList at the id number (also position in the ArrayList) and returns it
	 * @param id: An integer representing a patient's assigned id number
	 * @return: The patient object associated with the provided id
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * Gets a Patient by id number using getRecord(), then adds the allergy to the patient's allergies
	 * @param id: An integer representing the patient's assigned id number
	 * @param allergy: A String describing a patient's allergy
	 */
	public void addAllergy(int id, String allergy) {
		Patient patient = getRecord(id - 1);
		patient.addAllergy(allergy);
	}
	
	/**
	 * This method presents all patient data in a human readable format
	 * @return A String containing all data from all patients
	 */
	public String getAllPatientsData() {
		String data = "";
		for(Patient patient : patients) {
		 data += patient.toString() + "\n";
		}
		return data;
	}
	
	
	
	
	
	
	
	
	

}
