package edu.tcu.cs.superfrogschedulertdd.service;

import edu.tcu.cs.superfrogschedulertdd.domain.PaymentForm;
import edu.tcu.cs.superfrogschedulertdd.domain.Period;
import edu.tcu.cs.superfrogschedulertdd.repository.PaymentFormRepository;
import edu.tcu.cs.superfrogschedulertdd.repository.SuperFrogAppearanceRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private SuperFrogAppearanceRequestRepository requestRepository;

    private PaymentFormRepository paymentFormRepository;


    public PaymentService(SuperFrogAppearanceRequestRepository requestRepository, PaymentFormRepository paymentFormRepository) {
        this.requestRepository = requestRepository;
        this.paymentFormRepository = paymentFormRepository;
    }

    public List<PaymentForm> generatePaymentForms(List<Integer> appearanceRequestIdList, Period paymentPeriod) {
        return List.of();
    }

}
