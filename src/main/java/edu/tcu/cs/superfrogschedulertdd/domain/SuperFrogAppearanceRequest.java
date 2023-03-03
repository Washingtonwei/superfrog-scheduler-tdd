package edu.tcu.cs.superfrogschedulertdd.domain;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * A customer can request a SuperFrog appearance by submitting a SuperFrogAppearanceRequest.
 * A SuperFrogAppearanceRequest includes event-related information.
 */
public class SuperFrogAppearanceRequest {

    public SuperFrogAppearanceRequest(EventType eventType, String address, Double distance, LocalDate eventDate, LocalTime startTime, LocalTime endTime, RequestStatus status, SuperFrogStudent student) {
    }

}
