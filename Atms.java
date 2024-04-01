import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Atms extends JFrame implements ActionListener {
    private JLabel balanceLabel;
    private JTextField withdrawField;
    private JTextField depositField;
    private AtmUser atmUser;

    public Atms() {
        super("ATM Machine");
        atmUser = new AtmUser();
        atmUser.setBalance(77777777);

        // Create components
        balanceLabel = new JLabel("Your balance: $" + atmUser.getBalance());
        JLabel withdrawLabel = new JLabel("Enter amount to withdraw: ");
        withdrawField = new JTextField(10);
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);

        JLabel depositLabel = new JLabel("Enter amount to deposit: ");
        depositField = new JTextField(10);
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);

        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.addActionListener(this);

        // Set layout
        setLayout(new GridLayout(5, 2));

        // Add components to the frame
        add(balanceLabel);
        add(new JLabel("")); // Empty label for spacing
        add(withdrawLabel);
        add(withdrawField);
        add(withdrawButton);
        add(new JLabel("")); // Empty label for spacing
        add(depositLabel);
        add(depositField);
        add(depositButton);
        add(checkBalanceButton);

        // Set frame properties
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Withdraw")) {
            double withdrawAmount = Double.parseDouble(withdrawField.getText());
            if (atmUser.withdrawal(withdrawAmount)) {
                JOptionPane.showMessageDialog(this, "Withdrawal Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient funds!! Please try again");
            }
            balanceLabel.setText("Your balance: $" + atmUser.getBalance());
            withdrawField.setText("");
        } else if (e.getActionCommand().equals("Deposit")) {
            double depositAmount = Double.parseDouble(depositField.getText());
            atmUser.deposit(depositAmount);
            JOptionPane.showMessageDialog(this, "Deposit Successful!");
            balanceLabel.setText("Your balance: $" + atmUser.getBalance());
            depositField.setText("");
        } else if (e.getActionCommand().equals("Check Balance")) {
            JOptionPane.showMessageDialog(this, "Your balance: $" + atmUser.getBalance());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Atms::new);
    }
}
