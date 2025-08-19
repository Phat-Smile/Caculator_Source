
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Caculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Caculator");

        JLabel labelFirstNumber = new JLabel("First Number: ");
        labelFirstNumber.setBounds(50, 20, 100, 30);
        JTextField inputFirstnumber = new JTextField();
        inputFirstnumber.setBounds(180, 20, 150, 30);

        JLabel labelSecondNumber = new JLabel("Second Number: ");
        labelSecondNumber.setBounds(50, 80, 100, 30);
        JTextField inputSecondnumber = new JTextField();
        inputSecondnumber.setBounds(180, 80, 150, 30);

        JLabel labelResultNumber = new JLabel("Result: ");
        labelResultNumber.setBounds(50, 140, 100, 30);
        JTextField inputResultnumber = new JTextField();
        inputResultnumber.setBounds(180, 140, 150, 30);

        JButton add = new JButton("ADD");
        add.setBounds(50, 200, 60, 30);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(inputFirstnumber.getText());
                double num2 = Double.parseDouble(inputSecondnumber.getText());
                inputResultnumber.setText(num1 + num2 + "");
            }
        });

        JButton sub = new JButton("SUB");
        sub.setBounds(120, 200, 60, 30);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(inputFirstnumber.getText());
                double num2 = Double.parseDouble(inputSecondnumber.getText());
                inputResultnumber.setText(num1 - num2 + "");
            }
        });

        JButton mul = new JButton("MUL");
        mul.setBounds(190, 200, 60, 30);
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(inputFirstnumber.getText());
                double num2 = Double.parseDouble(inputSecondnumber.getText());
                inputResultnumber.setText(num1 * num2 + "");
            }
        }
        );

        JButton div = new JButton("DIV");
        div.setBounds(260, 200, 60, 30);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(inputFirstnumber.getText());
                double num2 = Double.parseDouble(inputSecondnumber.getText());
                if (num2 != 0) {
                    inputResultnumber.setText(num1 / num2 + "");
                } else {
                    inputResultnumber.setText("Div by 0");
                }

            }
        });

        JButton clear = new JButton("CLEAR");
        clear.setBounds(150, 260, 100, 50);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputFirstnumber.setText("");
                inputSecondnumber.setText("");
                inputResultnumber.setText("");
            }
        });

//      ADD into Frame
        frame.add(labelFirstNumber);
        frame.add(inputFirstnumber);
        frame.add(labelSecondNumber);
        frame.add(inputSecondnumber);
        frame.add(labelResultNumber);
        frame.add(inputResultnumber);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(clear);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
