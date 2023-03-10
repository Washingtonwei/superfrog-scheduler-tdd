# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate payment forms for SuperFrog Students API endpoint [GREEN] :white_check_mark:

This commit describes the green phase :white_check_mark: of the red, green, and refactor cycle.

In this phase, we come up with a simple solution to implement the API endpoint: Generate payment forms for SuperFrog Students. The goal is to write just enough code to make the currently failing test pass.

We implemented the generatePaymentForms() method in the PaymentController class.

Changes made under domain package:
- PaymentForm: We annotated this class as a Jakarta Persistence API (JPA) entity.
- Period: We declared that this class will be embedded by other JPA entities.
- SuperFrogAppearanceRequest: We annotated this class as a JPA entity.
- SuperFrogStudent: We annotated this class as a JPA entity.

Changes made under controller package:
- PaymentController: We implemented the generatePaymentForms() method.
- HttpStatusCode: We added this class for holding static HTTP status codes.
- RequestIds: We added getters and setters for request Ids and payment period; we added a zero-argument constructor.

Changes made under datainitializer package:
- DBDataInitializer: This class is used to populate an in-memory database with SuperFrog students, requests, and so on.

Changes made under repository package:
- SuperFrogStudentRepository: We added this class to CRUD SuperFrog students from the database.
