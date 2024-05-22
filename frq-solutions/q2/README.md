# 2024 Question 2

## This question is about 
- Create a custom class that represents a score board for a sporting event.
- Managing all of the data such as team names, scores, and which team is active
- Updating instance variables to keep track of when a team scored
- creating an output statement to show the current standing of the game. 

## Struggles with this question
During the exam, one thing I struggled with was keeping my code DRY. Because I used
a String for the active team instead of a boolean (read more in what I learned), my code
got really repetitive. It took up a lot of space on paper and I was constantly second
guessing my work as I was writing.

## Prior experiences that helped 
Generally, every question 2 on the AP exam is very similar, they just have different contexts.
So, when we did the mock exam and I came across the spinner question, I struggled a lot. I didn't
get many points on that question and I was really confused on how to approach it. However, reviewing
the question and fully understanding how to do it helped me immensely on the day of the exam.
Overall, the practice questions we did in class and at home were extremely helpful. 

## What I learned by doing this question 
These were my instance variables I used on the test:
	```
private String team1;
private String team2;
private int score1;
private int score2;
private String active; //updated every time there was a score update 
	```
I learned that it would be better to use a boolean for the active team member than a String.
Booleans would make the if and else statements way shorter and easier to work with. On the AP
test, I used a lot of .equals which extended my lines of code. When I coded it out, I realized
that if I wasn't in such a rush and I thought about it for a little longer before I started
writing, I could have been more efficient and saved a lot of time.
