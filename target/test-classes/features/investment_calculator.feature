Feature: Investment Calculator

Scenario Outline: User should be able to get the right amount after input
Given a user already on the investment calculator website
When user submits "<startingAmount>", "<afterYear>", and "<returnRate>"
Then the annual schedule list should display

Examples:
	|startingAmount    |afterYear |returnRate |
	|20000.00          |15        |3          |
	|15000.00          |30        |4          |