package edu.tcu.cs.superfrogschedulertdd.domain;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * A customer can request a SuperFrog appearance by submitting a SuperFrogAppearanceRequest.
 * A SuperFrogAppearanceRequest includes event-related information.
 */
public class SuperFrogAppearanceRequest {

    private EventType eventType;

    private String address;

    private Double distance;

    private LocalDate eventDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private RequestStatus status;

    private SuperFrogStudent student;


    public SuperFrogAppearanceRequest(EventType eventType, String address, Double distance, LocalDate eventDate, LocalTime startTime, LocalTime endTime, RequestStatus status, SuperFrogStudent student) {
        this.eventType = eventType;
        this.address = address;
        this.distance = distance;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.student = student;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Double getDistance() {
        return distance;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

}
