Feature: 

	Background:
		#@PROF-234
		Given Student logged in the application
		

	@PROF-292 @PROF-249 @Test
	Scenario: Borrow Book Functionality Smoke Test
		When the user click the active Barrow Book button
		Then the user can see green pop up and borrow the book