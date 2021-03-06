
Feature: Student Barrow Book

	Background:
		#@PROF-234
		Given Student logged in the application



	@PROF-242
	Scenario: Student can barrow books
		When the user click the active Barrow Book button
		Then the user can see green pop up and borrow the book


	@PROF-258  @Barrow
	Scenario: Book can not selected twice
		When the user click inactive Borrow Book button
		Then the user can not borrowed same book twice

	@PROF-259  @Barrow
	Scenario: History of borrowed books
		When the user navigate Borrowing Book module
		Then the user should see own borrowed books history

	@PROF-260 @Test
	Scenario: Return books
		When the user navigate Borrowing Book module
		Then the user should see own borrowed books history
		And the user click the active Return Book button
		Then the user see green pop up after return the book

	@PROF-261  @Barrow
	Scenario: Book Categories
		When the user click Book Categories dropdown box
		Then the user see all book categories
			| ALL                     |
			| Action and Adventure    |
			| Anthology               |
			| Classic                 |
			| Comic and Graphic Novel |
			| Crime and Detective     |
			| Drama                   |
			| Fable                   |
			| Fairy Tale              |
			| Fan-Fiction             |
			| Fantasy                 |
			| Historical Fiction      |
			| Horror                  |
			| Science Fiction         |
			| Biography/Autobiography |
			| Humor                   |
			| Romance                 |
			| Short Story             |
			| Essay                   |
			| Memoir                  |
			| Poetry                  |
		When the user select and click one category
		Then the user see books related to that category

	@PROF-263  @Barrow
	Scenario: Show records dropdown
		Then the user should be able to click to show records dropdown box
		When the user select one option in show records dropdown
		Then the user should be able to see the exact number of books that he selected


	@PROF-264  @Barrow
	Scenario: Finding Book
		When the user in search box should type the name of the book
		Then the user will see all books according to search
		When the user in search box should type the name of author
		Then the user can see all books written by author that he searched