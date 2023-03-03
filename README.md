# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate a payment form for a SuperFrog Student [REFACTOR] :hammer:

This commit describes the refactor phase :hammer: of the red, green, and refactor cycle.

In this phase, code refactoring is the top priority. The refactored code will still pass the test, but is more maintainable.

Refactoring the class SuperFrogStudent's generatePaymentForm() method include
- By adopting the strategy pattern using enum, we eliminated the if...else block in the loop used to calculate the total appearance fee. 
- By adopting the singleton pattern and single responsibility principle, we moved the logic of computing transportation fees into a new singleton class, TransportationFeeCalculator.
- We removed the "Magic Numbers" such as 2.0, 0.75, 100, and 175 from the generatePaymentForm() method.
- We added a new class Period to encapsulate a payment cycle (start and end date).
- We added more fields in class PaymentForm such as the name of the student, student Id, and payment period.

Refactoring the class SuperFrogAppearanceRequest include
- We added requestId as a new field.
- We renamed the field distance to mileage.
- By adopting the information expert principle, we added a new method getMileageOver() to return the extra mileage over the provided freeMileage.

Refactoring the test class SuperFrogStudentTest include
- We added more test cases such as student with zero completed requests, student with only one completed request during the period.
- Each test case verifies newly added fields in a PaymentForm.
