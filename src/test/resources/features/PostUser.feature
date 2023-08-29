Feature: Create user

  @PostUser
  Scenario Outline: Create user successfully.
    When I consume the endpoint "<endpoint>" and I send the user information email "<email>", username "<username>", password "<password >", firstname "<firstname>" ,lastname "<lastaname>"
    Then I can validate the response services <code>

    Examples:
      | email | username | password   | firstname | lastname | endpoint | code |
      | 1100  | Nokia    | Shibba inu | Diana     | Osorio   | /user    | 200  |