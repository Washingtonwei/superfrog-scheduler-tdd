package edu.tcu.cs.superfrogschedulertdd.domain;

import java.math.BigDecimal;

/**
 * A payment form needs to be generated for each SuperFrog Student so that
 * she can get paid by TCU Payroll.
 * <p>
 * The amount is calculated based on
 * 1. number of appearances done within a given start and end date
 * 2. event type
 * 3. hours
 * 4. mileage (distance between TCU and the event address, the first 2 miles are free of charge, then $0.75/mile)
 */
public class PaymentForm {

    public BigDecimal getAmount() {
        return null;
    }

}