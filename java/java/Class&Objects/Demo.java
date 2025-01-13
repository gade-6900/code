import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Bank Account Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and add components to the frame
        JLabel titleLabel = new JLabel("Welcome to Bank Login");
        titleLabel.setBounds(100, 20, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(titleLabel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 25);
        frame.add(userLabel);

        JTextField userTextField = new JTextField();
        userTextField.setBounds(150, 80, 180, 25);
        frame.add(userTextField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 100, 25);
        frame.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 120, 180, 25);
        frame.add(passField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 170, 100, 30);
        frame.add(loginButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 220, 300, 25);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(messageLabel);

        // Add action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passField.getPassword());

                // Hardcoded username and password
                if (username.equals("user123") && password.equals("pass123")) {
                    messageLabel.setText("Login Successful!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid username or password.");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Set frame to visible
        frame.setVisible(true);
    }
}
