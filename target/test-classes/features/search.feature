Feature: I can search

  Scenario: I can search posts related to search term
    Given input text in to search field "Запускаем кроссбраузерные UI test с Cucumber и Selenoid в Gitlab CI c Allure отчетом"
    When click to post page
    Then  I am on result page with "Запускаем кроссбраузерные UI test с Cucumber и Selenoid в Gitlab CI c Allure отчетом"
