Feature: DiningExperienceFeature
  This features deals with the whole dining experience

  Scenario Outline: Dining experience
    Given I scan the qr code and navigate to the menu pages "<QrUrl>"
    And I picked the dishes
    And I place my order
    And I confirm my order
    And I make my payment
    Then I should see payment successful info

    Examples:
    |QrUrl|
    |http://54.169.128.207:3000/#/home/1|
    |http://54.169.128.207:3000/#/home/2|
    |http://54.169.128.207:3000/#/home/3|
