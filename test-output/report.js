$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/investment_calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Investment Calculator",
  "description": "",
  "id": "investment-calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to get the right amount after input",
  "description": "",
  "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a user already on the investment calculator website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user submits \"\u003cstartingAmount\u003e\", \"\u003cafterYear\u003e\", and \"\u003creturnRate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the annual schedule list should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;",
  "rows": [
    {
      "cells": [
        "startingAmount",
        "afterYear",
        "returnRate"
      ],
      "line": 9,
      "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;;1"
    },
    {
      "cells": [
        "20000.00",
        "15",
        "3"
      ],
      "line": 10,
      "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;;2"
    },
    {
      "cells": [
        "15000.00",
        "30",
        "4"
      ],
      "line": 11,
      "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7421691700,
  "status": "passed"
});
formatter.before({
  "duration": 4161508400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should be able to get the right amount after input",
  "description": "",
  "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a user already on the investment calculator website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user submits \"20000.00\", \"15\", and \"3\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the annual schedule list should display",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentCalculatorSteps.a_user_already_on_the_investment_calculator_website()"
});
formatter.result({
  "duration": 1298108800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 750824200,
  "status": "passed"
});
formatter.before({
  "duration": 4051660600,
  "status": "passed"
});
formatter.before({
  "duration": 4229877000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to get the right amount after input",
  "description": "",
  "id": "investment-calculator;user-should-be-able-to-get-the-right-amount-after-input;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "a user already on the investment calculator website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user submits \"15000.00\", \"30\", and \"4\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the annual schedule list should display",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentCalculatorSteps.a_user_already_on_the_investment_calculator_website()"
});
formatter.result({
  "duration": 2292921200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 852613300,
  "status": "passed"
});
});