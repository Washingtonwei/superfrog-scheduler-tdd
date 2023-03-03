# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate payment forms for SuperFrog Students [RED] :rotating_light:

This commit describes the red phase :rotating_light: of the red, green, and refactor cycle.

In this phase, we write only one test case for a larger feature: Generate payment forms for SuperFrog Students who have completed at least one appearance during a period. This test case is destined to fail because the implementation does not exist. However, this test case does inform the implementation of this new feature. Note that, there should be more than one test case. But at this moment, we only consider one. More test cases will be added during the refactoring phase.

The new test case is available at src/test/java/edu/tcu/cs/superfrogscheduler/service/PaymentServiceTest.java

In this test case, we created a list of request Ids, a list of SuperFrog students, and a list of appearance requests. Since the method we are testing, generatePaymentForms(), relies on two repository objects (requestRepository and paymentFormRepository) to CRUD the data, we used a mocking framework to mock the two external dependencies. For example, when findByRequestIdIn() gets called, our predefined list of requests will be returned. This guarantees the "unity" of the test case. Our goal is to test the method for generating payment forms for SuperFrog students. This method is defined in the PaymentService class. It takes a list of completed request Ids, generates payment forms for each student, saves the payment forms to the database, and returns the saved payment forms. In the end, we need to make sure the expected number of forms generated matches the actual number of forms generated. Note that, there is no need to verify that the amount of payment for each student is correct here, since we have already tested that previously.

To get rid of the compile error in the test case, we created two classes under repository package:
- PaymentFormRepository: We added this class to CRUD payment forms from the database.
- SuperFrogAppearanceRequestRepository: We added this class to CRUD appearance requests from the database.

To get rid of the compile error in the test case, we created one class under service package:
- PaymentService: This class orchestrates the task of generating payment forms for SuperFrog students.

Each class only contains information to make sure that the test case is compile-error free.
