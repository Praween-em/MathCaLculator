import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

class frameclass extends JFrame {
    //Fibonacci Buttons Labels //
    private JButton FibBtn;
    private JTextField fibtxt;
    private JTextArea Fibval;
    private JScrollPane pane1;
    private JLabel fiblabel;
    private JLabel FibAnslbl;
    private JLabel Fiblen;
    private JLabel FibTimeLabel;
    //Factorial Buttons Labels//
    private JButton FactBtn;
    private JTextField facttxt;
    private JTextArea Factval;
    private JLabel factlabel;
    private JLabel FactAnslbl;
    private JLabel Factlen;
    private JLabel FactTimeLabel;
    //PiApproximation Buttons Labels //
    private JButton PiBtn;
    private JTextField Pitxt;
    private JTextArea Pival;
    private JLabel Pilabel;
    private JLabel PiAnslbl;
    private JLabel Pilen;
    private JLabel PiTimeLabel;


    private JButton PrimeBtn;
    private JTextField Primetxt;
    private JTextArea Primeval;
    private JLabel Primelabel;
    private JLabel PrimeAnslbl;
    private JLabel Primelen;
    private JLabel PrimeTimeLabel;

    private JScrollPane Pane2;

    private JButton threeBtn;
    private JTextField threetxt;
    private JTextArea threeval;
    private JLabel threelabel;
    private JLabel threeAnslbl;
    private JLabel threelen;
    private JLabel threeTimeLabel;

    private JScrollPane pane3;

    public void framecal() {
        initUI();

    }

    private void initUI() {
        try {


            JPanel MainPanel = new JPanel();
            MainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
            MainPanel.setPreferredSize(new Dimension(900,900));
            JScrollPane pane = new JScrollPane(MainPanel);

            JFrame frame = new JFrame(" BI CAL ");
            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Fibonacci Button and label creation//
            fiblabel = new JLabel("Fibonacci calculator");
            fibtxt = new JTextField(10);
            FibBtn = new JButton("Calculate");
            Fibval = new JTextArea(3, 20);
            Fibval.setLineWrap(true);
            Fibval.setWrapStyleWord(true);
            FibAnslbl = new JLabel("Fibonacci number");
            FibTimeLabel = new JLabel();
            Fiblen = new JLabel();
            //Factorial Button and Label Creation//
            Factlen = new JLabel();
            factlabel = new JLabel("Factorial appx");
            facttxt = new JTextField(10);
            FactBtn = new JButton("Calculate");
            Factval = new JTextArea(3, 20);
            Factval.setLineWrap(true);
            Factval.setWrapStyleWord(true);
            FactAnslbl = new JLabel("Factorial value ");
            FactTimeLabel = new JLabel();
            // Pi Button and label creation
            Pilen = new JLabel();
            Pilabel = new JLabel("Pi value Appx");
            Pitxt = new JTextField(10);
            PiBtn = new JButton("Calculate");
            Pival = new JTextArea(3, 20);
            Pival.setLineWrap(true);
            Pival.setWrapStyleWord(true);
            PiAnslbl = new JLabel("Maadhava's Pi appx ");
            PiTimeLabel = new JLabel();
            //Prime button and label creation//
            Primelabel =new JLabel("Prime numbers generator");
            Primetxt = new JTextField(10);
            PrimeBtn = new JButton("Generate");
            PrimeAnslbl = new JLabel("prime numbers are");
            Primeval = new JTextArea(3,20);
            Primeval.setLineWrap(true);
            Primeval.setWrapStyleWord(true);
            PrimeTimeLabel = new JLabel();
            Primelen = new JLabel();

            // 3X+1 functioon declaration//

            threelabel = new JLabel(" Collatz Conjectre ");
            threetxt = new JTextField(10);
            threeBtn = new JButton(" verify ");
            threeAnslbl = new JLabel("the values are ");
            threeval = new JTextArea(3,20);
            threeval.setLineWrap(true);
            threeval.setWrapStyleWord(true);
            threeTimeLabel = new JLabel();
            threelen = new JLabel();

            ////////////////////////////////////////
            pane1 = new JScrollPane(Fibval);
            Pane2 = new JScrollPane(Primeval);
            pane3 = new JScrollPane(threeval);
            //  Main panel //

            //Fibonacci Panel//
            JPanel panel1 = new JPanel();
            panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
            panel1.setBackground(Color.GRAY);
            panel1.setPreferredSize(new Dimension(900, 200));
            panel1.add(fiblabel);
            panel1.add(fibtxt);
            panel1.add(FibBtn);
            panel1.add(FibAnslbl);
            panel1.add(pane1);
            panel1.add(Fiblen);
            panel1.add(FibTimeLabel);
            panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //Factorial panel//
            JPanel panel2 = new JPanel();
            panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
            panel2.setBackground(Color.GRAY);
            panel2.setPreferredSize(new Dimension(900, 200));
            panel2.add(factlabel);
            panel2.add(facttxt);
            panel2.add(FactBtn);
            panel2.add(FactAnslbl);
            panel2.add(Factval);
            panel2.add(FactTimeLabel);
            panel2.add(Factlen);
            panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //Pi panel//

            JPanel panel3 = new JPanel();
            panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
            panel3.setBackground(Color.GRAY);
            panel3.setPreferredSize(new Dimension(900, 200));
            panel3.add(Pilabel);
            panel3.add(Pitxt);
            panel3.add(PiBtn);
            panel3.add(PiAnslbl);
            panel3.add(Pival);
            panel3.add(Pilen);
            panel3.add(PiTimeLabel);

            panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //Prime label and button declaration//

            JPanel panel4 = new JPanel();
            panel4.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
            panel4.setBackground(Color.GRAY);
            panel4.setPreferredSize(new Dimension(900, 200));
            panel4.add(Primelabel);
            panel4.add(Primetxt);
            panel4.add(PrimeBtn);
            panel4.add(PrimeAnslbl);
            panel4.add(Pane2);
            panel4.add(Primelen);
            panel4.add(PrimeTimeLabel);
            panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            ///3X+1 function Panel///

            JPanel panel5 = new JPanel();
            panel5.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
            panel5.setBackground(Color.GRAY);
            panel5.setPreferredSize(new Dimension(900,200));
            panel5.add(threelabel);
            panel5.add(threetxt);
            panel5.add(threeBtn);
            panel5.add(threeAnslbl);
            panel5.add(pane3);
            panel5.add(threelen);
            panel5.add(threeTimeLabel);
            panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            //Main panel Declaration//
            MainPanel.add(panel1);
            MainPanel.add(panel2);
            MainPanel.add(panel3);
            MainPanel.add(panel4);
            MainPanel.add(panel5);

            FibBtn.addActionListener(new FibBtnListener());
            FactBtn.addActionListener(new FactBtnListener());
            PiBtn.addActionListener(new PiBtnListener());
            PrimeBtn.addActionListener(new PrimeBtnListener());
            threeBtn.addActionListener(new threeBtnListener());
            frame.add(pane, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


        } catch (Exception e) {
            System.out.println("x");
            System.out.println(e.getMessage());
        }
    }
    //Fibbonacci Listener//
    private class FibBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long startTime = System.currentTimeMillis();
                String fibinput = fibtxt.getText();
                //Fibonacci class constructor//
                BigInteger bigInteger = new BigInteger(fibinput);
                var fb = new Fibonacci();
                BigInteger[] bigInteger1 = fb.FibonacciCAl(bigInteger);
                fibinput = bigInteger1[0].toString();
                String len = bigInteger1[1].toString();
                Fibval.setText(fibinput);
                Fiblen.setText("No of Digits in the value are " + len);
                //End time calculator//
                long endTime = System.currentTimeMillis();
                long runningTime = endTime - startTime;
                double ts = (double) (runningTime) / 1000;
                String str = Double.toString(ts);
                FibTimeLabel.setText("the Running time is " + str +"seconds");

            } catch (NumberFormatException ex) {
                Fibval.setText("Invalid input");
            }
        }
    }
    //Factorial Listener//
    private class FactBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long startTime = System.currentTimeMillis();
                String factinput = facttxt.getText();
                BigInteger bigInteger = new BigInteger(factinput);
                //StirlingApproximation class constructor //
                var sa = new StirlingApproximation();
                BigDecimal bigDecimal;
                bigDecimal = sa.stirlingapp(bigInteger);
                String str1 = bigDecimal.toString();
                Factval.setText(str1);
                //end time //
                long endTime = System.currentTimeMillis();
                long runningTime = endTime - startTime;
                double ts = (double) (runningTime) / 1000;
                String str = Double.toString(ts);
                FactTimeLabel.setText("the Running time is " + str+" seconds");
            } catch (NumberFormatException ex) {
                Factval.setText("Invalid Input");
            }
        }
    }

    //PI btn Listener//
    private class PiBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long startTime = System.currentTimeMillis();
                String Piinput = Pitxt.getText();
                BigInteger bigInteger = new BigInteger(Piinput);
                var pis = new PiApproximation();
                BigDecimal bigDecimal = pis.PiApproxiCal(bigInteger);
                String str1 = bigDecimal.toString();
                Pival.setText(str1);
                Pilen.setText("is the value of Maadhava's Approximation for Pi upto " +Piinput +" terms");
                long endTime = System.currentTimeMillis();
                long runningTime = endTime - startTime;
                double ts = (double) (runningTime) / 1000;
                PiTimeLabel.setText("the Running time is " +ts +"Seconds");

            } catch (NumberFormatException ex) {
                Pival.setText("Invalid input");
            }

        }
    }
    private class PrimeBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long startTime = System.currentTimeMillis();
                String PrimeInput = Primetxt.getText();
                BigInteger bigInteger = new BigInteger(PrimeInput);
                PrimesNumbers primeNumbers = new PrimesNumbers();
                ArrayList<BigInteger> array = new ArrayList<>(primeNumbers.primecalcu(bigInteger));
                primeNumbers.primecalcu(bigInteger);
                StringBuilder sb = new StringBuilder();
                for (BigInteger num : array) {
                    sb.append(num).append(",");
                }
                Primeval.setText(sb.toString());
                int k = array.size();
                Primelen.setText("the number of primes before " + bigInteger + " are " + k);
                long endTime = System.currentTimeMillis();
                long runningTime = endTime - startTime;
                double ts = (double) (runningTime) / 1000;
                PrimeTimeLabel.setText("the Running time is " +ts +"Seconds");

            } catch (NumberFormatException ex) {
                Primeval.setText(" Invalid input ");
            }
        }
    }
    private class threeBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long startTime = System.currentTimeMillis();
                String threeInput = threetxt.getText();
                BigInteger biginteger = new BigInteger(threeInput);
                thtreexplusone trp1 = new thtreexplusone();
                ArrayList<BigInteger> array = trp1.threeplusone(biginteger);
                StringBuilder sb = new StringBuilder();
                for (BigInteger nums : array) {
                    sb.append(nums).append(",");
                }
                threeval.setText(sb.toString());
                int k = array.size();
                threelen.setText(biginteger.toString() + " converges to 4,2,1 after " + k + " Iterations");
                long endTime = System.currentTimeMillis();
                long runningTime = endTime - startTime;
                double ts = (double) (runningTime) / 1000;
                threeTimeLabel.setText("the Running time is " +ts +"Seconds");
            } catch (NumberFormatException ex) {
                threeval.setText("Invalid input ");
            }
        }
    }
}
