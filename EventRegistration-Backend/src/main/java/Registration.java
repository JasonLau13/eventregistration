import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Registration {
	private Person person;

	@OneToOne(optional = false)
	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private Event event;

	@OneToOne(optional = false)
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	private Integer id;

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getId() {
		return this.id;
	}

	private RegistrationManager registrationManager;

	@OneToOne(optional = false)
	public RegistrationManager getRegistrationManager() {
		return this.registrationManager;
	}

	public void setRegistrationManager(RegistrationManager registrationManager) {
		this.registrationManager = registrationManager;
	}

}
