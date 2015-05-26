Login
Narrative:
As a user
I want to login to the site
So that I have access to all functions

Scenario: Login to the site as 'nikedrummer'
Given the user is on the Login page
When the user enters login 'nikedrummer' and password '123456'
And click the Login button
Then the user see the linkText 'Выход'