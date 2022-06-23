## Task:
Create console application which display mathematical operations, accept and verify answer  

## Acceptance scenarios:

### Open and exit
Given I have opened application
When I type "exit" and press Enter
Then I see that application is closed

### Positive scenario
Given I have opened application
And I see "1 + 2"
When I input "3" and press Enter
Then I see "True"
And I see a new task

### Negative scenario
Given I have opened application
And I see "1 + 2"
When I input "5" and press Enter
Then I see "False"
And print the same task again