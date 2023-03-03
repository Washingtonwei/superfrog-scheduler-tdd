# Teaching Test-Driven Development and Object-Oriented Design by Example

Commit message: Generate payment forms for SuperFrog Students API endpoint [RED] :rotating_light:

This commit describes the red phase :rotating_light: of the red, green, and refactor cycle.

In this phase, we write only one integration test case for an API endpoint: Generate payment forms for SuperFrog Students who have completed at least one appearance during a period. This test case is destined to fail because the implementation does not exist. However, this test case does inform the implementation of this new feature. Note that, there should be more than one test case. But at this moment, we only consider one. More test cases will be added during the refactoring phase.

The test case is available at src/test/java/edu/tcu/cs/superfrogscheduler/controller/PaymentControllerTest.java

In this test case, we created a JSON string with selected request Ids and payment period.

```json
{
  "requestIds":[
    5,
    6,
    12,
    16,
    17,
    20,
    22
  ],
  "paymentPeriod":{
    "beginDate":"2023-04-01",
    "endDate":"2023-04-30"
  }
}
```

We then used a MockMvc object to simulate an HTTP POST request to perform integration testing of REST controllers. In this test case, we are expecting an HTTP OK status code (200), a "Payment forms are generated successfully." message, and a list of 3 payment forms.
```json
{
  "flag": true,
  "code": 200,
  "message": "Payment forms are generated successfully.",
  "data": [
    {
      "firstName": "John",
      "lastName": "Doe",
      "studentId": 1004,
      "paymentPeriod": {
        "beginDate": "2023-04-01",
        "endDate": "2023-04-30"
      },
      "amount": 1215.250
    },
    {
      "firstName": "Tim",
      "lastName": "Johnson",
      "studentId": 1012,
      "paymentPeriod": {
        "beginDate": "2023-04-01",
        "endDate": "2023-04-30"
      },
      "amount": 200.000
    },
    {
      "firstName": "Jane",
      "lastName": "Smith",
      "studentId": 1001,
      "paymentPeriod": {
        "beginDate": "2023-04-01",
        "endDate": "2023-04-30"
      },
      "amount": 972.750
    }
  ]
}
```

To get rid of the compile error in the test case, we created two classes under controller package:
- RequestIds: This class describes a Data Transfer Object (DTO) that is used to temporarily hold data from an HTTP request.
- PaymentController: This class defines various REST APIs.

To get rid of the compile error in the test case, we created one class under domain package:
- Result: This is a custom object that represents an API endpoint response: flag, status code, message, and response data.

Each class only contains information to make sure that the test case is compile-error free.
