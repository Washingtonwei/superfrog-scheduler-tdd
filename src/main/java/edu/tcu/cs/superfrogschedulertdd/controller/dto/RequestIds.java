package edu.tcu.cs.superfrogschedulertdd.controller.dto;

import edu.tcu.cs.superfrogschedulertdd.domain.Period;

import java.util.List;

/**
 * A data transfer object used to encapsulate a list of selected request ids and the payment period.
 */
public class RequestIds {

    private List<Integer> requestIds;

    private Period paymentPeriod;

    public RequestIds(List<Integer> requestIds, Period paymentPeriod) {
        this.requestIds = requestIds;
        this.paymentPeriod = paymentPeriod;
    }

}
