Feature: DiningExperienceFeature
  This features deals with the whole dining experience

  Scenario: Dining experience
    Given I scan the qr code and navigate to the menu page
    And I picked the dishes
    And I place my order
    And I confirm my order
    And I make my payment
    Then I should see payment successful info