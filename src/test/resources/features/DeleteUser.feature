Feature: Delete user

  @DeleteUser
  Scenario Outline: Create user successfully.
    When I consume the endpoint "<endpoint>" and I send the user information id "<id>"
    Then I can validate response service <phone>

    Examples:
      | id   | endpoint | phone  |
      | 2023 | /user    | 315869 |