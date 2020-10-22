# java-Calculator
Calculator written in Java with the ability to choose the data type (int, short, long, float, double) and to do the following operations: addition, subtraction, multiplication, division, and modulus.

## Java Version
openjdk version "1.8.0_265"

## Background
[TL;DR] : Brief explanation as to why the calculator took almost 4 years to make.

This was originally a project I started during my winter break in 2016. I could not find a calculator that did modulus, so I decided that I would make one. I thought it would be interesting to also create a calculator that would allow the user to choose the primitive data type they wanted (int, short, long, float, or double). The original files are in the `old/` folder. During the winter break of 2016, I was able to finish most of the calculator. However, I did not finish the GUI completely as I needed to parse the numbers from the String they were stored in. Not a difficult task, but with my school work starting up again, I did not have time. Then when I was an SI in Fall 2018, the students asked me what a GUI was. I proceeded to show them this project, but I had forgotten that it did not parse the numbers yet. So over winter break in 2018, I quickly set up the parse feature, so that I had a minimal viable product, but there were still many bugs and problems that I needed to deal with still. But unfortunately I ran out of time and needed to put the project on hold again. Then in my final semester I realized that the code needed to be refactored as I did not have the best coding practices my freshman year. I decided that as soon as I graduated I would finish the project. However, once I graduated I had many other ideas of projects that I thought were more interesting which further pushed this project back. So, that is the story of why this calculator took almost 4 years to become a decent calculator.

## Files
**old/Calculator.java** - original Calculator class, not refactored
<br />**old/calcTester.java** - original command line tester for the Calculator, not refactored
<br />**old/calcGUI.java** - original GUI for the Calculator, not refactored and contains many bugs
<br /><br />**new/Calculator.java** - new Calculator class, refactored
<br />**new/calcTester.java** - new command line tester for the Calculator, refactored
<br />**new/calcGUI.java** - new GUI for the Calculator, refactored and deals with many bugs

In the **(old || new)/bin/** folders are the compiled version for the respective files.

## Refactoring
(Coming soon)




## How to Use
(Coming soon)


## Future Work
- [ ] use GridLayout or GridBagLayout to allow for resizing of the window.
- [ ] allow user to use keyboard to input numbers.
- [ ] exponents, roots, boolean algebra, character math (ASCII) 
- [ ] allow user to change colors.
