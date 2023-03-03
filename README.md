# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate a payment form for a SuperFrog Student [RED] :rotating_light:

This commit describes the red phase :rotating_light: (the starting point) of the red, green, and refactor cycle. 

In this phase, we write only one test case for a new feature: Generate a payment form for a SuperFrog Student. This test case is destined to fail because the implementation does not exist. However, this test case does inform the implementation of this new feature. Note that, there should be more than one test case. But at this moment, we only consider one. More test cases will be added during the refactoring phase.

In this test case, we created a SuperFrog student and a list of completed appearance requests. A SuperFrog student has a name and an Id. A request has an event type (used to determine pay rate), distance from the campus (used to determine the transportation fee), start and end time (used to compute the length of the event), and the SuperFrog student who attended the appearance. Our goal is to test the method for generating a correct payment form for a SuperFrog student. This method is defined in the SuperFrogStudent class. It takes a list of completed requests and returns the generated payment form. The form is supposed to store the total amount of money that shall be paid to the student. In the end, we need to make sure the expected amount matches the actual computed payment amount. Note that, the payment form shall contain more information such as the student’s Id and the payment period. But at this moment, we only consider the amount of money is calculated correctly. The rest will be postponed to the refactoring phase.
To get rid of the compile error in the test case, we created five classes under domain package:

- EventType: This is an enum type that allows only TCU, NONPROFIT, and PRIVATE values.
- PaymentForm: This class describes a payment form for a SuperFrog student.
- RequestStatus: There are various status of a request. For example, COMPLETED.
- SuperFrogAppearanceRequest: This class describes an appearance request submitted by a customer.
- SuperFrogStudent: This class describes a SuperFrog student who plays as the SuperFrog.

Each class only contains information to make sure that the test case is compile-error free.
