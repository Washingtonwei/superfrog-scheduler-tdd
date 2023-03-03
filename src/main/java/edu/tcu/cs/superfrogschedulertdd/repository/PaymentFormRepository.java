package edu.tcu.cs.superfrogschedulertdd.repository;

import edu.tcu.cs.superfrogschedulertdd.domain.PaymentForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentFormRepository extends JpaRepository<PaymentForm, Integer> {
}
