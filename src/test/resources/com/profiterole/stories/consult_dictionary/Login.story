Login
Narrative:
As a user
I want to login to the site
So that I have access to all functions

Scenario: Login to the site with correct credentials
Given the user is on the Login page
When the user enters login 'nikedrummer' and password '123456'
And clicks the Login button
Then the user sees the linkText 'Выход'
And the user sees the text on link 'Профиль'

Scenario: Login with incorrect data
Given the user is on the Login page
When the user enters login 'nike' and password '1234'
And clicks the Login button
Then the user sees validation message 'Вы ввели неверный логин и/или пароль'

Scenario: Login with empty input
Given the user is on the Login page
When the user enters login ' ' and password ' '
And clicks the Login button
Then the user sees validation message 'Вы ввели неверный логин и/или пароль'
