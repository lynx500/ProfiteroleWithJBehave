ForgotPassword
Narrative:
As a user
I want to use my email
So that I can get my old password

Scenario: Retrieve password with correct email
Given the user is on the ForgotPassword page
When the user enters email 'whj12403@haqed.com'
And clicks the Next button
Then the user sees the message 'На Ваш Email отправлено сообщение со ссылкой для восстановления пароля.'

Scenario: Retrieve password with incorrect email
Given the user is on the ForgotPassword page
When the user enters email 'dfgd@dfg.dg'
And clicks the Next button
Then the user sees the validation message 'Пользователь с данным e-mail адрессом не зарегистрирован.'

Scenario: Retrieve password with empty input
Given the user is on the ForgotPassword page
When the user enters email ' '
And clicks the Next button
Then the user sees the validation message 'Поле не должно быть пустым.'



