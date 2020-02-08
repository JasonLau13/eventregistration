import java.sql.Time;
import java.sql.Date;
import javax.persistence.Entity;

@Entity
public class Event {
	private Date eventDate;

	public void setEventDate(Date value) {
		this.eventDate = value;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	private Time startTime;

	public void setStartTime(Time value) {
		this.startTime = value;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	private Time endTime;

	public void setEndTime(Time value) {
		this.endTime = value;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	private String name;

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}
}