# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate payment forms for SuperFrog Students [REFACTOR] :hammer:

This commit describes the refactor phase :hammer: of the red, green, and refactor cycle.

In this phase, code refactoring is the top priority. The refactored code will still pass the test, but is more maintainable.

Refactoring the class PaymentService's generatePaymentForms() method include
- We extracted the logic to group requests by SuperFrogStudent into its own method. This makes the code less cluttered.

Refactoring the test class PaymentServiceTest include
- We added more test cases: empty request Id list and one-element request Id list.
