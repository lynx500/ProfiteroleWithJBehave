Create Menu

Narrative:
As a user
I want to create menu on day
So that I can see it in my profile

Scenario: Open page woth required headlines
Given the user is on the MenuOnDay page
When the user clicks the Breakfast button
Then the user sees left headline 'Ваш завтрак'
And the user sees right headline 'Рецепты'

Scenario: Open window with desired recipe
Given the user is on the MenuOnDay page
And the user clicks the Breakfast button
When the user clicks ukrainian cuisine
And the user clicks milk
Then the user sees the headline in the modal recipe window 'Молоко'

Scenario: Add milk on breakfast
Given the user is on the MenuOnDay page
And the user clicks the Breakfast button
When the user clicks ukrainian cuisine
And drag and drops milk on breakfast
Then the user sees milk in the menu