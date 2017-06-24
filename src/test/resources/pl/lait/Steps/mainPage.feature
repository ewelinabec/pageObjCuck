	Feature: Main page testing top bar
	
	Scenario: Open main page and click sign-on link
		Given I open main page
		When I cilck link sign-on
		Then Ishould see login page
		
	Scenario: Open main page and click all links
		Given I open main page
		When I cilck link "REGISTER"
		When I cilck link "SUPPORT"
		And I cilck link "CONTACT"
		And I cilck link "SIGN-ON"
		Then I should see "Sign-on: Mercury Tours" page title