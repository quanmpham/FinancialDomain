Feature: As a user I want to be able to input my information in
	the 401k Calculator so that I could project the amount that
	I would have when I retire

Scenario Outline: User should be able to calculate 401k balance at retirement
Given a user already on the website
When user submits "<currentAge>", "<currentAnnualSalary>", "<current401kBalance>", "<contribution%OfSalary>","<employerMatch>", and "<employerMatchLimit>"
And clicks calculate
Then the 401k balance should be correct

Examples: 
	|currentAge |currentAnnualSalary |current401kBalance |contribution%OfSalary |employerMatch |employerMatchLimit |
	|28         |80000               |0                  |10                    |10            |3                  |             
	|33         |100000              |50000              |10                    |10            |5                  |