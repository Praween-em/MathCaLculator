import javax.swing.*;

public class Main{
        public static void main(String[] args){
                SwingUtilities.invokeLater(() -> {
                frameclass fc = new frameclass();
                fc.framecal();
        });

        }
        }

/*Here the frame calls must be called using a lambda function using the Inbuilt Method SwingUtilities.invokeLater(); method
because the frame class must be run on EDT (Event Dispatch Thread) so there won't be any problems while creating the UI

CLASSES:
 This project consists of
1.Fibonacci class
2.Factorial approximation Class
3.Maadhava's pi approximation class
4.Class that generates prime numbers upto a given value and
5.Class that verifies collatz conjecture for any given input
6. The Frame class [the class that contain all the classes]

BIGINTEGER :

BIginteger is a class from the java.math package that represents an arbitrary-precision integer.
Every class in the project operate using BIgintegers which are pratically unlimited numbers and
the range of these numbers depend on the memory capacity of the device.
RUNNING TIME:
Each class defies its runtime in their respective time labels defined in the Frame class.

frameclass class:

framecal() method:
This method initializes and sets up the GUI components for the RAMCal application.
It creates a JFrame named "RAMCal" and sets its size to 1000x1000 pixels.
It then creates multiple panels for various calculations,
such as Fibonacci, Factorial, Pi Approximation, Prime Numbers, and the 3X+1 function.
Each panel contains the necessary buttons, text fields, labels, and text areas for input, output, and displaying results.
The panels are added to the main panel, which is then added to a scrollable pane to ensure proper visibility and navigation of all components.

initUI() method:
This method initializes the user interface (UI) components and layouts for the RAMCal application.
It creates and configures various GUI elements, such as buttons, text fields, labels, and text areas,
and adds them to their respective panels.
The panels are then added to the main panel, which is added to a scrollable pane to ensure proper visibility
and navigation of all components.

Listeners:

FibBtnListener class: T

his class implements the ActionListener interface and handles the "Calculate" button click for the Fibonacci calculator.
When the button is clicked,
it retrieves the user input from the text field, converts it to a BigInteger, and calculates the Fibonacci number using the Fibonacci class.
The result is displayed in the text area along with the number of digits in the Fibonacci number and the running time of the calculation.

FactBtnListener class:

This class implements the ActionListener interface and handles the "Calculate" button click for the Factorial approximation.
When the button is clicked, it retrieves the user input from the text field, converts it to a BigInteger,
and calculates the factorial using the StirlingApproximation class.
The result is displayed in the text area along with the running time of the calculation.

PiBtnListener class:

This class implements the ActionListener interface and handles the "Calculate"
button click for the Pi approximation using the Maadhava's method. When the button is clicked,
it retrieves the user input from the text field, converts it to a BigInteger,
and calculates the Pi approximation using the PiApproximation class.
The result is displayed in the text area along with the running time of the calculation.

PrimeBtnListener class:

This class implements the ActionListener interface and handles the "Generate" button click for generating prime numbers.
When the button is clicked, it retrieves the user input from the text field,
converts it to a BigInteger, and calculates the prime numbers using the PrimesNumbers class.
The results are displayed in the text area along with the number of prime numbers generated and
the running time of the calculation.

threeBtnListener class:

This class implements the ActionListener interface and handles the "Verify" button click for the Collatz Conjecture.
When the button is clicked, it retrieves the user input from the text field, converts it to an integer,
and verifies the Collatz Conjecture using the thtreexplusone class.
 The sequence of values is displayed in the text area along with the number of iterations required to reach the value 1 and
  the running time of the calculation.

*/

//      THIS AND PROJECT AND THE CODE IT CONTAINS IS OPENSOURCE ANY ONE CAN USE THIS CALCULATOR APPLICATION TO VERIFY
//      THE GITHUB LINK TO THIS PROJECT IS PROVIDED BELOW ANYONE CAN CONTRIBUTE TO THIS PROJECT IN GITHUB
//      THEIR RESULTS AND USE THIS CODE AS THEIR PROJECT
//
//             { CREDIT ********* A.PRAVEEN KUMAR *********
//                      DEVELOPED AT: ++++++++++ JNTU ANANTAPUR +++++++++
//                              GUIDED BY: """""""" PROF. CHENNA REDDY """"""""
//                              DURING :7/07/23 TO 7/08/23 }
//