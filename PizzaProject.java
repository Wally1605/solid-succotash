import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaProject extends JFrame {
    public JLabel greeting;
    //Start of sizes
    public JLabel sizes;
    public ButtonGroup s;
    public JRadioButton sPizza;
    public JRadioButton mPizza;
    public JRadioButton lPizza;
    public JRadioButton suPizza;
    //End of sizes

    //Toppings
    public JLabel toppings;
    public JLabel deal;
    public JCheckBox topping1;
    public JCheckBox topping2;
    public JCheckBox topping3;
    //End of toppings

    //Start of cheese option
    public JLabel cheese;
    public JCheckBox extraCheese;
    //End of cheese options

    //Start of drink options
    public JLabel bevOption;
    public ButtonGroup b;
    public JRadioButton sbev;
    public JRadioButton mbev;
    public JRadioButton lbev;
    //End of Drink options

    //Start of tip options
    public JLabel tipOption;
    public ButtonGroup t;
    public JRadioButton tip15;
    public JRadioButton tip20;
    public JRadioButton tip25;
    //End of tip options


    public JButton submit;
    public JLabel total;
    public double cost = 0;


    public PizzaProject() {

        setTitle("Big Y");
        setSize(190, 580);
        setLayout(new FlowLayout());
        Font bigFont = new Font("Arial", Font.BOLD, 12);
        greeting = new JLabel("Please construct your order!");
        greeting.setFont(bigFont);
        sizes = new JLabel("What size pizza?");
        s = new ButtonGroup();
        sPizza = new JRadioButton("Small Pizza($5)");
        mPizza = new JRadioButton("Medium Pizza($10)");
        lPizza = new JRadioButton("Large Pizza($15)");
        suPizza = new JRadioButton("Super Pizza($20)");
        s.add(sPizza);
        s.add(mPizza);
        s.add(lPizza);
        s.add(suPizza);


        add(greeting);
        add(sizes);
        add(sPizza);
        add(mPizza);
        add(lPizza);
        add(suPizza);


        toppings = new JLabel("What toppings would you like?");
        deal = new JLabel("(Deal: 3 toppings for $1.25!)");
        topping1 = new JCheckBox("Pepperoni");
        topping2 = new JCheckBox("Mushrooms");
        topping3 = new JCheckBox("Green Peppers");
        submit = new JButton("Submit");
        total = new JLabel("Total: ");
        submitListener listener = new submitListener();
        submit.addActionListener(listener);


        add(toppings);
        add(deal);
        add(topping1);
        add(topping2);
        add(topping3);

        cheese = new JLabel("Would you like extra cheese?");
        extraCheese = new JCheckBox("Extra Cheese(+$0)");

        add(cheese);
        add(extraCheese);
        bevOption = new JLabel("Would you like to add a drink?");
        b = new ButtonGroup();
        sbev = new JRadioButton("Small(+$4)");
        mbev = new JRadioButton("Medium(+$4.50)");
        lbev = new JRadioButton("Large(+$5.50)");
        b.add(sbev);
        b.add(mbev);
        b.add(lbev);

        add(bevOption);
        add(sbev);
        add(mbev);
        add(lbev);

        tipOption = new JLabel("Choose the amount of tip:");
        t = new ButtonGroup();
        tip15 = new JRadioButton("15%");
        tip20 = new JRadioButton("20%");
        tip25 = new JRadioButton("25%");
        t.add(tip15);
        t.add(tip20);
        t.add(tip25);

        add(tipOption);
        add(tip15);
        add(tip20);
        add(tip25);


        add(submit);
        add(total);


        setVisible(true);
    }

    public class submitListener extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Sizes Prices
            if (sPizza.isSelected()) {
                cost = 5;
            } else if (mPizza.isSelected()) {
                cost = 10;
            } else if (lPizza.isSelected()) {
                cost = 15;
            } else if (suPizza.isSelected()) {
                cost = 20;
            }
            //End of size prices
            //Start of Prices for toppings
            if (topping1.isSelected() && topping2.isSelected() && topping3.isSelected()) {
                cost += 1.25;
            } else {
                if (topping1.isSelected()) {
                    cost += .50;
                }
                if (topping2.isSelected()) {
                    cost += .50;
                }
                if (topping3.isSelected()) {
                    cost += .50;
                }
            }
            //End of prices for toppings
            //Start of prices for beverages
            if (sbev.isSelected()) {
                cost += 4;
            } else if (mbev.isSelected()) {
                cost += 4.50;
            } else if (lbev.isSelected()) {
                cost += 5.50;
            }
            if(tip15.isSelected()){
                cost += cost*.15;
            }else if(tip20.isSelected()){
                cost += cost*.20;
            }else if(tip25.isSelected()){
                cost += cost*.25;
            }
            //End of prices for beverages
            //Final calculation and end of "if" statements
            total.setText("Total: $"+Math.round(cost*100)/100D);
        }
    }
        //Main function
        public static void main(String[] args) {
            PizzaProject app = new PizzaProject();
        }

    }
