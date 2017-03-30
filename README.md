# 1DV506, Problem Solving and Programming, Autumn 2016
## [Assignment 1: Getting Started](http://homepage.lnu.se/staff/jlnmsi/java1/lab1eng.html)
#### Problems?

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

Write a program Change.java that computes the change a customer should receive when he has paid a certain sum. The program should exactly describe the minimum number of Swedish bills and coins that should be returned rounded off to nearest krona (kr). Example:
> Price: 372.38
>
> Payment: 1000
> <br>
> <br>
> Change: 628 kronor
>
> 1000kr bills: 0
>
>  500kr bills: 1
>
>  100kr bills: 1
>
>   50kr bills: 0
>
>   20kr bills: 1
>
>   10kr coins: 0
>
>    5kr coins: 1
>
>    1kr coins: 3

#### Lecture 3 - Using Library Classes
12. [Fahrenheit to Celsius](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Convert.java)

Write a program Convert.java, which reads a temperature in Fahrenheit and then converts it to Celsius using the formula:

>    C = (F-32)*5/9

The result should be presented with a single decimal correctly rounded off.

13. [Short Name](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/ShortName.java)

Write a program ShortName.java, reading a first name and a last name (given name and family name) as two Strings. The output should consist of the first letter of the first name followed by a dot and a space, followed by the first four letters of the last name. An example of an execution:

>    First name: Anakin
>
>    Last name: Skywalker
>
>    Short name: A. Skyw

Hint: Use methods of the String class.
What will happen if the last name consists of less than four letters?

14. [Random Number](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/TelephoneNumber.java)

Write a program TelephoneNumber.java, generating and printing a random telephone number of the form 0XXX-ZYYYYY. The area code consists of a zero followed by three digits (X). The local number can not start with a zero (Z), all other digits (Y) are random.

Hint: Use the class java.util.Random.

15. [Square Root](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Distance.java)

Write a program Distance.java which reads two coordinates in the form (x,y) and then computes the distance between the points, using the formula

> distance = Sqrt( (x1-x2)^2 + (y1-y2)^2 )

Sqrt() means "the square root of" and ^ means "raised to". The answer should be presented with three decimal digits.

Hint: Use the class java.lang.Math for the computations.

*If Time Permits*

*Exercise 16 is marked as VG task ==> only mandatory for those of you that aspire for a higher mark (A or B).*

16. [Wind Chill (VG-task)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/WindChill.java)

Write a program WindChill.java that asks the user for a temperature (°C) and the wind speed (measured in m/s) and then computes the so-called wind chill temperature using [Siple's formula](http://www.lenntech.com/calculators/wind/wind-chill.htm). For example:

>    Temperature:  -7.8
>
>    Wind speed:  8.4
> <br>
> <br>    
>    Wind Chill Temperature: -24.5
	      
	      
### Submission
*Only exercises 5-16 should be handed in. (Notice that the VG exercises 11 and 16 are not mandatory.) We are only interested in your .java files. Hence, zip the directory named YourLnuUserName_assign1 (inside directory named src) and submit it using the Moodle submission system.*

*** 

## [Assignment 2](http://homepage.lnu.se/staff/jlnmsi/java1/lab2eng.html)
#### Problems?

Do not hesitate to ask your teaching assistant at the practical meetings (or Jonas at the lectures) if you have any problems. You can also post a question in the assignment forum in Moodle.
#### Prepare Eclipse for Assignment 2

Create a new package with the name YourLnuUserName_assign2 inside the Java project 1DV506 and save all program files for this assignment inside that package.
#### VG Exercises

Exercises 7-9 and 13 are VG tasks that is only needed to do if you aspire for a higher grade (A or B).
### Lecture 4 - Control Statements
The ability to combine different control statements to solve a problem is very important. Therefore, there is quite a large number of (short) tasks on this topic.
1. [Exercise 1](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/CountA.java)

Write a program CountA.java that reads a string from the keyboard and then prints how many 'a' and 'A' the string contains. An example of what an execution might look like:
>Provide a line of text: All cars got the highest safty grading A.
>
>Number of 'a': 3
>
>Number of 'A': 2

2. [Exercise 2](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Backwards.java) 

Write a program Backwards.java that reads an arbitrary string from the keyboard and then prints it backwards. An example of an execution:

>Provide a line of text: Anakin Skywalker
>
>Backwards: reklawykS nikanA

Notice: You are supposed to use control statements to iterate over the input text backwards.

3. [Exercise 3](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/LargestK.java) 

Write a program LargestK.java, which for any given positive integer N (read from the keyboard) computes the largest integer K such that 0+2+4+6+8+...+K < N. An example of an execution:

> Give a positive integer: 25
> 
> The largest K such that 0+2+4+6+...+K < 25 => K=8

4. [Exercise 4](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/HighLow.java)

Write a program HighLow.java, implementing the game High and Low. The computer chooses a random integer between 1 and 100 and lets the user guess the value. After each guess, the user is given a clue of the type “higher” or “lower”. An example of an execution:

> Guess 1: 67
> 
>   Clue: higher
> 
> Guess 2: 82
> 
>   Clue: lower
> 
> Guess 3: 77
> 
>    Correct answer after only 3 guesses – Excellent!
> 

After 10 guesses, the program ends with a proper comment.

5. [Exercise 5](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Triangle.java)

Write a program Triangle.java reading a positive odd integer N from the keyboard, and then prints two triangles. First a right-angled triangle, then an isosceles triangle. An example of an execution:

> Provide an odd positive integer: 7  
> 
> Right-Angled Triangle:   
       *  
      **  
     ***  
    ****  
   *****  
  ******  
 *******  
 
> Isosceles Triangle:   
    *   
   ***   
  *****   
 *******   

The program should end with an error message if the input N is not an odd postive integer.

6. [Exercise 6](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/SecondLargest.java)

Write a program SecondLargest that reads 10 integers from the keyboard and then prints the second largest one. An example of an execution:

>Provide 10 integers: 67 -468 36 1345 -7778 0 34 7654 45 -666 
> 
>The second largest is: 1345

Try to design the program such that changing the number of integers to be read (10) is easy.

**Recommendation:** Use a smaller value than 10 while developing the program.

**Notice:** You are not allowed to use arrays or any other data structure for storing all the integers.

7. [Exercise 7 (VG-exercise)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/CountDigits.java)

Write a program CountDigits.java that for an arbitrary positive integer N (read from the keyboard) prints the number of zeros, odd digits, and even digits. An example of an execution:

> Provide a positive integer: 6789500
> 
> Zeros: 2
> 
> Odd: 3
> 
> Even: 2

Notice: We consider 0 to be neither odd nor even.

8. [Exercise 8 (VG-exercise)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/BirthdayCandles.java)

Write a program BirthdayCandles that computes how many boxes of candles a person needs to buy each year for his birthday cake. You can assume that the person reaches an age of 100, the number of candles used each year is the same as the age, that you save non-used candles from one year to another, and that each each box contains 24 candles. Also, at the end, we want you to print the total number of boxes one has to buy, and how many candles that are available after having celebrated the 100th birtday. An example of an execution:

> Before birthday 1, buy 1 box(es)
> 
> Before birthday 7, buy 1 box(es)
> 
> Before birthday 10, buy 1 box(es)
> 
> Before birthday 12, buy 1 box(es)
> 
> Before birthday 14, buy 1 box(es)
>    
> ...
>   
> Before birthday 95, buy 3 box(es)
> 
> Before birthday 96, buy 4 box(es)
> 
> Before birthday 97, buy 5 box(es)
> 
> Before birthday 98, buy 4 box(es)
> 
> Before birthday 99, buy 4 box(es)
> 
> Before birthday 100, buy 4 box(es)
> <br>
> 
> Total number of boxes: 211, Remaining candles: 14

Notice: In our example we only have a print-out of those birthdays where you must buy boxes. In the non-printed years (e.g. 2-6 and 8-9) you can handle the birthdays without having to buy any more candles.

9. [Exercise 9 (VG-exercise)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Palindrome.java)

Write a program Palindrome.java, testing if a line of text (read from the keyboard) is a palindrome. A palindrome is a text consisting of the same sequence of characters read backwards, as if read from the front. Ignore all characters that are not letters, and consider an upper case letter to be equal to the corresponding lower case letter. Examples of palindromes:

> "Anna"  "x"  "Ff"   "A1 n2%}=3N{[a]"  "Was it a rat I saw?”

Hint: The two static methods Character.isLetter(char c) and Character.toLowerCase(char c) might be useful!

### Lecture 5 - Arrays and ArrayList

10. [Exercise 10](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/Reverse.java)

Complete the program Reverse.java below such that:
It first prints the content of the array text.
Reorder the array elements backwards (in opposite order) by shifting place of first and last character, second and second to last character, etc.
Then print the array content one more time.
> 
> public class Reverse {
> 
>    public static void main(String[] args) {
> 
>       char[] text = { '!', 'y', 's', 'a', ' E', ' ', 's', 'a', 'w', ' ', 
> 
>          			's', 'i', 'h', 'T' };
> 
>          		
> 
>       // Continue here ...
> 
>    }
> 
> }

Notice: You should not only print them backwards. You should also swap places of the elements in the array.

11. [Exercise 11](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/ReverseOrder.java)

Create a program ReverseOrder.java that reads an arbitrary number of positive integers from the keyboard and then prints them in reverse order. The reading stops when the user inputs a negative number. An example of an execution:
Enter positive integers. End by giving a negative integer.

> Integer 1: 5
> 
> Integer 2: 10
> 
> Integer 3: 15
> 
> Integer 4: 20
> 
> Integer 5: -7
>    
>    
> Number of positive integers: 4
> 
> In reverse order: 20, 15, 10, 5

Note: The user is not supposed to give the number of integers to enter.

12. [Exercise 12](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/FrequencyTable.java)

Write a program FrequencyTable.java that simulates that you are rolling a dice 6000 times. At the same time, keep track of the number of times you get the result 1, 2, .... (Use an array to save the numbers.) After the simulation, present the frequencies for the different numbers. An example of an execution:

> Frequencies when rolling a dice 6000 times. 
> 
> 1: 1025
> 
> 2: 996
> 
> 3: 980
> 
> 4: 1006
> 
> 5: 1035
> 
> 6: 958
> 

13. [Exercise 13 (VG-exercise)](https://github.com/jl223vy/1DV506--Problem-Solving-and-Programming--Autumn-2016/blob/master/SalaryRevision.java)

When the union is reporting about the latest salary negotiations they are presenting the average salary, the median salary, and the salary gap for the workers that they represent. Write a program SalaryRevision.java that reads an arbitrary number of salaries (integers) and then reports the median and average salaries, and the salary gap. All of them should be integers (correctly rounded off).
By salary gap we mean the difference between the highest and lowest saleries. The median salary is the middle salary (or average of the two middle salaries) when all saleries have been sorted. The easiest way to sort an ArrayList is to use the static sort method in class java.util.Collections.

Two different executions might look like this:

> Provide salaries (and terminate input with 'X'): 21700 28200 26300 25100 22600 22800 19900 X
> 
> Median: 22800
> 
> Average: 23800
> 
> Gap: 8300


> Provide salaries (and terminate input with 'X'): 22100 29800 27300 25400 23100 22300 X
> 
> Median: 24250
> 
> Average: 25000
> 
> Gap: 7700


### Submission

*All exercises should be handed in and we are only interested in your .java files. (Notice that the VG exercises 7, 8, 9, and 13 are not mandatory.) Hence, zip the directory named YourLnuUserName_assign2 (inside directory named src) and submit it using the Moodle submission system.*

*** 

## Assignment 3: Methods and Classes
####Problems?
Do not hesitate to ask your teaching assistants at the practical meetings (or Jonas at the lectures) if you have any problems. You can also post a question in the assignment forum in Moodle.
####Prepare Eclipse for Assignment 3

Create a new *package* with the name YourLnuUserName_assign3 inside the Java project 1DV506 and save all program files for this assignment inside that package.
###Lecture 6 - Methods

In exercises 1 and 2 below you are supposed to create a number of static methods. They should all be created inside the same class that contains the main method. The main method should work as test program that demonstrates how the different methods in your class can be used.

1. [Exercise 1]()

Create a class Arrays.java that apart from the main method also contains the following static methods:

- Method int sum(int[] arr), adding all elements of the array arr and returning the sum.
- Method String toString(int[] arr), creating a string containing a nice-looking print out of the content of the array. It should be possible to use it in the following way.
>      int[] n = {3,4,5,6,7};
>      String str = Arrays.toString(n);
>      System.out.println("n = " + str);
     
- Method int[] addN(int[] arr, int n), creating and returning a new array, where n have been added to all elements in arr. Array arr should be left unchanged.
- Method int[] reverse(int[] arr), creating and returning a new array, consisting of all elements in arr in reverse order. Array arr should be left unchanged.
- Method boolean hasN(int[] arr, int n), returning true if n is contained in the array arr, false otherwise.
- Method void replaceAll(int[] arr, int old, int nw), replacing all occurrences of old with nw in arr.
- Method int[] sort(int[] arr), returning a new sorted array (increasing order), containing the same set of integers as arr. Array arr should be left unchanged.
- Method boolean hasSubsequence(int[] arr, int[] sub), returning true if the sequence sub is a subsequence of array arr, false otherwise. The case hasSubsequence({1,2,3,4,5}, {3,4,5}) should return true since {3,4,5} is a part of {1,2,3,4,5}. The case hasSubsequence({1,2,3,4,5}, {1,3,5}) should return false since the exact sequence of elements {1,3,5} cannot be found in {1,2,3,4,5}.

**Notice:** You are supposed to implement all these methods from scratch without any use of the array related methods in the Java library.

2. [Exercise 2]()

Create a class SweID.java that apart from the main method also contains a number of static methods related to the Swedish identity number in the form YYMMDD-NNNN. Information about the structure of Swedish identity numbers can be found at Wikipedia ([Wikipedia: Personal identity number (Sweden)](https://en.wikipedia.org/wiki/Personal_identity_number_(Sweden))).  
We expect you to consider each ID number as a single string of type "YYMMDD-NNNN". The class should contain the following static methods:

1. Methods getFirstPart and getSecondPart, returning the first part (YYMMDD) and second part (NNNN) of the identity number, respectively.
2. isFemaleNumber, isMaleNumber, returning true if the personal identity number belongs to a woman or a man, respectively.
3. areEqual, comparing two ID numbers checking if they correspond to the same identity number.
4. **(VG-exercise)** isCorrect, returning true if the number is a correct identity number. To get a passed result you have to check that the date is correct (i.e. the year, month and day should be correct). You must also check that the last digit of the number is correct according to the rules given in the link above.

Feel free to add more methods, if you think anything is missing. Suitable types for arguments and return values are up to you to decide.

Examples:
- 640123-8826 is a correct female number
- 550414-0913 is a correct male number
- 551314-0913 is not correct number (unvalid month)
- 550414-0912 is not correct number (unvalid last digit)

*Clarification: all students are supposed to do subtasks 1, 2, and 3. To get the highest grades you must also do subtask 4.*

### Lecture 7 - Create Your Own Classes

In the exercises below you are supposed to create your own classes. We also want that you, for each class (e.g. MultiDisplay), to create a test program (e.g. MultiDisplayMain) containing a main method that demonstrates how the different methods in your class can be used.

3. [Exercise 3]()

Create a class MultiDisplay that when executed using this code:

    MultiDisplay md = new MultiDisplay(); 	
    
    md.setDisplayMessage("Hello World!"); 
    md.setDisplayCount(3); 
    md.display();                         // ==> print-out 	
    md.display("Goodbye cruel world!", 2);  // ==> print-out 
    System.out.println("Current Message: "+ md.getDisplayMessage());

results in the following console print-out:

    Hello World!
    Hello World!
    Hello World!
    Goodbye cruel world!
    Goodbye cruel world!
    Current Message: Goodbye cruel world!

The class MultiDisplay should of course be able to handle other messages and other numbers of display counts.

4. [Exercise 4]()

Download and install the class [AlarmClock](http://homepage.lnu.se/staff/jlnmsi/java1/AlarmClock.zip). Then write a program AlarmMain that uses AlarmClock to:
1. Set clock time to 23:48
2. Display time
3. Set alarm to wake up at 6:15
4. Let the clock "tick" for 500 minutes
5. Display time again

**Notice:** You are not allowed to make any changes in the AlarmClock class except maybe to change the package name.

5. [Exercise 5]()

Create a class TextAnalyzer that when executed using this code:

   

 String text = "My name is Anakin Skywalker. My age is 42.";
    TextAnalyzer ta = new TextAnalyzer(text);
    		
    System.out.println("Char Count: "+ ta.charCount());
    System.out.println("Upper Case Count: "+ ta.upperCaseCount());
    System.out.println("Whitespace Count: "+ ta.whitespaceCount());
    System.out.println("Digit Count "+ ta.digitCount());
    		
    if (ta.containsChar('x'))
    	System.out.println("The text contains char \'x\'");
    		
    if (ta.containsString("nakin"))
    	System.out.println("The text contains substring \"nakin\"");
   
results in the following console print-out:
   

    Char Count: 42
    Upper Case Count: 4
    Whitespace Count: 8
    Digit Count 2
    The text contains substring "nakin"

The class TextAnalyzer should of course be able to handle other texts in a correct way. The methods containsChar and containsString should of course also give a correct result (true/false) for other characters and strings.

6. [Exercise 6]()

Create a class Point that when executed using this code:

    Point p1 = new Point();
    Point p2 = new Point(3,4);
    		
    System.out.println(p1.toString());   // ==> (0,0)
    System.out.println(p2.toString());   // ==> (3,4)
    		
    if (p1.isEqualTo(p2))              // False!
    	System.out.println("The two points are equal");
    		
    double dist = p1.distanceTo(p2);
    System.out.println("Point Distance: "+dist);
    		
    p2.move(5,-2);         // ==> (8,2)
    p1.moveToXY(8,2);      // ==> (8,2)
    		
    if (p1.isEqualTo(p2))              // True!
    	System.out.println("The two points are equal");

results in the following console print-out:

    (0,0)
    (3,4)
    Point Distance: 5.0
    The two points are equal

The class Point should of course be able to handle other points with different (x,y) values. **Notice:**
- The coordinates (x,y) are always integers.
- The method toString returns a string with coordinates suitable for print-outs.
- Distance between two points is computed in the same way as in Exercise 15, Assignment 1.
- Two points are equal if they have the same coordinates.
- Method move moves the point certain steps in x- and y-direction.
- Method moveToXY provide a new set of coordinates.

###Lecture 8 - More Classes

This section contains a number of exercises where you are supposed to create you own classes. For each task, we expect a Main class, showing how all methods in the class or classes work. For example, for the class Fraction.java there should be a class FractionMain.java showing how all methods of Fraction.java can be used.
All classes are supposed to be commented and follow principles such as encapsulation.

7. [Exercise 7]()

Create a class Fraction.java, representing a fractional number of the form N/D, where N (the numerator) and D (the denominator) both are integers. If the denominator is equal to zero, an error message should be printed. The class should include the following members:
1. A constructor, creating and initializing a new fractional number.
2. Methods getNumerator and getDenominator, returning the numerator or denominator, respectively.
3. Method isNegative, returning true if the fractional number is negative.
4. Methods add, subtract, multiply, divide, performing the corresponding operations on two fractional numbers and returning a new fractional number. It is up to you to decide a proper way of handling the case when one of the fractional numbers have a zero denominator.
5. isEqualTo, comparing two Fraction-instances, checking if they correspond to the same fractional number.
6. toString, returning a string representation of the fractional number on the form N/D.

Feel free to add more methods, if you think anything is missing. Suitable argument and return types are up to you to decide.

**Extra, voluntary work if you are interested in mathematics:** Make sure that the fractional number is in the most simplified form possible. For example, the fractional numbers 2/4 and 35/50 should internally be represented as 1/2 and 7/10. This means that the internal representation always should be the two smallest integers N and D corresponding to the given fractional number. Useful information can be found at Wikipedia: [Euclidean algorithm](http://en.wikipedia.org/wiki/Euclidean_algorithm).

8. [Exercise 8]()

Create a class Card, representing a playing card in an ordinary card deck with 52 cards. A card has a suite (4 different) and a rank (13 different). Write a class Deck initially containing 52 different objects of the class Card. The class Deck should contain methods for shuffling the deck, deal a card and telling how many cards are still in the deck. Note that it should only be possible to shuffle a deck if it contains 52 cards. (Information at Wikipedia about [card decks](http://en.wikipedia.org/wiki/Card_deck) and [card games](http://en.wikipedia.org/wiki/Card_game).)  

Also write a program PlayCardsMain, creating a card deck and dealing some cards, telling the number of remaining cards and which cards that have been dealt.

**Hint:** Use enumeration types.

9. [Exercise 9 (VG-exercise)]()

In this exercise you should use the Deck class from the previous exercise. In the patience (single player card game) 1-2-3 you take one card at a time from the deck at the same time as you are counting 1,2,3,1,2,3,1,2,3 etc. You lose the game as soon as you get an Ace when counting "one", a 2 card when counting "two", or a 3 card when counting "three". The chances to win, to make it through the whole deck without losing, are quite small. But how small?

Write a program Play123Main that plays the 1-2-3 game 10000 times and then computes the probability (%) that you win the game. The program should use a method play123 that plays the game once and reports true if you win (or false if you lose) that particular game.



###Submission  

*All exercises should be handed in and we are only interested in your .java files. (Notice that the VG exercises 2.4, and 9 are not mandatory.) Hence, zip the directory named YourLnuUserName_assign3 (inside directory named src) and submit it using the Moodle submission system.*
## Assignment 4: Exceptions, IO, and Interfaces
