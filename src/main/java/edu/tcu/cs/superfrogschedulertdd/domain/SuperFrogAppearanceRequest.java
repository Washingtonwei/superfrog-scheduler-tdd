package edu.tcu.cs.superfrogschedulertdd.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * A customer can request a SuperFrog appearance by submitting a SuperFrogAppearanceRequest.
 * A SuperFrogAppearanceRequest includes event-related information.
 */
@Entity
public class SuperFrogAppearanceRequest {

    @Id
    private Integer requestId;

    private EventType eventType;

    private String address;

    private Double mileage;

    private LocalDate eventDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private RequestStatus status;

    @ManyToOne
    private SuperFrogStudent student;


    public SuperFrogAppearanceRequest() {
    }

    public SuperFrogAppearanceRequest(Integer requestId, EventType eventType, String address, Double mileage, LocalDate eventDate, LocalTime startTime, LocalTime endTime, RequestStatus status, SuperFrogStudent student) {
        this.requestId = requestId;
        this.eventType = eventType;
        this.address = address;
        this.mileage = mileage;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.student = student;
    }

    /**
     * This method returns the extra mileage over the provided freeMileage.
     * If the distance is no greater than the provided freeMileage, the method returns 0.0.
     * Otherwise, it returns the extra mileage.
     *
     * @param freeMileage for example, the current free mileage is 2 miles.
     * @return extra mileage
     */
    public Double getMileageOver(Double freeMileage) {
        return this.mileage.compareTo(freeMileage) <= 0 ? 0.0 : this.mileage - freeMileage;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Double getMileage() {
        return mileage;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public SuperFrogStudent getStudent() {
        return student;
    }

}
