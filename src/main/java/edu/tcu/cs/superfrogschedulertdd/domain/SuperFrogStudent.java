package edu.tcu.cs.superfrogschedulertdd.domain;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A SuperFrogStudent is a TCU student who plays as the mascot. She is a part of the TCU Spirit Team.
 * She gets paid for each appearance in an event.
 */
public class SuperFrogStudent {

    private String firstName;

    private String lastName;

    private Integer id;


    public SuperFrogStudent(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public PaymentForm generatePaymentForm(List<SuperFrogAppearanceRequest> requests) {
        /**
         * Group the given requests by their event type (TCU, NONPROFIT, and PRIVATE), then for each event type, calculate the number of hours
         * this SuperFrogStudent has worked. The result of this step is a Map<EventType, Double>.
         * For example:
         *  EventType.TCU -> 2.5 hrs
         *  EventType.NONPROFIT -> 3 hrs
         *  EventType.PRIVATE -> 2 hrs
         */
        Map<EventType, Double> eventTypeHoursMap = requests.stream().collect(Collectors.groupingBy(request -> request.getEventType(),
                Collectors.mapping(request -> request.getStartTime().until(request.getEndTime(), ChronoUnit.MINUTES) / 60.0,
                        Collectors.reducing(0.0, Double::sum))));

        BigDecimal totalAppearanceFee = new BigDecimal(0.0);

        // Calculate the total appearance fee by going over the map.
        for (Map.Entry<EventType, Double> entry : eventTypeHoursMap.entrySet()) {
            if (entry.getKey() == EventType.TCU || entry.getKey() == EventType.NONPROFIT) {
                totalAppearanceFee = totalAppearanceFee.add(BigDecimal.valueOf(100).multiply(BigDecimal.valueOf(entry.getValue())));
            } else {
                totalAppearanceFee = totalAppearanceFee.add(BigDecimal.valueOf(175).multiply(BigDecimal.valueOf(entry.getValue())));
            }
        }

        // We also need to consider transportation fee.
        Double totalMileage = requests.stream()
                .map(request -> request.getDistance() - 2) // The first 2 miles are free of charge.
                .filter(distance -> distance.compareTo(0.0) > 0)
                .reduce(0.0, (subtotal, distance) -> subtotal + distance);

        BigDecimal transportationFee = BigDecimal.valueOf(0.75).multiply(BigDecimal.valueOf(totalMileage));

        return new PaymentForm(totalAppearanceFee.add(transportationFee));
    }

}
