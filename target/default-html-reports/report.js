$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SmokeTest.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Student logged in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.profillo.step_definitions.LoginStepDefs.student_logged_in_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Borrow Book Functionality Smoke Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PROF-292"
    },
    {
      "name": "@PROF-249"
    },
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "the user click the active Barrow Book button",
  "keyword": "When "
});
formatter.match({
  "location": "com.profillo.step_definitions.BarrowBook_stepdefs.the_user_click_the_active_Barrow_Book_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user can see green pop up and borrow the book",
  "keyword": "Then "
});
formatter.match({
  "location": "com.profillo.step_definitions.BarrowBook_stepdefs.the_user_can_see_green_pop_up_and_borrow_the_book()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/StudentBarrowBook.feature");
formatter.feature({
  "name": "Student Barrow Book",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Student logged in the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.profillo.step_definitions.LoginStepDefs.student_logged_in_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Return books",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PROF-260"
    },
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "the user navigate Borrowing Book module",
  "keyword": "When "
});
formatter.match({
  "location": "com.profillo.step_definitions.HistoryBorrowed_stepDefs.the_user_navigate_Borrowing_Book_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see own borrowed books history",
  "keyword": "Then "
});
formatter.match({
  "location": "com.profillo.step_definitions.HistoryBorrowed_stepDefs.the_user_should_see_own_borrowed_books_history()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the active Return Book button",
  "keyword": "And "
});
formatter.match({
  "location": "com.profillo.step_definitions.ReturnBooks_stepDefs.the_user_click_the_active_Return_Book_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user see green pop up after return the book",
  "keyword": "Then "
});
formatter.match({
  "location": "com.profillo.step_definitions.ReturnBooks_stepDefs.the_user_see_green_pop_up_after_return_the_book()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});