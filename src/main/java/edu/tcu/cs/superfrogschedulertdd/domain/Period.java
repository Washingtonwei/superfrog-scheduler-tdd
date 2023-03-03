package edu.tcu.cs.superfrogschedulertdd.domain;

import java.time.LocalDate;

public class Period {

    private LocalDate beginDate;

    private LocalDate endDate;


    public Period(LocalDate beginDate, LocalDate endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

}
