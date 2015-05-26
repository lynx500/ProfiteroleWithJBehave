Registration

Narrative:
As a user
I want to register in the site
So that I can have access to all features

Scenario: Registration with empty input
Given the user is on the Registration page
When the user clicks the Register button
Then the user sees validation message empty email 'Поле не должно быть пустым.'
And accept the conditions 'Для завершения регистрации Вы должны принять Правила и условия работы на сайте.'

Scenario: Registration a new user
Given the user is on the Registration page
When the user fills out all the fields
And sets country 'Германия'
And the user clicks the Register button
Then appears message about successful registration 'Регистрация прошла успешно'