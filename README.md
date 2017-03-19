# 1DV506, Problem Solving and Programming, Autumn 2016
## [Assignment 1: Getting Started](http://homepage.lnu.se/staff/jlnmsi/java1/lab1eng.html)
Problems?

Do not hesitate to ask your teaching assistant at the practical meetings (or Jonas at the lectures) if you have any problems. You can also post a question in the assignment forum in Moodle.
### Exercises
#### Lecture 1 (Getting Started)
1. Install Java
Download and install Java SE JDK: www.oracle.com/technetwork/java/javase/downloads. Also, there are plenty of instruction videos available in YouTube. Just search for "Install Java X" where X is your operating system.
2. Install Eclipse
Download and install Eclipse IDE for Java Developers: http://www.eclipse.org/downloads/. Once again, there are plenty of instruction videos available in YouTube. Just search for "Install Eclipse X" where X is your operating system.
3. Setup Eclipse Workspace
Before you start programming, do the following.
- Create an Eclipse workspace (a folder) with the name java_courses on some location in your home directory.
- Create a Java project with the name 1DV506 inside the workspace.
- Create a package with the name YourLnuUserName_assign1 inside the project. For example, it might look something like wo222ab_assign1.
- Save all program files from the exercises in this assignment inside the package YourLnuUserName_assign1.
- In the future: create a new package (YourLnuUserName_assignX) for each assignment and a new project (with the course code as name) for each new course using Java.
4.Edit, compile and execute.
Create, compile and execute the following program inside your assignment 1 package:

>   /* The classical "Hello World!" program. */
>   public class Hello {
>      
>       public static void main(String[] args) { 	
>          System.out.println("Hello World!"); // Print
>       }	      
>   }
#### Lecture 2 - (Input/Output, Operations on Primitive Types)
5. [Printing](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Print.java)

Write a program Print.java, which will print the phrase *Knowledge is power!*
- on one line,
- on three lines, one word on each line,
- inside a rectangle made up by the characters = and |.
6. [Quote](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Quote.java)

Write a program Quote.java which reads a line of text (using class Scanner ) and then prints the same line as a quote (that is inside " "). An example of an execution:
>    Write a line of text:  I wish I was a punk rocker with flowers in my hair.
>
>    Quote: "I wish I was a punk rocker with flowers in my hair."
7. [Number of seconds](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Seconds.java)

Write a program Seconds.java which reads three integers (hours, minutes, seconds) and then computes the corresponding time measured in seconds. For example, 1 hour, 28 minutes and 42 seconds is equal to 5322 seconds. An example of an execution:
>     Hours: 1
>
>     Minutes: 28
>
>     Seconds: 42
>
>
>     Total time measured in seconds: 5322
8. [BMI](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/BMI.java)

Write a program BMI.java which computes the BMI (Body Mass Index) for a person. The program will read length and weight from the keyboard and then present the result as output. The BMI is computed as weight/(length)^2, where the length is given in meters and the weight in kilograms. An example of an execution:
>    Give your length in meters: 1,83
>
>    Give your weight in kilograms: 83
>
>    Your BMI is: 25

		
Note: the BMI is always an integer.
9. [Time](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Time.java)

Write a program Time.java, which reads a number of seconds (an integer) and then prints the same amount of time given in hours, minutes and seconds. An example of an execution:
>    Give a number of seconds: 9999
>
>    This corresponds to: 2 hours, 46 minutes and 39 seconds.

Hint: Use integer division and the modulus (remainder) operator.
10. [Sum of Three](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/SumOfThree.java)

Write a program SumOfThree.java which asks the user to provide a three digit number. The program should then compute the sum of the three digits. For example:
>    Provide a three digit number: 483
>
>    Sum of digits: 15

*If Time Permits*

*Exercise 11 is marked as VG task ==> only mandatory for those of you that aspire for a higher mark (A or B).*

11. [Change (VG-task)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Change.java)
#### Lecture 3 - Using Library Classes
12. [Fahrenheit to Celsius](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Convert.java)
13. [Short Name](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/ShortName.java)
14. [Random Number](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/TelephoneNumber.java)
15. [Square Root](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Distance.java)

*If Time Permits*

*Exercise 16 is marked as VG task ==> only mandatory for those of you that aspire for a higher mark (A or B).*

16. [Wind Chill (VG-task)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/WindChill.java)
### Submission
*Only exercises 5-16 should be handed in. (Notice that the VG exercises 11 and 16 are not mandatory.) We are only interested in your .java files. Hence, zip the directory named YourLnuUserName_assign1 (inside directory named src) and submit it using the Moodle submission system.*
## Assignment 2
## Assignment 3: Methods and Classes
## Assignment 4: Exceptions, IO, and Interfaces
