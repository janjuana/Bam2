Feature: GetStats2

Scenario: Get Nba Traditional Stats

		When I open nba.com
		And I export data 
    Then I close browser 
