# MathCaLculator

The "Mathematical Calculator" project is a Java application that provides a user-friendly graphical interface for performing several mathematical calculations. 
The application allows users to input different numerical values and receive calculated results in real-time. 
It encompasses various mathematical concepts, including Fibonacci numbers, factorials, approximations for pi, prime numbers, 
and the Collatz conjecture.

Key Features:


Fibonacci Calculator: This specialized module enables users to input a positive integer and instantly acquire the corresponding Fibonacci number. Here, the application is bolstered by a dedicated Fibonacci class, adept at swiftly and efficiently computing these numbers. Crucially, this class operates on the robust BigInteger data type, ensuring precision and accommodating practically infinite input and output. The capacity for extensive calculations finds paramount importance in scientific and mathematical applications.

Factorial Approximation: Catering to users entering positive integers, this module employs the Stirling approximation for factorial calculations. The StirlingApproximation class, functioning with the stalwart BigInteger data type, manages the intricate computations with finesse. It's vital to note that the utilization of BigInteger ensures the program can handle calculations of immense magnitude, contributing to the program's value in diverse scientific and mathematical contexts.

Pi Approximation: In this facet, users dictate the number of terms they desire, leading the application to elegantly approximate pi through Maadhava's formula. Orchestrating this precision calculation is the PiApproximation class, which thrives on the capabilities of BigInteger data type. This choice amplifies the program's significance in scientific and mathematical realms, as it accommodates vast calculations that conventional data types would falter in managing.

Prime Numbers Generator: Empowering users to input a positive integer, this feature triggers the application to generate a comprehensive list of prime numbers up to the indicated limit. The execution of this calculation is championed by the PrimesNumbers class, which deftly navigates the intricate landscape of prime number computation using the BigInteger data type. The infusion of this data type reinforces the program's applicability in scenarios demanding extensive mathematical manipulations.

Collatz Conjecture Verification: This module meticulously elucidates the iterative journey of the Collatz conjecture sequence for a given positive integer input. Executing these intricate calculations lies in the hands of the thtreexplusone class, which leverages the capabilities of the BigInteger data type. The decision to employ this data type underscores the program's resonance in both scientific and mathematical arenas, where limitless calculations are pivotal.

In summation, each class within this program harnesses the BigInteger data type to execute calculations of substantial magnitude. The input and output capacity of these classes is practically infinite, a quality indispensable in the realm of science and mathematics. The utilization of the BigInteger data type underscores the program's pertinence in scenarios requiring immense precision and extensive mathematical exploration, solidifying its significance as a tool for scholarly pursuits and practical applications.
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
