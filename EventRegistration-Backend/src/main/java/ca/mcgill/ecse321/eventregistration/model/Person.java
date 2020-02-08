package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import RegistrationManager;
import javax.persistence.Id;

@Entity
public class Person{
   private RegistrationManager registrationManager;

public void setRegistrationManager(RegistrationManager value) {
    this.registrationManager = value;
}
public RegistrationManager getRegistrationManager() {
    return this.registrationManager;
}
private String name;

public void setName(String value) {
    this.name = value;
}
@Id
public String getName() {
    return this.name;
}
}
