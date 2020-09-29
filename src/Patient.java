import java.util.ArrayList;


/**
 * This class describes a patient at a hospital
 * @author Jonathan Terry
 *
 */
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	
	/**
	 * A parameterized constructor. Creates a new instance of this class and sets that instance's variables
	 * to there respective parameter values
	 * @param id: An integer describing an id number assigned to the patient on admission
	 * @param firstName: A String representing the patient's first name
	 * @param lastName: A String representing the patient's last name
	 * @param allergies: An ArrayList of type String representing all allergies the patient has
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		allergies = new ArrayList<String>();
	}
	
	/**
	 * This method adds an allergy to the patient's list of allergies
	 * @param allergy: A String representing a new allergy of the patient
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * This method provides a readable representation of the values associated with an instance of this class
	 * @return String:
	 */
	public String toString() {
		String allergies;
		if(this.allergies.isEmpty()) {
			allergies = "None";
		}
		
		else {
			allergies = this.allergies.toString();
		}
		return "Patient " + this.id + ": " + this.firstName + " " + this.lastName + 
				"\n  Allergies: " + allergies + "\n\n";
	}

}
