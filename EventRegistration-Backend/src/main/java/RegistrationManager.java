import javax.persistence.Entity;
import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Entity
public class RegistrationManager {
	private Event event;

	@OneToOne(cascade = { CascadeType.ALL }, optional = false)
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	private Person person;

	@OneToOne(mappedBy = "registrationManager", cascade = { CascadeType.ALL }, optional = false)
	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private Registration registration;

	@OneToOne(mappedBy = "registrationManager", cascade = { CascadeType.ALL }, optional = false)
	public Registration getRegistration() {
		return this.registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

}
