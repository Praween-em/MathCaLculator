# MathCaLculator

The "Mathematical Calculator" project is a Java application that provides a user-friendly graphical interface for performing several mathematical calculations. 
The application allows users to input different numerical values and receive calculated results in real-time. 
It encompasses various mathematical concepts, including Fibonacci numbers, factorials, approximations for pi, prime numbers, 
and the Collatz conjecture.

Key Features:

Fibonacci Calculator: This section enables users to input a positive integer and calculates the corresponding Fibonacci number. 
The application utilizes a custom Fibonacci class to compute the Fibonacci value efficiently.

Factorial Approximation: Users can enter a positive integer for which the application approximates the factorial using the Stirling approximation.
The StirlingApproximation class is used to perform this calculation.

Pi Approximation: This feature allows users to input the number of terms and calculates an approximation for pi using Maadhava's formula.
The PiApproximation class performs the pi approximation calculation.

Prime Numbers Generator: Users can input a positive integer, and the application generates a list of prime numbers up to that limit. 
The PrimesNumbers class is utilized to compute prime numbers efficiently.

Collatz Conjecture Verification: Users can provide a positive integer, 
and the application demonstrates the iterative Collatz conjecture sequence for that input value.
The thtreexplusone class is responsible for computing the Collatz sequence.

Graphical User Interface (GUI):
The application's GUI is constructed using Java Swing components. 
The main window of the application features separate sections for each calculation, organized with labels, text fields for input,
buttons to trigger calculations, text areas to display results, and labels to provide additional information.
The GUI design follows a consistent structure, including input fields, calculation buttons, and result displays for each mathematical operation.

Usage:

Input values in the designated text fields.
Click the respective calculation buttons to trigger the desired computation.
View the calculated results in the associated text areas.
The application provides additional information, such as the number of digits in the result or the execution time for each calculation.
Future Enhancements:
The project could be expanded by incorporating additional mathematical algorithms, improving GUI aesthetics,
implementing error handling for invalid inputs, and optimizing the calculations for larger numbers. 
Furthermore, advanced features like graphing results or offering additional mathematical functions could enhance the application's utility.
