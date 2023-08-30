Feature: Update user

  @PutUser
  Scenario Outline: Update user successfully.
    When I consume  endpoint "<endpoint>" and I send the user information email "<email>", username "<username>", password "<password >", firstname "<firstname>" ,lastname "<lastaname>"
    Then I can validate the response service <code>

    Examples:
      | email | username | password   | firstname | lastname | endpoint | code |
      | 1100  | Nokia    | Shibba inu | Diana     | Osorio   | /user    | 200  |